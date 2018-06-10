package com.rv.xylophone;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.rtp.AudioStream;
import android.renderscript.RenderScript;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    final static int NO_OF_SIMOUS_SOUND = 7;
    final static float LEFTSOUND = 1.0f;
    final static float RIGHTSOUND = 1.0f;
    final static int PRIORITY = 0;
    final static int LOOP = 0;
    final static float NORMAL_PLAY_RATE = 1.0f;


    private int mCSOUND;
    private int mDCSOUND;
    private int mESOUND;
    private int mFSOUND;
    private int mGSOUND;
    private int mASOUND;
    private int mBSOUND;
    private SoundPool soundPool;

    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.lay);

        soundPool = new SoundPool(NO_OF_SIMOUS_SOUND, AudioManager.STREAM_MUSIC,0);
        mCSOUND = soundPool.load(this,R.raw.note1_c,1);
        mDCSOUND = soundPool.load(this,R.raw.note2_d,1);
        mESOUND = soundPool.load(this,R.raw.note3_e,1);
        mFSOUND = soundPool.load(this,R.raw.note4_f,1);
        mGSOUND = soundPool.load(this,R.raw.note5_g,1);
        mASOUND = soundPool.load(this,R.raw.note6_a,1);
        mBSOUND = soundPool.load(this,R.raw.note7_b,1);

    }

    public void playC(View view) {
        soundPool.play(mCSOUND, LEFTSOUND, RIGHTSOUND, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }


    public void playD(View view) {
        soundPool.play(mDCSOUND, LEFTSOUND,RIGHTSOUND,PRIORITY,LOOP,NORMAL_PLAY_RATE);


    }

    public void playE(View view) {
        soundPool.play(mESOUND, LEFTSOUND,RIGHTSOUND,PRIORITY,LOOP,NORMAL_PLAY_RATE);

    }

    public void playF(View view) {

        soundPool.play(mFSOUND, LEFTSOUND,RIGHTSOUND,PRIORITY,LOOP,NORMAL_PLAY_RATE);

    }

    public void playG(View view) {

        soundPool.play(mGSOUND, LEFTSOUND,RIGHTSOUND,PRIORITY,LOOP,NORMAL_PLAY_RATE);

    }

    public void playA(View view) {
        soundPool.play(mASOUND, LEFTSOUND,RIGHTSOUND,PRIORITY,LOOP,NORMAL_PLAY_RATE);

    }

    public void playB(View view) {
        soundPool.play(mBSOUND, LEFTSOUND,RIGHTSOUND,PRIORITY,LOOP,NORMAL_PLAY_RATE);

    }

}
