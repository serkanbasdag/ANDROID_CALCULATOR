package com.example.acerv17nitro.hesapmakinesiyeni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button  b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            bsin,bcos,btan,bsinh,bcosh,btanh,bkare,blog,bkarekok,byuzde,
            bbol,bcarp,bcikar,btopla,besit,bclear;


    TextView tv;
    int sayi1 = 0, sayi2 = 0;
    int sonuc = 0;
    double sonuc1 = 0;
    String sayi = "";
    String islem = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        btopla = findViewById(R.id.btopla);
        bcikar = findViewById(R.id.bcikar);
        bcarp = findViewById(R.id.bcarp);
        bbol = findViewById(R.id.bbol);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        bsinh = findViewById(R.id.bsinh);
        bcosh = findViewById(R.id.bcosh);
        btanh = findViewById(R.id.btanh);
        bkare = findViewById(R.id.bkare);
        bkarekok = findViewById(R.id.bkarekok);
        blog = findViewById(R.id.blog);
        besit = findViewById(R.id.besit);
        bclear = findViewById(R.id.bclear);
        byuzde = findViewById(R.id.byuzde);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        btopla.setOnClickListener(this);
        bcikar.setOnClickListener(this);
        bcarp.setOnClickListener(this);
        bbol.setOnClickListener(this);
        bsin.setOnClickListener(this);
        bcos.setOnClickListener(this);
        btan.setOnClickListener(this);
        bsinh.setOnClickListener(this);
        bcosh.setOnClickListener(this);
        btanh.setOnClickListener(this);
        bkare.setOnClickListener(this);
        bkarekok.setOnClickListener(this);
        blog.setOnClickListener(this);
        besit.setOnClickListener(this);
        bclear.setOnClickListener(this);
        byuzde.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == b0.getId())
        {
             sayi += "0";
             tv.setText(sayi);
        }
        if (v.getId() == b1.getId())
        {
            sayi += "1";
            tv.setText(sayi);
        }
        if (v.getId() == b2.getId())
        {
            sayi += "2";
            tv.setText(sayi);
        }
        if (v.getId() == b3.getId())
        {
            sayi += "3";
            tv.setText(sayi);
        }
        if (v.getId() == b4.getId())
        {
            sayi += "4";
            tv.setText(sayi);
        }
        if (v.getId() == b5.getId())
        {
            sayi += "5";
            tv.setText(sayi);
        }
        if (v.getId() == b6.getId())
        {
            sayi += "6";
            tv.setText(sayi);
        }
        if (v.getId() == b7.getId())
        {
            sayi += "7";
            tv.setText(sayi);
        }
        if (v.getId() == b8.getId())
        {
            sayi += "8";
            tv.setText(sayi);
        }
        if (v.getId() == b9.getId())
        {
            sayi += "9";
            tv.setText(sayi);
        }
        if(v.getId() == btopla.getId())
        {
            sayi1 = Integer.parseInt(tv.getText().toString());
            islem = "topla";
            sayi = "";
        }
        if(v.getId() == bcikar.getId())
        {
            sayi1 = Integer.parseInt(tv.getText().toString());
            islem = "cikar";
            sayi = "";
        }
        if(v.getId() == bcarp.getId())
        {
            sayi1 = Integer.parseInt(tv.getText().toString());
            islem = "carp";
            sayi = "";
        }
        if (v.getId() == bbol.getId()) {
            sayi1 = Integer.parseInt(tv.getText().toString());
            islem = "bol";
            sayi = "";
        }
        if(v.getId() == bsin.getId())
        {
            sonuc1 = Math.sin(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == bcos.getId())
        {
            sonuc1 = Math.cos(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == btan.getId())
        {
            sonuc1 = Math.tan(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == bsinh.getId())
        {
            sonuc1 = Math.sinh(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == bcosh.getId())
        {
            sonuc1 = Math.cosh(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == btanh.getId())
        {
            sonuc1 = Math.tanh(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == bkare.getId())
        {
            sonuc1 = Math.pow(Double.parseDouble(tv.getText().toString()),2);
            tv.setText(sonuc1+"");
        }
        if(v.getId() == bkarekok.getId())
        {
            sonuc1 = Math.sqrt(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == blog.getId())
        {
            sonuc1 = Math.log10(Double.parseDouble(tv.getText().toString()));
            tv.setText(sonuc1+"");
        }
        if(v.getId() == byuzde.getId())
        {
            sonuc1 = (Double.parseDouble(tv.getText().toString()))/100;
            tv.setText(sonuc1+"");
        }
        if(v.getId() == besit.getId())
        {
            switch (islem){
                case "topla":
                    sayi2 = Integer.parseInt(tv.getText().toString());
                    sonuc = sayi1 + sayi2;
                    tv.setText(sonuc+"");
                    islem ="";
                    break;
                case "cikar":
                    sayi2 = Integer.parseInt(tv.getText().toString());
                    sonuc = sayi1 - sayi2;
                    tv.setText(sonuc+"");
                    islem ="";
                    break;

                case "carp":
                    sayi2 = Integer.parseInt(tv.getText().toString());
                    sonuc = sayi1 * sayi2;
                    tv.setText(sonuc+"");
                    islem ="";
                    break;

                case "bol":
                    sayi2 = Integer.parseInt(tv.getText().toString());
                    sonuc = sayi1 / sayi2;
                    tv.setText(sonuc+"");
                    islem ="";
                    break;
            }
        }
        if(v.getId() == bclear.getId())
        {
            tv.setText("0");
            sayi="";
            islem="";
        }
    }
}
