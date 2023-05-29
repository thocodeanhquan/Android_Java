package com.example.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    TextView textView_phepTinh, textView_ketQua;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    Button btn_phepCong, btn_phepTru, btn_phepNhan, btn_PhepChia, btn_phanTram, btn_C, btn_AC, btn_dauBang, btn_dauPhay;
    
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"9");
            }
        });

        btn_phanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"%");
            }
        });
//
//        btn_ngoac2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                data = textView_phepTinh.getText().toString();
//                textView_phepTinh.setText(data+")");
//            }
//        });

        btn_dauPhay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+".");
            }
        });

        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_phepTinh.setText("");
                textView_ketQua.setText("");
            }
        });

        btn_phepCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"+");
            }
        });

        btn_phepTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"-");
            }
        });

        btn_phepNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"*");
            }
        });

        btn_PhepChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();
                textView_phepTinh.setText(data+"÷");
            }
        });

        btn_dauBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = textView_phepTinh.getText().toString();

                data = data.replaceAll("x", "*");
                data = data.replaceAll("÷", "/");
                data = data.replaceAll("%", "/100");

                Context rhioContext= Context.enter();
                rhioContext.setOptimizationLevel(-1);

                String ketquacuoicung="";

                try {
                    Scriptable scriptable = rhioContext.initStandardObjects();
                    ketquacuoicung = rhioContext.evaluateString(scriptable, data,"Javsscript", 1, null).toString();
                }catch (Exception e){
                    ketquacuoicung = "Lỗi";
                }
                textView_ketQua.setText(ketquacuoicung);
            }
        });
    }

    private void anhXa(){
        textView_phepTinh = findViewById(R.id.textView_phepTinh);
        textView_ketQua = findViewById(R.id.textView_ketQua);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_AC = findViewById(R.id.btn_Ac);
        btn_C = findViewById(R.id.btn_C);

        btn_phepCong = findViewById(R.id.btn_phepCong);
        btn_phepTru = findViewById(R.id.btn_phepTru);
        btn_phepNhan = findViewById(R.id.btn_phepNhan);
        btn_PhepChia = findViewById(R.id.btn_phepChia);

        btn_dauBang = findViewById(R.id.btn_dauBang);
        btn_dauPhay = findViewById(R.id.btn_dauPhay);
        btn_phanTram = findViewById(R.id.btn_phanTram);
//        btn_ngoac2 = findViewById(R.id.btn_ngoac2);

    }


}