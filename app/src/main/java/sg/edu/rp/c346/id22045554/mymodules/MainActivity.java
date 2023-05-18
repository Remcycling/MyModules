package sg.edu.rp.c346.id22045554.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC206;
    TextView tvC203;
    TextView tvC218;
    TextView tvC235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.C346);
        tvC206 = findViewById(R.id.C206);
        tvC203 = findViewById(R.id.C203);
        tvC218 = findViewById(R.id.C218);
        tvC235 = findViewById(R.id.C235);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("ven", "E65A");

                startActivity(intent);


            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("ven", "W65D");
                startActivity(intent);

            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name", "UI/UX Design");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("ven", "W65D");
                startActivity(intent);

            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "Web Development in Php");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("ven", "W65D");
                startActivity(intent);

            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("ven", "W65D");
                startActivity(intent);

            }
        });






    }
}