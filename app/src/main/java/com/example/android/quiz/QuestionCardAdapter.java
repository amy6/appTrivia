package com.example.android.quiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import java.util.ArrayList;

public class QuestionCardAdapter extends RecyclerView.Adapter<QuestionViewHolder> {

    private Context context;
    private ArrayList<Question> questions;

    public QuestionCardAdapter(Context context, ArrayList<Question> questions) {
        super();
        this.context = context;
        this.questions = questions;
    }

    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_item_layout, parent,
                false);
        return new QuestionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder holder, int position) {
        Question currentQuestion = questions.get(position);
         holder.qTextView.setText(currentQuestion.getQuestion());
         String[] options = currentQuestion.getOptions();
         RadioButton[] radioButtons = holder.radioButtons;
        for (RadioButton button:radioButtons) {
            button.setText(options[position]);
        }

    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
