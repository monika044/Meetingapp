package com.example.admin.schedulemeeting.model;

public class Meeting {

    private String topic;
    private String duration;
    private String date;
    private String time;

    public Meeting(String topic, String duration, String date, String time){

        this.topic=topic;
        this.duration=duration;
        this.date=date;
        this.time=time;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
