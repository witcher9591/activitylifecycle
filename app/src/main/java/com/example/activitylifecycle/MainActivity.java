package com.example.activitylifecycle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "Status:Creating", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "Status:Starting", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "Status:Pausing", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, "Status:Stopping", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, "Status:Re-Starting", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "Status:Destroying", Toast.LENGTH_SHORT).show();
	}
}