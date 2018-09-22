package com.example.admin.schedulemeeting;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.admin.schedulemeeting.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class Meeting extends ArrayAdapter<Meeting> {

    private Context mcontext;
    int mResource;

    public Meeting(@NonNull Context context, int resource, @NonNull List<Meeting> arrayList) {
        super(context, resource,arrayList);
        mcontext = context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        String topic = getItem(position).getTopic();
        String date = getItem(position).getDate();

        String duration = getItem(position).getDuration();
        String time=getItem(position).getTime();

        Meeting meeting=new Meeting(topic,duration,date,time);

        LayoutInflater layoutInflater=LayoutInflater.from(mcontext);

        convertView = layoutInflater.inflate(mResource,parent,false);


        TextView topicMeeting=(TextView)convertView.findViewById(R.id.tv1);
        TextView dateMeeting=(TextView)convertView.findViewById(R.id.tv2);
        TextView timeMeeting=(TextView)convertView.findViewById(R.id.tv3);
        TextView durationMeeting=(TextView)convertView.findViewById(R.id.tv4);

        topicMeeting.setText(topic);
        dateMeeting.setText(date);
        timeMeeting.setText(time);
        durationMeeting.setText(duration);

        return convertView;




    }


}
