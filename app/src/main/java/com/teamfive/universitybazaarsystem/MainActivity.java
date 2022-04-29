package com.teamfive.universitybazaarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goSales(View view)
    {
        intent = new Intent(this, SalesActivity.class);
        startActivity(intent);
    }
    public void goLoans(View view)
    {
        intent = new Intent(this, LoanActivity.class);
        startActivity(intent);
    }
    public void goExchange(View view)
    {
        intent = new Intent(this, ExchangeActivity.class);
        startActivity(intent);
    }
    public void goHistory(View view)
    {
        intent = new Intent(this, ItemshistoryActivity.class);
        startActivity(intent);
    }
}