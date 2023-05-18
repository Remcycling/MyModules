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
         Module module = (Module) intentReceived.getSerializableExtra("mod");





        tvAnswer.setText("Module code: "+ module.code + "\nModule name: " + module.name + "\nYear: "+
                module.year + "\nSemester: "+ module.sem + "\nCredit: "+ module.cred + "\nVenue: "+ module.ven);



    }
}