package com.example.hesapmakinesidev;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected TextView result;
    protected Button ac,isaret,yuzde,bolme,carp,cikar,topla,esit,nokta,bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,sifir;
    protected boolean top,cik,crp,bol,yuz;
    protected float birinci,ikinci;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topla=findViewById(R.id.topla);
        cikar=findViewById(R.id.cikar);
        carp=findViewById(R.id.carp);
        bolme=findViewById(R.id.bol);
        ac=findViewById(R.id.ac);
        isaret=findViewById(R.id.isaret);
        yuzde=findViewById(R.id.yuzde);
        esit=findViewById(R.id.esit);
        bir=findViewById(R.id.bir);
        iki=findViewById(R.id.iki);
        uc=findViewById(R.id.uc);
        dort=findViewById(R.id.dort);
        bes=findViewById(R.id.bes);
        alti=findViewById(R.id.alti);
        yedi=findViewById(R.id.yedi);
        sekiz=findViewById(R.id.sekiz);
        dokuz=findViewById(R.id.dokuz);
        sifir=findViewById(R.id.sifir);
        nokta=findViewById(R.id.nokta);
        result=findViewById(R.id.result);

        bir.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");}
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        sifir.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        nokta.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                result.setText(" ");
            }
        });
        isaret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {result.setText(result.getText()+"-");

            }
        });
        topla.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText(" ");
                }else{
                    birinci=Float.parseFloat(result.getText()+" ");
                    top=true;
                    result.setText(null);
                }
            }
        });
        cikar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText(" ");
                }else{
                birinci=Float.parseFloat(result.getText()+" ");
                cik=true;
                result.setText(null);}
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText(" ");
                }else{
                birinci=Float.parseFloat(result.getText()+" ");
                crp=true;
                result.setText(null);}
            }
        });
        bolme.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText(" ");
                }else{
                birinci=Float.parseFloat(result.getText()+" ");
                bol=true;
                result.setText(null);}
            }
        });
        yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText(" ");
                }else{
                    birinci=Float.parseFloat(result.getText()+" ");
                    yuz=true;
                    result.setText(null);
                }
            }
        });
        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ikinci=Float.parseFloat(result.getText()+" ");
                if(top==true){
                    result.setText(birinci+ikinci+" ");
                    top=false;
                }else if(cik==true){
                    result.setText(birinci-ikinci+" ");
                    cik=false;
                }else if(crp==true){
                    result.setText(birinci*ikinci+" ");
                    crp=false;
                }else if (bol==true){
                    result.setText(birinci/ikinci+" ");
                    bol=false;
                }else if(yuz==true){
                    result.setText((birinci/100)*ikinci+" ");
                    yuz=false;
                }
            }
        });
        


    }

    public void click(View view) {



    }
}