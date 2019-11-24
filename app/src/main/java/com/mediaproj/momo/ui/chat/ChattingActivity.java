package com.mediaproj.momo.ui.chat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.mediaproj.momo.R;
import com.mediaproj.momo.data.Message;
import com.mediaproj.momo.global.FirebaseManager;
import com.mediaproj.momo.global.MomoUtil;

import im.delight.android.identicons.Identicon;

import java.util.ArrayList;
import java.util.List;

public class ChattingActivity extends AppCompatActivity {

    List<Message> messageList;

    String roomId;
    String roomTitle;

    Adapter adapter;
    RecyclerView recyclerView;
    LinearLayout llInput;
    EditText etMessage;
    TextView btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);

        roomId = getIntent().getStringExtra("id");
        roomTitle = getIntent().getStringExtra("title");
        ((TextView) findViewById(R.id.tv_title)).setText(roomTitle);

        messageList = new ArrayList<>();
        adapter = new Adapter(messageList);

        recyclerView = findViewById(R.id.view_recycler);
        recyclerView.setAdapter(adapter);

        llInput = findViewById(R.id.ll_input);
        etMessage = llInput.findViewById(R.id.et_message);
        btnSend = llInput.findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etMessage.getText().toString().trim();
                if (!MomoUtil.isStringEmpty(text))
                    sendMessage(text);
            }
        });

        listen();
    }

    void listen() {
        FirebaseManager.getInstance().messagesRef.whereEqualTo("roomId", roomId).orderBy("time", Query.Direction.ASCENDING).addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if (e != null)
                    return;
                messageList.clear();
                for (QueryDocumentSnapshot doc : queryDocumentSnapshots) {
                    Message message = doc.toObject(Message.class);
                    messageList.add(message);
                }
                adapter.notifyDataSetChanged();
                recyclerView.smoothScrollToPosition(adapter.getItemCount());
            }
        });
    }

    void sendMessage(String text) {
        Message message = new Message(roomId, MomoUtil.getUserData().getName(), text, System.currentTimeMillis());
        FirebaseManager.getInstance().messagesRef.add(message).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                etMessage.setText("");
            }
        });
    }

    boolean isMyMessage(String name) {
        return name.equals(MomoUtil.getUserData().getName());
    }

    class Adapter extends RecyclerView.Adapter<ViewHolder> {
        private List<Message> messageList;

        Adapter(List<Message> messageList) {
            this.messageList = messageList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_message, viewGroup, false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            Message message = messageList.get(i);
            viewHolder.setItem(message);
        }

        @Override
        public int getItemCount() {
            return messageList.size();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        Message message;

        Identicon identicon;
        TextView tvName;
        TextView tvMessage;
        View leftBlank;
        View rightBlank;
        View messageBlank;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvMessage = itemView.findViewById(R.id.tv_message);
            leftBlank = itemView.findViewById(R.id.blank_left);
            rightBlank = itemView.findViewById(R.id.blank_right);
            messageBlank = itemView.findViewById(R.id.blank_message);
            identicon = itemView.findViewById(R.id.identicon);
        }

        void setItem(Message message) {
            this.message = message;
            setUi();
        }

        void setUi() {
            if (isMyMessage(message.getName())) {
                rightBlank.setVisibility(View.GONE);
                leftBlank.setVisibility(View.VISIBLE);
                tvName.setVisibility(View.GONE);
                messageBlank.setVisibility(View.VISIBLE);
                identicon.setVisibility(View.GONE);
            } else {
                rightBlank.setVisibility(View.VISIBLE);
                leftBlank.setVisibility(View.GONE);
                tvName.setVisibility(View.VISIBLE);
                tvName.setGravity(Gravity.LEFT);
                tvName.setText(message.getName());
                messageBlank.setVisibility(View.GONE);
                identicon.setVisibility(View.VISIBLE);
                identicon.show(message.getName());
            }
            tvMessage.setText(message.getText());
        }
    }
}
