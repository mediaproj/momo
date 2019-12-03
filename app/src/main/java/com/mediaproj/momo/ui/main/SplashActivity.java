//package com.mediaproj.momo.ui.main;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//
//import com.mediaproj.momo.R;
//
//
//public class SplashActivity extends Activity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//        startLoading();
//    }
//    private void startLoading() {
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                finish();
//            }
//        }, 5000);
//    }
//    private class splashhandler implements Runnable{
//        public void run(){
//            startActivity(new Intent(getApplication(), SplashActivity.class)); //로딩이 끝난 후, ChoiceFunction 이동
//            SplashActivity.this.finish(); // 로딩페이지 Activity stack에서 제거
//        }
//    }
//
//    @Override
//    public void onBackPressed() {
//        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
//    }
//
//}
//
//
