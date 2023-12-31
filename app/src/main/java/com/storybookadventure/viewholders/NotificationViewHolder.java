package com.storybookadventure.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.storybookadventure.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotificationViewHolder extends RecyclerView.ViewHolder {

    public CircleImageView notificationIcon;
    public ImageView clearBtn;
    public TextView notificationTitle, notificationDescription, notificationDate, notificationTime;

    public NotificationViewHolder(@NonNull View itemView) {
        super(itemView);

        notificationIcon = itemView.findViewById(R.id.notificationIcon);
        clearBtn = itemView.findViewById(R.id.clearBtn);
        notificationTitle = itemView.findViewById(R.id.notificationTitle);
        notificationDescription = itemView.findViewById(R.id.notificationDescription);
        notificationDate = itemView.findViewById(R.id.notificationDate);
        notificationTime = itemView.findViewById(R.id.notificationTime);

    }
}
