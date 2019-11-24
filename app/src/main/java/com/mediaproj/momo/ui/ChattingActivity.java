package com.mediaproj.momo.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mediaproj.momo.R;
import com.mediaproj.momo.data.Message;
import com.mediaproj.momo.global.MomoUtil;

import java.util.ArrayList;
import java.util.List;

public class ChattingActivity extends AppCompatActivity {

    List<Message> messageList;

    Adapter adapter;
    RecyclerView recyclerView;
    LinearLayout llInput;
    EditText etMessage;
    TextView btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);

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
                // 메시지 작성
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
        }

        void setItem(Message message) {
            this.message = message;
            setUi();
        }

        void setUi() {
            if (isMyMessage(message.getName())) {
                rightBlank.setVisibility(View.GONE);
                leftBlank.setVisibility(View.VISIBLE);
                tvName.setGravity(Gravity.RIGHT);
                messageBlank.setVisibility(View.VISIBLE);
            } else {
                rightBlank.setVisibility(View.VISIBLE);
                leftBlank.setVisibility(View.GONE);
                tvName.setGravity(Gravity.LEFT);
                messageBlank.setVisibility(View.GONE);
            }

            tvName.setText(message.getName());
            tvMessage.setText(message.getText());
        }
    }
}
