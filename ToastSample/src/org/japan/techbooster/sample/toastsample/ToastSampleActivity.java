package org.japan.techbooster.sample.toastsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class ToastSampleActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //ここからToast表示の処理
//        Toast toast = Toast.makeText(this, "Toast example", Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER|Gravity.LEFT, 0, 0);
//        toast.show();
        
        //一行で表示してみる
        Toast.makeText(this, "Toast example", Toast.LENGTH_LONG).show();
    }
}