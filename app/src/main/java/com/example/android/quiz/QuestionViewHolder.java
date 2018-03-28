package com.example.android.quiz;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionViewHolder extends RecyclerView.ViewHolder {

    TextView qTextView;
    RadioButton[] radioButtons;

    public QuestionViewHolder(View itemView) {
        super(itemView);
        qTextView = itemView.findViewById(R.id.textView);
        RadioGroup radioGroup = itemView.findViewById(R.id.radio_group);
        radioButtons = new RadioButton[radioGroup.getChildCount()];
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = (RadioButton) radioGroup.getChildAt(i);
        }
    }
}
