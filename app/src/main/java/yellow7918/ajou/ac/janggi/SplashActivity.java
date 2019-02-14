package yellow7918.ajou.ac.janggi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
//            Thread.sleep(2000); //대기초 설정
            Thread.sleep(10);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,LoginActivity.class));
//        startActivity(new Intent(this,MainActivity.class));
        finish();
        }
    }
