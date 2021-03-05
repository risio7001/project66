package activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project66.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_test).setOnClickListener(onclickListener);
    }

    @SuppressLint("NonConstantResourceId")
    View.OnClickListener onclickListener = v -> {
        switch (v.getId()){
            case R.id.btn_test:
                goActivity();
                break;
        }
    };
    private void goActivity(){
        Intent intent = new Intent(this, Login_Activity.class);
        startActivity(intent);
    }
}