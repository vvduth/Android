package org.mycode.uibasic;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private ListView citiesList ;
   private Spinner studentsSpinner;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentsSpinner  = findViewById(R.id.studentsSpinner);


       /* final ArrayList<String> students = new ArrayList<>();
        students.add("Duc");
        students.add("Sarah");
        students.add("Mason");
        students.add("Kyle");
        students.add("Raheem");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item,
                students
        );

        studentsSpinner.setAdapter(studentsAdapter);  */

        final ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tampere");
        cities.add("Manchester");
        cities.add("Sydney");
        cities.add("Kansas");




        //Pass the data from Array list to the listview
        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
             this,
             android.R.layout.simple_list_item_1,
             cities
     );

     citiesList.setAdapter(citiesAdapter);

     studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,studentsSpinner.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });

     citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(MainActivity.this, cities.get(position)+ " Selected",Toast.LENGTH_SHORT).show();
         }
     });


    }
}