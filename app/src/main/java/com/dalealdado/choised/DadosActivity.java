package com.dalealdado.choised;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dalealdado.dalealdado.R;
import com.dalealdado.choised.shake.ShakeDetector;

import java.util.Random;

public class DadosActivity extends AppCompatActivity {
    Random r = new Random();
    MediaPlayer mp;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;

    String[] cien = {"00", "10", "20", "30", "40", "50", "60", "70", "80", "90"};
    TextView tirar6;
    TextView tirar4;
    TextView tirar8;
    TextView tirar10;
    TextView tirar12;
    TextView tirar20;
    TextView tirar100;
    TextView tirar100u;
    final int delay = 150;
    MutableLiveData<Integer> valor6 = new MutableLiveData<>();
    MutableLiveData<Integer> valor4 = new MutableLiveData<>();
    MutableLiveData<Integer> valor8 = new MutableLiveData<>();
    MutableLiveData<Integer> valor10 = new MutableLiveData<>();
    MutableLiveData<Integer> valor12 = new MutableLiveData<>();
    MutableLiveData<Integer> valor20 = new MutableLiveData<>();
    MutableLiveData<Integer> valor100 = new MutableLiveData<>();
    MutableLiveData<Integer> valor100u = new MutableLiveData<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
        mp = MediaPlayer.create(this, R.raw.tirar);

        tirar6 = findViewById(R.id.dado6tv);
        tirar4 = findViewById(R.id.dado4tv);
        tirar8 = findViewById(R.id.dado8tv);
        tirar10 = findViewById(R.id.dado10tv);
        tirar12 = findViewById(R.id.dado12tv);
        tirar20 = findViewById(R.id.dado20tv);
        tirar100 = findViewById(R.id.dado100tv);
        tirar100u = findViewById(R.id.dadosptv);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager
                .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {

            @Override
            public void onShake(int count) {

                Vibrator vibrator = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(500);
                /*
                 * The following method, "handleShakeEvent(count):" is a stub //
                 * method you would use to setup whatever you want done once the
                 * device has been shook.
                 */
//                tvShake.setText("Shake Action is just detected!!");
                Toast.makeText(DadosActivity.this, "Tirando dados", Toast.LENGTH_SHORT).show();

                mp.start();
                tirarDado6(tirar6);
                tirarDado4(tirar4);
                tirarDado8(tirar8);
                tirarDado10(tirar10);
                tirarDado12(tirar12);
                tirarDado20(tirar20);
                tirarDado100(tirar100);
                tirarDado100u(tirar100u);
               // valor6.postValue(r.nextInt(6) + 1);
//
//            serviceActivity.tirar6.setText(String.valueOf(valor6));

               // int color = Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256));
               // tirar6.setText(String.valueOf(valor6));
            }
        });


    }

    public void tirarDado6(View view) {
        mp.start();
        final TextView tirar6 = findViewById(R.id.dado6tv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
                public void run() {
                    valor6.postValue(r.nextInt(6) + 1);
                    if(count < 6) {
                        handler.postDelayed(this, delay);
                        count++;
                    }
                }
            };

        handler.postDelayed(runnable, delay);

        valor6.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar6.setText(String.valueOf(integer));
            }
        });
    }


    public void tirarDado4(View view) {
        mp.start();
        final TextView tirar4 = findViewById(R.id.dado4tv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            public void run() {
                valor4.postValue(r.nextInt(4) + 1);
                if(count < 6) {
                    handler.postDelayed(this, delay);
                    count++;
                }
            }
        };

        handler.postDelayed(runnable, delay);

        valor4.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar4.setText(String.valueOf(integer));
            }
        });
    }

    public void tirarDado8(View view) {
        mp.start();
        final TextView tirar8 = findViewById(R.id.dado8tv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            public void run() {
                valor8.postValue(r.nextInt(8) + 1);
                if(count < 6) {
                    handler.postDelayed(this, delay);
                    count++;
                }
            }
        };

        handler.postDelayed(runnable, delay);

        valor8.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar8.setText(String.valueOf(integer));
            }
        });
    }

    public void tirarDado10(View view) {
        mp.start();
        final TextView tirar10 = findViewById(R.id.dado10tv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            public void run() {
                valor10.postValue(r.nextInt(10) + 1);
                if(count < 6) {
                    handler.postDelayed(this, delay);
                    count++;
                }
            }
        };

        handler.postDelayed(runnable, delay);

        valor10.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar10.setText(String.valueOf(integer));
            }
        });
    }

    public void tirarDado12(View view) {
        mp.start();
        final TextView tirar12 = findViewById(R.id.dado12tv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            public void run() {
                valor12.postValue(r.nextInt(12) + 1);
                if(count < 6) {
                    handler.postDelayed(this, delay);
                    count++;
                }
            }
        };

        handler.postDelayed(runnable, delay);

        valor12.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar12.setText(String.valueOf(integer));
            }
        });
    }

    public void tirarDado20(View view) {
        mp.start();
        final TextView tirar20 = findViewById(R.id.dado20tv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            public void run() {
                valor20.postValue(r.nextInt(20) + 1);
                if(count < 6) {
                    handler.postDelayed(this, delay);
                    count++;
                }
            }
        };

        handler.postDelayed(runnable, delay);

        valor20.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar20.setText(String.valueOf(integer));
            }
        });
    }

    public void tirarDado100(View view) {
        mp.start();
        final TextView tirar100 = findViewById(R.id.dado100tv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            public void run() {
                valor100.postValue(r.nextInt(10));
                if(count < 6) {
                    handler.postDelayed(this, delay);
                    count++;
                }
            }
        };

        handler.postDelayed(runnable, delay);

        valor100.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar100.setText(cien[integer]);
            }
        });
    }

    public void tirarDado100u(View view) {
        mp.start();
        final TextView tirar100u = findViewById(R.id.dadosptv);

        final Handler handler = new android.os.Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            public void run() {
                valor100u.postValue(r.nextInt(99) + 1);
                if(count < 6) {
                    handler.postDelayed(this, delay);
                    count++;
                }
            }
        };

        handler.postDelayed(runnable, delay);

        valor100u.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {
                tirar100u.setText(String.valueOf(integer));
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        // Add the following line to register the Session Manager Listener onResume
        mSensorManager.registerListener(mShakeDetector, mAccelerometer,	SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        // Add the following line to unregister the Sensor Manager onPause
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }
}

