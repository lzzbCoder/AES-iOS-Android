package com.test.aesforandroid;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AES mAes = new AES();
	
		String mString = "神奇的AES";
		byte[] mBytes = null;
		
		
		try {
			mBytes = mString.getBytes("UTF8");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		String enString = mAes.encrypt(mBytes);
		Log.i("aes123", enString);
		String deString = mAes.decrypt(enString);
		Log.i("aes123", deString);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
