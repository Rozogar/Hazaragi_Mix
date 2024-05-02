package com.rozogar.hazaragi.ui.theme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Playpage extends AppCompatActivity {
    private ConstraintLayout llv;
private ImageView img1;
private ImageButton btnplay;
private ImageButton btnprevious;
private ImageButton btnnext;
private SeekBar seek;
private ArrayList<Music> n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playpage);
        setupView();
        youfill();

        

    }

    private void youfill() {

    }

    private void setupView() {
        img1 = findViewById(R.id.img1);
        btnnext = findViewById(R.id.btnnext);
        btnplay = findViewById(R.id.btnplay);
        btnprevious = findViewById(R.id.btnprevious);
        seek = findViewById(R.id.seek);
        llv = findViewById(R.id.llv);


    }

    private void filling() {
        n = new ArrayList<>();
        n.add(new Music( R.drawable.a,R.raw.khantoma,"خنتوما"));
        n.add(new Music( R.drawable.bb,R.raw.awal,"احوال بند دل"));
        n.add(new Music( R.drawable.c,R.raw.anaranar,"انار انار"));
        n.add(new Music( R.drawable.d,R.raw.mix,"میکس هزارگی"));
        n.add(new Music( R.drawable.e,R.raw.azsharbaqarya,"از شار به قریه"));
        n.add(new Music( R.drawable.f,R.raw.balidel,"بلا دل"));
        n.add(new Music( R.drawable.g,R.raw.bashkinarm,"کنارم باش"));
        n.add(new Music( R.drawable.h,R.raw.chagarma,"چگرمه"));
        n.add(new Music( R.drawable.i,R.raw.daraeehazara,"دره هزاره"));
        n.add(new Music( R.drawable.j,R.raw.delbar,"دلبر"));
        n.add(new Music( R.drawable.k,R.raw.dokhtaraknaz,"دخترک ناز"));
        n.add(new Music( R.drawable.l,R.raw.eshqiman,"عشق من"));
        n.add(new Music( R.drawable.m,R.raw.golandam,"گل اندام"));
        n.add(new Music( R.drawable.n,R.raw.khandida,"خندیده میآیی"));
        n.add(new Music( R.drawable.o,R.raw.khyalto,"خیال تو"));
        n.add(new Music( R.drawable.p,R.raw.remix1,"میکس 1"));
        n.add(new Music( R.drawable.q,R.raw.remix2,"میکس 2"));
        n.add(new Music( R.drawable.r,R.raw.parizad,"پریزاد "));
        n.add(new Music( R.drawable.s,R.raw.safidi,"سفیدی مخملی"));
        n.add(new Music( R.drawable.aa,R.raw.sharabjan,"میده میده"));
        n.add(new Music( R.drawable.cc,R.raw.tokimaeee,"تو کی میآیی"));
        n.add(new Music( R.drawable.dd,R.raw.zendagi,"زندگی"));
        n.add(new Music( R.drawable.b,R.raw.khoshnoma,"خوش نمایی"));
        n.add(new Music( R.drawable.b,R.raw.dokhtarihazara,"دخت هزاره"));



    }



}