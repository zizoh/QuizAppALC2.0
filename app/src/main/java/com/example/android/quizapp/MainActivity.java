package com.example.android.quizapp;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int totalNumberOfQuestions = 8;
    int totalMarks = 10;
    int noOfQuestionsAnswered = 0;
    int questionOneAnswered = 0;
    int questionTwoAnswered = 0;
    int questionThreeAnswered = 0;
    int questionFourAnswered = 0;
    int questionFiveAnswered = 0;
    int questionSixAnswered = 0;
    int numberOfCheckboxesChecked = 0;
    int questionSevenAnswered = 0;
    int questionEightAnswered = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // This method is called when the Submit Answers button is clicked.
    public void submitAnswers(View view) {

        int finalMarks = markQuestions();
        EditText userName = (EditText) findViewById(R.id.username);
        Button submitButton = (Button) findViewById(R.id.submit_answers_button);

        Toast.makeText(this, "Hey " + userName.getText() + ", you scored " + finalMarks + "/" + totalMarks + "!", Toast.LENGTH_LONG).show();
    }

    // This method handles the click event for Question 1 radio buttons
    public void onQuestionOneRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionOne = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_one_radio_button_a:  // NaMeBeThis
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
                break;
            case R.id.question_one_radio_button_b: // NAmeBEthis
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
                break;
            case R.id.question_one_radio_button_c: // NAMEBETHIS
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
                break;
            case R.id.question_one_radio_button_d: // naMeBeThis
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 2 radio buttons
    public void onQuestionTwoRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionTwo = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_two_radio_button_a: // LinearLayout
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
                break;
            case R.id.question_two_radio_button_b: // ImageView
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
                break;
            case R.id.question_two_radio_button_c: // Button
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
                break;
            case R.id.question_two_radio_button_d: // RelativeLayout
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 3 radio buttons
    public void onQuestionThreeRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionThree = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_three_radio_button_true: // True
                if (checkedQuestionThree && questionThreeAnswered == 1) {
                } else {
                    if (checkedQuestionThree) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionThreeAnswered = 1;
                    }
                }
                break;
            case R.id.question_three_radio_button_false: // False
                if (checkedQuestionThree && questionThreeAnswered == 1) {
                } else {
                    if (checkedQuestionThree) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionThreeAnswered = 1;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 4 radio buttons
    public void onQuestionFourRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionFour = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_four_radio_button_a: // Question mark (?)
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
                break;
            case R.id.question_four_radio_button_b: // Comma (,)
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
                break;
            case R.id.question_four_radio_button_c: // Semi colon (;)
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
                break;
            case R.id.question_four_radio_button_d: // Exclamation mark (!)
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 5 radio buttons
    public void onQuestionFiveRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionFive = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_five_radio_button_a: // sp
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
                break;
            case R.id.question_five_radio_button_b: // tz
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
                break;
            case R.id.question_five_radio_button_c: // jz
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
                break;
            case R.id.question_five_radio_button_d: // sz
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
                break;
        }
    }

    // This method handles click events for Question 6 checkboxes
    // It allows the user to check only 3 checkboxes at a time
    public void onQuestionSixCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checkedQuestionSix = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.question_six_checkbox_a: // Copy the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and 1 is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_b: // Position the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_c: // Style the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_d: // Select the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 7 radio buttons
    public void onQuestionSevenRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionSeven = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_seven_radio_button_a:
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Layout
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
                break;
            case R.id.question_seven_radio_button_b:
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Styles
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
                break;
            case R.id.question_seven_radio_button_c: // Correct answer
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Drawable
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
                break;
            case R.id.question_seven_radio_button_d:
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Manifest
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 8 radio buttons
    public void onQuestionEightRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionEight = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_eight_radio_button_a: // Correct answer
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Debug
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                break;
            case R.id.question_eight_radio_button_b:
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Run
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                break;
            case R.id.question_eight_radio_button_c:
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Refactor
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                break;
            case R.id.question_eight_radio_button_d:
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Gradle
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                break;
        }
    }

    // This method contains the marking scheme and assigns 1 point to every correct answer
    private int markQuestions() {

        // Correct Answers to all questions
        int noOfCorrectQuestionsAnswered = 0;

        // Question 1 correct answer D (1 mark)
        RadioButton questionOneRadioButtonD = (RadioButton) findViewById(R.id.question_one_radio_button_d);
        boolean answerQuestionOneRadioButtonD = questionOneRadioButtonD.isChecked();

        if (answerQuestionOneRadioButtonD) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 2 correct answer D (1 mark)
        RadioButton questionTwoRadioButtonD = (RadioButton) findViewById(R.id.question_two_radio_button_d);
        boolean answerQuestionTwoRadioButtonD = questionTwoRadioButtonD.isChecked();

        if (answerQuestionTwoRadioButtonD) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 3 correct answer True (1 mark)
        RadioButton questionThreeRadioButtonTrue = (RadioButton) findViewById(R.id.question_three_radio_button_true);
        boolean answerQuestionThreeRadioButtonTrue = questionThreeRadioButtonTrue.isChecked();

        if (answerQuestionThreeRadioButtonTrue) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 4 correct answer C (1 mark)
        RadioButton questionFourRadioButtonC = (RadioButton) findViewById(R.id.question_four_radio_button_c);
        boolean answerQuestionFourRadioButtonC = questionFourRadioButtonC.isChecked();

        if (answerQuestionFourRadioButtonC) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 5 correct answer A (1 mark)
        RadioButton questionFiveRadioButtonA = (RadioButton) findViewById(R.id.question_five_radio_button_a);
        boolean answerQuestionFiveRadioButtonA = questionFiveRadioButtonA.isChecked();

        if (answerQuestionFiveRadioButtonA) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 6 correct answer Checkboxes B, C and D (3 marks)
        CheckBox questionSixCheckboxB = (CheckBox) findViewById(R.id.question_six_checkbox_b);
        boolean answerQuestionSixCheckboxB = questionSixCheckboxB.isChecked();

        CheckBox questionSixCheckboxC = (CheckBox) findViewById(R.id.question_six_checkbox_c);
        boolean answerQuestionSixCheckboxC = questionSixCheckboxC.isChecked();

        CheckBox questionSixCheckboxD = (CheckBox) findViewById(R.id.question_six_checkbox_d);
        boolean answerQuestionSixCheckboxD = questionSixCheckboxD.isChecked();

        if (answerQuestionSixCheckboxB) { // Determines if the user checks B
            noOfCorrectQuestionsAnswered++;
        }
        if (answerQuestionSixCheckboxC) { // Determines if the user checks C
            noOfCorrectQuestionsAnswered++;
        }
        if (answerQuestionSixCheckboxD) { // Determines if the user checks D
            noOfCorrectQuestionsAnswered++;
        }

        // Question 7 correct answer C (1 mark)
        RadioButton questionSevenRadioButtonC = (RadioButton) findViewById(R.id.question_seven_radio_button_c);
        boolean answerQuestionSevenRadioButtonC = questionSevenRadioButtonC.isChecked();

        if (answerQuestionSevenRadioButtonC) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 8 correct answer A (1 mark)
        RadioButton questionEightRadioButtonA = (RadioButton) findViewById(R.id.question_eight_radio_button_a);
        boolean answerQuestionEightRadioButtonA = questionEightRadioButtonA.isChecked();

        if (answerQuestionEightRadioButtonA) {
            noOfCorrectQuestionsAnswered++;
        }
        return noOfCorrectQuestionsAnswered;
    }

    // This method is called when the Try Again button is clicked
    public void tryAgain(View view) {
        // Question 1
        RadioButton questionOneRadioButtonA = (RadioButton) findViewById(R.id.question_one_radio_button_a);
        questionOneRadioButtonA.setChecked(false);
        RadioButton questionOneRadioButtonB = (RadioButton) findViewById(R.id.question_one_radio_button_b);
        questionOneRadioButtonB.setChecked(false);
        RadioButton questionOneRadioButtonC = (RadioButton) findViewById(R.id.question_one_radio_button_c);
        questionOneRadioButtonC.setChecked(false);
        RadioButton questionOneRadioButtonD = (RadioButton) findViewById(R.id.question_one_radio_button_d);
        questionOneRadioButtonD.setChecked(false);

        // Question 2
        RadioButton questionTwoRadioButtonA = (RadioButton) findViewById(R.id.question_two_radio_button_a);
        questionTwoRadioButtonA.setChecked(false);
        RadioButton questionTwoRadioButtonB = (RadioButton) findViewById(R.id.question_two_radio_button_b);
        questionTwoRadioButtonB.setChecked(false);
        RadioButton questionTwoRadioButtonC = (RadioButton) findViewById(R.id.question_two_radio_button_c);
        questionTwoRadioButtonC.setChecked(false);
        RadioButton questionTwoRadioButtonD = (RadioButton) findViewById(R.id.question_two_radio_button_d);
        questionTwoRadioButtonD.setChecked(false);

        // Question 3
        RadioButton questionThreeRadioButtonTrue = (RadioButton) findViewById(R.id.question_three_radio_button_true);
        questionThreeRadioButtonTrue.setChecked(false);
        RadioButton questionThreeRadioButtonFalse = findViewById(R.id.question_three_radio_button_false);
        questionThreeRadioButtonFalse.setChecked(false);

        // Question 4
        RadioButton questionFourRadioButtonA = (RadioButton) findViewById(R.id.question_four_radio_button_a);
        questionFourRadioButtonA.setChecked(false);
        RadioButton questionFourRadioButtonB = (RadioButton) findViewById(R.id.question_four_radio_button_b);
        questionFourRadioButtonB.setChecked(false);
        RadioButton questionFourRadioButtonC = (RadioButton) findViewById(R.id.question_four_radio_button_c);
        questionFourRadioButtonC.setChecked(false);
        RadioButton questionFourRadioButtonD = (RadioButton) findViewById(R.id.question_four_radio_button_d);
        questionFourRadioButtonD.setChecked(false);

        // Question 5
        RadioButton questionFiveRadioButtonA = (RadioButton) findViewById(R.id.question_five_radio_button_a);
        questionFiveRadioButtonA.setChecked(false);
        RadioButton questionFiveRadioButtonB = (RadioButton) findViewById(R.id.question_five_radio_button_b);
        questionFiveRadioButtonB.setChecked(false);
        RadioButton questionFiveRadioButtonC = (RadioButton) findViewById(R.id.question_five_radio_button_c);
        questionFiveRadioButtonC.setChecked(false);
        RadioButton questionFiveRadioButtonD = (RadioButton) findViewById(R.id.question_five_radio_button_d);
        questionFiveRadioButtonD.setChecked(false);

        // Question 6
        CheckBox questionSixCheckboxA = (CheckBox) findViewById(R.id.question_six_checkbox_a);
        questionSixCheckboxA.setChecked(false);
        CheckBox questionSixCheckboxB = (CheckBox) findViewById(R.id.question_six_checkbox_b);
        questionSixCheckboxB.setChecked(false);
        CheckBox questionSixCheckboxC = (CheckBox) findViewById(R.id.question_six_checkbox_c);
        questionSixCheckboxC.setChecked(false);
        CheckBox questionSixCheckboxD = (CheckBox) findViewById(R.id.question_six_checkbox_d);
        questionSixCheckboxD.setChecked(false);

        // Question 7
        RadioButton questionSevenRadioButtonA = (RadioButton) findViewById(R.id.question_seven_radio_button_a);
        questionSevenRadioButtonA.setChecked(false);
        RadioButton questionSevenRadioButtonB = (RadioButton) findViewById(R.id.question_seven_radio_button_b);
        questionSevenRadioButtonB.setChecked(false);
        RadioButton questionSevenRadioButtonC = (RadioButton) findViewById(R.id.question_seven_radio_button_c);
        questionSevenRadioButtonC.setChecked(false);
        RadioButton questionSevenRadioButtonD = (RadioButton) findViewById(R.id.question_seven_radio_button_d);
        questionSevenRadioButtonD.setChecked(false);

        // Question 8
        RadioButton questionEightRadioButtonA = (RadioButton) findViewById(R.id.question_eight_radio_button_a);
        questionEightRadioButtonA.setChecked(false);
        RadioButton questionEightRadioButtonB = (RadioButton) findViewById(R.id.question_eight_radio_button_b);
        questionEightRadioButtonB.setChecked(false);
        RadioButton questionEightRadioButtonC = (RadioButton) findViewById(R.id.question_eight_radio_button_c);
        questionEightRadioButtonC.setChecked(false);
        RadioButton questionEightRadioButtonD = (RadioButton) findViewById(R.id.question_eight_radio_button_d);
        questionEightRadioButtonD.setChecked(false);

        noOfQuestionsAnswered = 0;
        questionOneAnswered = 0;
        questionTwoAnswered = 0;
        questionThreeAnswered = 0;
        questionFourAnswered = 0;
        questionFiveAnswered = 0;
        questionSixAnswered = 0;
        numberOfCheckboxesChecked = 0;
        questionSevenAnswered = 0;
        questionEightAnswered = 0;
        checkProgressBar(view);
    }

    //This method implements the progress bar
    public void checkProgressBar(View view) {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setIndeterminate(false);
        progressBar.setMax(totalNumberOfQuestions);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            progressBar.setProgress(noOfQuestionsAnswered, true);
        }
    }
}

