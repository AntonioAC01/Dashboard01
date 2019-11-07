package com.velasuez.dashboard01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.anychart.APIlib;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.chart.common.listener.Event;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AnyChartView anyChartView1=findViewById(R.id.charview1);
        APIlib.getInstance().setActiveAnyChartView(anyChartView1);
        final Pie pie= AnyChart.pie();
        
        pie.setOnClickListener(new ListenersInterface.OnClickListener() {
            @Override
            public void onClick(Event event) {
                Toast.makeText(MainActivity.this, "Datos", Toast.LENGTH_SHORT).show();
            }
        });

        List<DataEntry> dataEntries = new ArrayList<>();
        dataEntries.add(new ValueDataEntry("Manzanas",50));
        dataEntries.add(new ValueDataEntry("Peras",25));
        dataEntries.add(new ValueDataEntry("Otros",25));
        pie.data(dataEntries);

        pie.title("Frutas");
        anyChartView1.setChart(pie);



        final AnyChartView anyChartView2=findViewById(R.id.charview2);
        APIlib.getInstance().setActiveAnyChartView(anyChartView2);
        final Pie pie1= AnyChart.pie();

        pie1.setOnClickListener(new ListenersInterface.OnClickListener() {
            @Override
            public void onClick(Event event) {
                Toast.makeText(MainActivity.this, "Datos", Toast.LENGTH_SHORT).show();
            }
        });

        List<DataEntry> dataEntries1 = new ArrayList<>();
        dataEntries1.add(new ValueDataEntry("Zapatillas",25));
        dataEntries1.add(new ValueDataEntry("Zapatos",25));
        dataEntries1.add(new ValueDataEntry("Short",25));
        dataEntries1.add(new ValueDataEntry("Zandalias",25));
        pie1.data(dataEntries1);

        pie1.title("Ropa");
        anyChartView2.setChart(pie1);
    }
}
