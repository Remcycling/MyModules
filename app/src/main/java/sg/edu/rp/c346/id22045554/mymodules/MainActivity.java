package sg.edu.rp.c346.id22045554.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

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

        Module[] modArr = new Module[5];
        modArr[0] = new Module("C346","Android Programming",2023,1,4,"E65A");
        modArr[1] = new Module("C206","Software Development Process",2023,1,4,"W65D");
        modArr[2] = new Module("C218","UI/UX Design",2023,1,4,"W65D");
        modArr[3] = new Module("C203","Web Development in Php",2023,1,4,"W65D");
        modArr[4] = new Module("C235","IT Security and Management",2023,1,4,"W65D");




        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);


                intent.putExtra("mod",modArr[0]);



                startActivity(intent);


            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mod",modArr[1]);
                startActivity(intent);

            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mod",modArr[2]);
                startActivity(intent);

            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mod",modArr[3]);
                startActivity(intent);

            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mod",modArr[4]);
                startActivity(intent);

            }
        });






    }
}