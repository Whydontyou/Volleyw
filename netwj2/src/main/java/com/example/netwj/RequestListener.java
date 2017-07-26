package com.example.netwj;

/**
 * Created by wangjian on 2017/7/21.
 */

import com.android.volley.VolleyError;


public interface RequestListener  {

    /** 成功 */
    public void requestSuccess(String json);

    public void requestError(VolleyError e, String error);
    public void noInternet(VolleyError e, String error);
}
