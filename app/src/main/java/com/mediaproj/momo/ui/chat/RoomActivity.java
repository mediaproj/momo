package com.mediaproj.momo.ui.chat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.mediaproj.momo.R;
import com.mediaproj.momo.data.Room;
import com.mediaproj.momo.global.MomoUtil;
import com.mediaproj.momo.global.Retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RoomActivity extends AppCompatActivity {

    List<Room> roomList;
    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        roomList = new ArrayList<>();
        adapter = new Adapter(roomList);

        recyclerView = findViewById(R.id.view_recycler);
        recyclerView.setAdapter(adapter);

        getRoomList();
    }

    void getRoomList() {
        Call<List<Room>> call = RetrofitClient.getApiService().getUserSchedule(MomoUtil.getUserData().getEmail());
        call.enqueue(new Callback<List<Room>>() {
            @Override
            public void onResponse(Call<List<Room>> call, Response<List<Room>> response) {
                roomList.clear();
                if (response.body() != null)
                    roomList.addAll(response.body());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Room>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    void openChattingRoom(Room room) {
        Intent intent = new Intent(RoomActivity.this, ChattingActivity.class);
        intent.putExtra("id", room.getId());
        intent.putExtra("title", room.getTitle());
        startActivity(intent);
    }

    class Adapter extends RecyclerView.Adapter<ViewHolder> {
        private List<Room> roomList;

        Adapter(List<Room> roomList) {
            this.roomList = roomList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_room, viewGroup, false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            Room room = roomList.get(i);
            viewHolder.setItem(room);
        }

        @Override
        public int getItemCount() {
            return roomList.size();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        Room room;

        TextView tvTitle;
        TextView tvEnabled;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvEnabled = itemView.findViewById(R.id.tv_enabled);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (room.isEnable())
                        openChattingRoom(room);
                    else
                        MomoUtil.showMessage(RoomActivity.this, getString(R.string.disabled_chat));
                }
            });
        }

        void setItem(Room room) {
            this.room = room;
            setUi();
        }

        void setUi() {
            tvTitle.setText(room.getTitle());
            tvEnabled.setText(room.isEnable() ? getString(R.string.enabled) : getString(R.string.disabled));
            tvEnabled.setTextColor(room.isEnable() ? Color.BLUE : Color.RED);
        }
    }
}
