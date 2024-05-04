package com.rozogar.hazaragi.ui.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
private ListView lv;
private ArrayList<Music> m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupView();
        filling();
        filadapter();




    }

    private void filadapter() {
        MyAdapter adapter = new MyAdapter(Home.this,R.layout.main,m);
        lv.setAdapter(adapter);
    }

    private void filling() {
        m = new ArrayList<>();
        m.add(new Music( R.drawable.a,R.raw.khantoma,"1- خنتوما"));
        m.add(new Music( R.drawable.ger,R.raw.mix,"2- میکس هزارگی"));
        m.add(new Music( R.drawable.fone,R.raw.jorajan,"3- جوره جانیم نموشی"));
        m.add(new Music( R.drawable.hi,R.raw.anaranar,"4- انار انار"));
        m.add(new Music( R.drawable.j,R.raw.delbar,"5- دلبر"));
        m.add(new Music( R.drawable.e,R.raw.azsharbaqarya,"6- از شار به قریه"));
        m.add(new Music( R.drawable.n,R.raw.khandida,"7- خندیده میآیی"));
        m.add(new Music( R.drawable.i,R.raw.daraeehazara,"8- دره هزاره"));
        m.add(new Music( R.drawable.m,R.raw.golandam,"9- گل اندام"));
        m.add(new Music( R.drawable.dd,R.raw.zendagi,"10- زندگی"));
        m.add(new Music( R.drawable.p,R.raw.remix1,"11- میکس 1"));
        m.add(new Music( R.drawable.g,R.raw.bashkinarm,"12- کنارم باش"));
        m.add(new Music( R.drawable.k,R.raw.dokhtaraknaz,"13- دخترک ناز"));
        m.add(new Music( R.drawable.h,R.raw.chagarma,"14- چگرمه"));
        m.add(new Music( R.drawable.r,R.raw.parizad,"15- پریزاد "));
        m.add(new Music( R.drawable.s,R.raw.safidi,"16- سفیدی مخملی"));
        m.add(new Music( R.drawable.b,R.raw.khoshnoma,"17- خوش نمایی"));
        m.add(new Music( R.drawable.q,R.raw.remix2,"18- میکس 2"));
        m.add(new Music( R.drawable.f,R.raw.balidel,"19- بلا دل"));
        m.add(new Music( R.drawable.aa,R.raw.sharabjan,"20- میده میده"));
        m.add(new Music( R.drawable.l,R.raw.eshqiman,"21- عشق من"));
        m.add(new Music( R.drawable.cute,R.raw.dokhtarihazara,"22- دخت هزاره"));
        m.add(new Music( R.drawable.o,R.raw.remix3,"23- میکس 3"));
        m.add(new Music( R.drawable.cc,R.raw.tokimaeee,"24- تو کی میآیی"));
        m.add(new Music( R.drawable.awal,R.raw.awal,"25- احوال بند دل"));










    }

    private void setupView() {
        lv = findViewById(R.id.lv);
    }
}