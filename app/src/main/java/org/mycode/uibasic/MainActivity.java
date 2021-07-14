package org.mycode.uibasic;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private CheckBox checkBoxHarryPotter, checkBoxHarryKane, checkBoxHarryStyles ;
   private RadioGroup rgMaritalStatus;

   private ProgressBar progressBar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //check boxes
        checkBoxHarryPotter = findViewById(R.id.checkboxHarry);
        checkBoxHarryKane = findViewById(R.id.checkboxHarryKane);
        checkBoxHarryStyles = findViewById(R.id.checkboxHarryStyles);

        //radio buttons
        rgMaritalStatus = findViewById((R.id.rgMaritalStatus));

        //progress bar
        progressBar = findViewById(R.id.progressBar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);


                }
            }
        });

        thread.start();


       /*int checkButton =  rgMaritalStatus.getCheckedRadioButtonId();
        switch (checkButton){}*/  //for checkinng the button before clicking it hehehe

        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "You are married",Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.VISIBLE);
                        break ;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "No one is gonnna love you", Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.GONE);
                        break;
                    case R.id.inRelationship:
                        Toast.makeText(MainActivity.this, "You are in love", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        if(checkBoxHarryPotter.isChecked()){
            Toast.makeText(MainActivity.this, "You choose Potter", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You do not choose Potter", Toast.LENGTH_SHORT).show();

        }

        //check and listen to the check box is selected or not
        checkBoxHarryPotter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "You choose Potter", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You do not choose Potter", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}