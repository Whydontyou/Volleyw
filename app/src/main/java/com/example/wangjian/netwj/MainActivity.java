package com.example.wangjian.netwj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.VolleyError;
import com.example.netwj.RequestListener;
import com.example.netwj.RequestParams;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestData1();
    }
    private void requestData1() {
        RequestParams params = new RequestParams();
        params.put("参数", "值");
        params.put("参数", "值");
        App.getRequestInstance().post("url", this, params, new RequestListener() {
            @Override
            public void requestSuccess(String json) {
                String jaosn=json;
            }

            @Override
            public void requestError(VolleyError e, String error) {

            }

            @Override
            public void noInternet(VolleyError e, String error) {

            }
        });


        App.getRequestInstance().get(MainActivity.this, "http://www.sparta.vc/api/Sparta/", new RequestListener() {
            @Override
            public void requestSuccess(String json) {

                String res = json;

            }

            @Override
            public void requestError(VolleyError e, String error) {
                String asda = error.toString();
            }

            @Override
            public void noInternet(VolleyError e, String error) {

            }
        });

    }
}
