package com.storybookadventure.models;

public class Notification {
    private int notification_id;
    private String notification_name;
    private String notification_description;
    private String notification_date;
    private String notification_time;
    private String notification_image;

    public Notification() {
    }

    public Notification(int notification_id, String notification_name, String notification_description, String notification_date, String notification_time, String notification_image) {
        this.notification_id = notification_id;
        this.notification_name = notification_name;
        this.notification_description = notification_description;
        this.notification_date = notification_date;
        this.notification_time = notification_time;
        this.notification_image = notification_image;
    }

    public int getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(int notification_id) {
        this.notification_id = notification_id;
    }

    public String getNotification_name() {
        return notification_name;
    }

    public void setNotification_name(String notification_name) {
        this.notification_name = notification_name;
    }

    public String getNotification_description() {
        return notification_description;
    }

    public void setNotification_description(String notification_description) {
        this.notification_description = notification_description;
    }

    public String getNotification_date() {
        return notification_date;
    }

    public void setNotification_date(String notification_date) {
        this.notification_date = notification_date;
    }

    public String getNotification_time() {
        return notification_time;
    }

    public void setNotification_time(String notification_time) {
        this.notification_time = notification_time;
    }

    public String getNotification_image() {
        return notification_image;
    }

    public void setNotification_image(String notification_image) {
        this.notification_image = notification_image;
    }
}
