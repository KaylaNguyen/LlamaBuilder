package com.kayvin.llamabuilder;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LlamaViewer extends Activity{
	
	ImageButton llama;
	String currentPic = "llama";

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_llama_viewer);
		final MediaPlayer mp = MediaPlayer.create(this, R.raw.goat);
		

		llama = (ImageButton) findViewById(R.id.LLAMA);
		llama.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mp.start();
				if(currentPic.equals("llama2")){
					llama.setImageResource(R.drawable.smilellama2);
					currentPic = "smilellama2";
				}
				else if(currentPic.equals("llama")){
					llama.setImageResource(R.drawable.smilellama);
					currentPic = "smilellama";
				}
				else if(currentPic.equals("smilellama2")){
					llama.setImageResource(R.drawable.llama2);
					currentPic = "llama2";
				}
				else{
					llama.setImageResource(R.drawable.llama);
					currentPic = "llama";
				}
			}
		});
	}
	
	public void showDifLlama(View view){
		if (currentPic.equals("llama") || currentPic.equals("smilellama")){
			llama.setImageResource(R.drawable.llama2);
			currentPic = "llama2";
		}
		else{
			llama.setImageResource(R.drawable.llama);
			currentPic = "llama";
		}
	}
}
