package com.forty7.lifedmeo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CFragment extends Fragment {

    private View view;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("TEST", "CFragment - >>> onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "CFragment - >>> onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_c, container, false);
        Log.d("TEST", "CFragment - >>> onCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("TEST", "CFragment - >>> onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TEST", "CFragment - >>> onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TEST", "CFragment - >>> onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TEST", "CFragment - >>> onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TEST", "CFragment - >>> onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TEST", "CFragment - >>> onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TEST", "CFragment - >>> onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TEST", "CFragment - >>> onDetach");
    }

}
