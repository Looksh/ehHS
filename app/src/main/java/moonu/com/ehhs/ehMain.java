package moonu.com.ehhs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import com.tistory.itmir.example.androidmeallibrary.R;

import ehHS.MainActivity;

public class ehMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView1 = findViewById(R.id.cardview_info);
        cardView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://eunhaeng.hs.kr"));
                        startActivity(intent);
                    }
                }
        );
        CardView cardView2 = findViewById(R.id.cardview_meal);
        cardView2.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
        CardView cardView3 = findViewById(R.id.cardview_setting);
        cardView3.setOnClickListener(new Button.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),SettingActivity.class);
                        startActivity(intent);
                    }
                }
        );
        }
    }
