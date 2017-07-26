package com.example.netwj;

/**
 * Created by wangjian on 2017/7/21. 进度条Fragment
 */

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


public class LoadingFragment extends DialogFragment {
    public static LoadingFragment sLoadingFragment;
    private String mMsg = "loading··";

    public LoadingFragment() {
    }
    public static LoadingFragment getInstance(){
        if (sLoadingFragment==null){
            sLoadingFragment=new LoadingFragment();
        }
        return sLoadingFragment;
    }
   /* @SuppressLint("InflateParams")
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.loading_ref, null);
        TextView mTvLoading = (TextView) view.findViewById(R.id.loading_text);
        mTvLoading.setText(mMsg);
        Dialog dialog = new Dialog(getActivity());
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(view);
        return dialog;
    }*/

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public void setMsg(String msg) {
        if (msg != null) {
            this.mMsg = msg;
        }
    }

}

