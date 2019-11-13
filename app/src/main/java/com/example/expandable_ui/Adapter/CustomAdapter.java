package com.example.expandable_ui.Adapter;

import android.graphics.Color;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expandable_ui.Model.Fairloy;
import com.example.expandable_ui.R;
import com.example.expandable_ui.databinding.ActivityItemBinding;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.vholder> {

    List<Fairloy> lists = new ArrayList<>();

    public CustomAdapter(List<Fairloy> lists)
    {
        this.lists = lists;
    }

    @Override
    public vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        ActivityItemBinding activityItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.activity_item, parent, false);
        return new vholder(activityItemBinding);

    }

    @Override
    public void onBindViewHolder( vholder holder, int position)
    {
        Fairloy fy = lists.get(position);
        holder.activityItemBinding.tvQuestion.setText(fy.getQuestion());
        holder.activityItemBinding.tvDetail.setText(fy.getAnswer());

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class vholder extends RecyclerView.ViewHolder {

        ActivityItemBinding activityItemBinding;

        public vholder(@NonNull ActivityItemBinding itemView) {
            super(itemView.getRoot());
            activityItemBinding = itemView;

            activityItemBinding.selected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (activityItemBinding.expandableview.getVisibility() == View.GONE) {
                        TransitionManager.beginDelayedTransition(activityItemBinding.rmain, new AutoTransition());
                        activityItemBinding.expandableview.setVisibility(View.VISIBLE);
                        activityItemBinding.selected.setImageResource(R.drawable.expand);

                        activityItemBinding.relativeQues.setBackgroundColor(Color.argb(25, 149, 195, 119));
                        activityItemBinding.expandableview.getBackground().setAlpha(19);

                        activityItemBinding.tvQuestion.setTextColor(Color.parseColor("#95c377"));
                        activityItemBinding.view.setVisibility(View.INVISIBLE);



                    } else {
                        TransitionManager.beginDelayedTransition(activityItemBinding.rmain, new AutoTransition());
                        activityItemBinding.expandableview.setVisibility(View.GONE);
                        activityItemBinding.selected.setImageResource(R.drawable.notexpand);

                        activityItemBinding.tvQuestion.setTextColor(Color.GRAY);
                        activityItemBinding.relativeQues.setBackgroundColor(Color.WHITE);
                        activityItemBinding.view.setVisibility(View.VISIBLE);

                    }
                }
            });

        }
    }

}
