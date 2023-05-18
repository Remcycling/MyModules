package sg.edu.rp.c346.id22045554.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        String ven = intentReceived.getStringExtra("ven");
        int year = intentReceived.getIntExtra("year", 0);
        int sem = intentReceived.getIntExtra("sem", 0);
        int cred = intentReceived.getIntExtra("cred", 0);


        tvAnswer.setText("Module code: "+ code + "\nModule name: " + name + "\nYear: "+ year +
                "\nSemester:" + sem + "\nCredit: "+ cred + "\nVenue: " + ven);



    }
}