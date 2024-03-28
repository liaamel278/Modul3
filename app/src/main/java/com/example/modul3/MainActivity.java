package com.example.modul3;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    AutoCompleteTextView ac;
    public String[] stringsdatafak = {"Fakultas Ekonomi", "Fakultas Kehutanan", "Fakultas Ilmu Koputer", "Faklutas Hukum"
    ,"Faklutas Keguruan dan Ilmu Pendidikan"};
    EditText lv;
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        ac=(AutoCompleteTextView) findViewById(R.id.dataautocomplete);
        ac.addTextChangedListener(this);
        ac.setAdapter((new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,stringsdatafak)));
    }
    public void pilihfakultas(View v){ lv=(EditText) findViewById(R.id.datalistview);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Data Fakultas Universitas Kuningan");
        builder.setItems(stringsdatafak, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                lv.setText(stringsdatafak[item]);
                dialog.dismiss();
            }

        }).show();
}
        public void onTextChanged(CharSequence s,int start, int before, int count) {}
        public void beforeTextChanged(CharSequence s, int start, int count, int after){}
    public void afterTextChanged(Editable s){}

            }

