package com.studyjams.bognean.fivetipstolear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int oldVaue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeTextViewValueRandomlyOnButtonClick();


    }

    public void abc(View view) {
        ImageView img = (ImageView) findViewById(R.id.imagine);
        img.setVisibility(View.INVISIBLE);
    }

    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"Study Tip 1: Make Your Own Study Notes\n" +
                "\n" +
                "Taking Notes is one of the most widespread study skills out there. Essentially the aim of note-taking is to summarise lectures or articles in your own words so you can easily remember the ideas. In most cases, the key is to be able to summarise the content as quickly as possible while not leaving out any key info.\n" +
                "\n" +
                "When creating Notes, you can do it the traditional way with the good ol’ pen and paper or you can utilise online tools, such as ExamTime’s Notes feature.\n", "Study Tip 2: Mind Mapping\n" +
                "\n" +
                "A good Mind Map can save you many hours of study and further consolidate your knowledge for your exams. Mind Maps are an extremely versatile tools. They can be used for brainstorming, outlining essays or study topics and for general exam preparation.\n" +
                "\n" +
                "ExamTime offers the ability to create Mind Maps quickly and easily which makes them the ideal tool when it comes to exams.\n", "Study Tip 3: Quizzes\n" +
                "\n" +
                "Quizzes are an excellent way to review study notes in the weeks and days before an exam. Quizzes can show where your strengths and weaknesses are, so it allows you to focus your efforts more precisely. Moreover, if you share your Study Quiz with your classmates and test each other as much as possible you can discover even more details and areas you may have overlooked. So before any exam, make sure you create and share a bunch of different Quizzes with your Friends.\n", "Study Tip 4: Brainstorming\n" +
                "\n" +
                "This is another study technique that is ideal for studying with friends and/or classmates. Brainstorming is a great way to expand every possible idea out of any topic. Just get a bunch of friends together and shoot the breeze, there are no wrong answers when brainstorming – just talk and capture the ideas, you can review afterward.\n" +
                "\n" +
                "Some ideas that sounded great before will be ruled out straight away afterwards while others that sounded crazy before will be seen to have great promise. Using  Mind Maps is an ideal way of capturing all this info as it mirrors the explosive nature of your thought processes.\n"
                , "Study Tip 5: Mnemonic Rules\n" +
                "\n" +
                "Mnemonics are especially useful when memorising lists and sets. Mnemonics rules basically work by associating certain concepts with other concepts that are more familiar to us. There are many different ways to make mnemonics and these can be individual to the person.\n" +
                "\n" +
                "A classic example is ‘Richard of York Gave Battle In Vain’. This Mnemonic rule is for remember the primary colours : Red, Orange, Yellow, Green, Blue, Indigo and Violet.\n"};

        final TextView changingText = (TextView) findViewById(R.id.text_to_change);
        Button changeTextButton = (Button) findViewById(R.id.change_text_button);
        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * manyDifferentStrings.length);
                if (random == oldVaue) {
                    random = (int) (Math.random() * manyDifferentStrings.length);
                }
                changingText.setText(manyDifferentStrings[random]);
                oldVaue = random;
            }
        });
    }
}

