package com.storybookadventure.adapters;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.storybookadventure.R;
import com.storybookadventure.activities.MainActivity;
import com.storybookadventure.models.Notification;
import com.storybookadventure.viewholders.NotificationViewHolder;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationViewHolder> {

    private Context context;
    private List<Notification> notificationList;

    public NotificationAdapter(Context context, List<Notification> notificationList) {
        this.context = context;
        this.notificationList = notificationList;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotificationViewHolder(LayoutInflater.from(context).inflate(R.layout.notification_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {

        Notification notification = notificationList.get(position);
        holder.notificationTitle.setText(notification.getNotification_name());
        holder.notificationDescription.setText(notification.getNotification_description());
        holder.notificationDate.setText(notification.getNotification_date());
        holder.notificationTime.setText(notification.getNotification_time());

        Glide.with(context).load(notification.getNotification_image()).placeholder(R.drawable.notification).into(holder.notificationIcon);

        holder.clearBtn.setOnClickListener(view -> {
            Toast.makeText(context, notification.getNotification_name()+" is clear", Toast.LENGTH_SHORT).show();
        });

        holder.itemView.setOnClickListener(view -> {
            final Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.notification_details_layout);
            dialog.setCancelable(true);

            TextView notificationName = dialog.findViewById(R.id.notificationName);
            TextView notificationDescription = dialog.findViewById(R.id.notificationDescription);
            TextView notificationDate = dialog.findViewById(R.id.notificationDate);
            TextView notificationTime = dialog.findViewById(R.id.notificationTime);
            ImageView cancelBtn = dialog.findViewById(R.id.cancelBtn);
            ImageView notificationImage = dialog.findViewById(R.id.notificationImage);

            notificationName.setText(notification.getNotification_name());
            notificationDescription.setText(notification.getNotification_description());
            notificationDate.setText(notification.getNotification_date());
            notificationTime.setText(notification.getNotification_time());
            Glide.with(context).load(notification.getNotification_image()).placeholder(R.drawable.notification).into(notificationImage);

            cancelBtn.setOnClickListener(view1 -> {
                dialog.dismiss();
            });

            dialog.show();
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            dialog.getWindow().setGravity(Gravity.CENTER_VERTICAL);

        });

    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }
}
