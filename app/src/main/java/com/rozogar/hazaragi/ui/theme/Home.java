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


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Home.this, Playpage.class);
                startActivity(intent);
            }
        });



    }

    private void filadapter() {
        MyAdapter adapter = new MyAdapter(Home.this,R.layout.main,m);
        lv.setAdapter(adapter);
    }

    private void filling() {
        m = new ArrayList<>();
        m.add(new Music( R.drawable.a,R.raw.khantoma,"خنتوما"));
        m.add(new Music( R.drawable.d,R.raw.mix,"میکس هزارگی"));
        m.add(new Music( R.drawable.bb,R.raw.awal,"احوال بند دل"));
        m.add(new Music( R.drawable.c,R.raw.anaranar,"انار انار"));
        m.add(new Music( R.drawable.j,R.raw.delbar,"دلبر"));
        m.add(new Music( R.drawable.e,R.raw.azsharbaqarya,"از شار به قریه"));
        m.add(new Music( R.drawable.n,R.raw.khandida,"خندیده میآیی"));
        m.add(new Music( R.drawable.i,R.raw.daraeehazara,"دره هزاره"));
        m.add(new Music( R.drawable.m,R.raw.golandam,"گل اندام"));
        m.add(new Music( R.drawable.dd,R.raw.zendagi,"زندگی"));
        m.add(new Music( R.drawable.p,R.raw.remix1,"میکس 1"));
        m.add(new Music( R.drawable.g,R.raw.bashkinarm,"کنارم باش"));
        m.add(new Music( R.drawable.k,R.raw.dokhtaraknaz,"دخترک ناز"));
        m.add(new Music( R.drawable.h,R.raw.chagarma,"چگرمه"));
        m.add(new Music( R.drawable.r,R.raw.parizad,"پریزاد "));
        m.add(new Music( R.drawable.s,R.raw.safidi,"سفیدی مخملی"));
        m.add(new Music( R.drawable.b,R.raw.khoshnoma,"خوش نمایی"));
        m.add(new Music( R.drawable.q,R.raw.remix2,"میکس 2"));
        m.add(new Music( R.drawable.f,R.raw.balidel,"بلا دل"));
        m.add(new Music( R.drawable.aa,R.raw.sharabjan,"میده میده"));
        m.add(new Music( R.drawable.l,R.raw.eshqiman,"عشق من"));
        m.add(new Music( R.drawable.bb,R.raw.dokhtarihazara,"دخت هزاره"));
        m.add(new Music( R.drawable.o,R.raw.khyalto,"خیال تو"));
        m.add(new Music( R.drawable.cc,R.raw.tokimaeee,"تو کی میآیی"));










    }

    private void setupView() {
        lv = findViewById(R.id.lv);
    }
}