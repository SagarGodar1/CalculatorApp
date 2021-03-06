package com.example.foodex.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.foodex.R;
import com.example.foodex.activities.user.UserFoodListActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private View viewBreakfast, viewNoon, viewLunch, viewDinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        viewBreakfast = v.findViewById(R.id.viewBreakfast);
        viewNoon = v.findViewById(R.id.viewNoon);
        viewLunch = v.findViewById(R.id.viewLunch);
        viewDinner = v.findViewById(R.id.viewDinner);

        viewBreakfast.setOnClickListener(this);
        viewNoon.setOnClickListener(this);
        viewLunch.setOnClickListener(this);
        viewDinner.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.viewBreakfast:
                startActivity("BREAKFAST");
                break;
            case R.id.viewNoon:
                startActivity("NOON MEAL");
                break;
            case R.id.viewLunch:
                startActivity("LUNCH");
                break;
            case R.id.viewDinner:
                startActivity("DINNER");
                break;
        }
    }

    private void startActivity(String category){
        Intent intent = new Intent(getActivity(), UserFoodListActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}
