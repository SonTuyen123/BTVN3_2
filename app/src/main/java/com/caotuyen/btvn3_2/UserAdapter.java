package com.caotuyen.btvn3_2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> mlistUser;


    public UserAdapter(List<User> mListUser) {
        this.mlistUser = mListUser;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View View = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new UserViewHolder(View);

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = mlistUser.get(position);
        if (user == null) {
            return;
        }
        holder.imgavatar.setImageResource(user.getResourceId());
        holder.tvName.setText(user.getName());
        holder.bacham.setImageResource(user.getBacham());

    }

    @Override
    public int getItemCount() {
        if (mlistUser != null) {
            return mlistUser.size();

        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgavatar;
        private TextView tvName;
        private ImageView bacham;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imgavatar = itemView.findViewById(R.id.img_1);
            tvName = itemView.findViewById(R.id.tv_tieude);
            bacham = itemView.findViewById(R.id.more);
        }
    }
}
