package com.rozogar.hazaragi.ui.theme;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter {
    private Context context;
    private int resource;
    private ArrayList<Music> m;
    private Music m1;
    private MediaPlayer currentsong = null;

    public MyAdapter(Context context, int resource, ArrayList<Music> m) {
        super(context, resource, m);
        this.context = context;
        this.resource = resource;
        this.m = m;
    }


    public int getCount() {
        return m.size();
    }


    public Object getItem(int position) {
        return m.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, parent, false);
            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Music m1 = m.get(position);
        holder.filling(m1);

        return convertView;
    }

    public class ViewHolder {
        ImageView imgpic;
        TextView txt;
        Button btnplay;
        Button btnstop;
        MediaPlayer player;

        public ViewHolder(View convertView) {
            imgpic = (ImageView) convertView.findViewById(R.id.imgpic);
            txt = (TextView) convertView.findViewById(R.id.txt);
            btnstop = (Button) convertView.findViewById(R.id.btnstop);
            btnplay = (Button) convertView.findViewById(R.id.btnplay);

        }


        public void filling(Music song1) {
            imgpic.setImageResource(song1.getImg());
            txt.setText(song1.getName().toString());

            btnplay.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    if (currentsong != null && currentsong.isPlaying()) {
                        currentsong.stop();
                        currentsong.release();
                    }

                    currentsong = MediaPlayer.create(context, song1.getSong());
                    currentsong.start();


                }

            });
            btnstop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (currentsong != null && currentsong.isPlaying()) {
                        currentsong.stop();
                    }
                }
            });
        }
    }


}
