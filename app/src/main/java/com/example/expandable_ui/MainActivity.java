package com.example.expandable_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.expandable_ui.Adapter.CustomAdapter;
import com.example.expandable_ui.Model.Fairloy;
import com.example.expandable_ui.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    CustomAdapter customAdapter;
    List<Fairloy> lists = new ArrayList<>();
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        customAdapter = new CustomAdapter(lists);
        activityMainBinding.rview1.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        activityMainBinding.rview1.setAdapter(customAdapter);
        activityMainBinding.rview1.hasFixedSize();

        getDetails();

    }

    private void getDetails()
    {

        lists.add(new Fairloy("What is Fairloy?","Fairloy Card provides the best and easiest way for the customers to see how much they saved on their purchase at our participating clients." +
                "Once you sign up on our portal you will see the dollars you saved on your previous purchase."));

        lists.add(new Fairloy("Where to find Fairloy affiliated outlets ? ?","Quisque velit nisi, pretium ut lacinia in, elementum id enim. Vivamus magna justo, lacinia eget sed consectetur, convallis at tellus. Nulla quis lorem ut libero malesuada feugiat. Pellentesque in ipsum id orci porta dapibus."));

        lists.add(new Fairloy("How to earn points using Fairloy ?","Vivamus suscipit tortor eget felis porttitor volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla quis lorem ut libero malesuada feugiat. Quisque velit nisi, pretium ut lacinia in, elementum id enim."));

        lists.add(new Fairloy("Where can i see the points I earned ?","Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Curabitur aliquet quam id dui posuere blandit. Donec rutrum congue leo eget malesuada."));

        lists.add(new Fairloy("Can i share or transfer my points ?","Nulla quis lorem ut libero malesuada feugiat. Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. Donec rutrum congue leo eget malesuada. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui."));

        lists.add(new Fairloy("What is my coupons ?","Cras ultricies ligula sed magna dictum porta. Nulla porttitor accumsan tincidunt. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula. Nulla porttitor accumsan tincidunt."));

        lists.add(new Fairloy("Can i use my Fairloy card with Fairloy app ?","Cras ultricies ligula sed magna dictum porta. Vivamus suscipit tortor eget felis porttitor volutpat. Pellentesque in ipsum id orci porta dapibus. Lorem ipsum dolor sit amet, consectetur adipiscing elit."));

        lists.add(new Fairloy("Do i lose my points if I change my phone ?","Proin eget tortor risus. Vivamus suscipit tortor eget felis porttitor volutpat. Proin eget tortor risus. Nulla porttitor accumsan tincidunt."));

        lists.add(new Fairloy("Can i change my registered mobile number ?","Nulla quis lorem ut libero malesuada feugiat. Vivamus suscipit tortor eget felis porttitor volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit."));

    }
}
