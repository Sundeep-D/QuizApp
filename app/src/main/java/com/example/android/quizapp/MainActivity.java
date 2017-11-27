package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int question1_point=0;
    int question2_point=0;
    int question3_point=0;
    int question4_point=0;                                                  //initialization
    int question5_point=0;
    int finalpoint=0;



    public void ques2rb1(View view)
    {
       RadioButton qno2cb2=(RadioButton) findViewById(R.id.qno2cb2);        //for radiobutton functionalities
        qno2cb2.setChecked(false);
        RadioButton qno2cb3=(RadioButton) findViewById(R.id.qno2cb3);
        qno2cb3.setChecked(false);
        question2_point=0;
    }
    public void ques2rb2(View view)
    {
        RadioButton qno2cb1=(RadioButton) findViewById(R.id.qno2cb1);              //for radiobutton functionalities
        qno2cb1.setChecked(false);
        RadioButton qno2cb3=(RadioButton) findViewById(R.id.qno2cb3);
        qno2cb3.setChecked(false);
        question2_point=0;
    }
    public void ques2rb3(View view)
    {
        RadioButton qno2cb2=(RadioButton) findViewById(R.id.qno2cb2);                 //for radiobutton functionalities
        qno2cb2.setChecked(false);
        RadioButton qno2cb1=(RadioButton) findViewById(R.id.qno2cb1);
        qno2cb1.setChecked(false);
        question2_point=2;              //updating question2 point as 2 because this radio button euqivalences correct answer
    }
    public void ques4rb1(View view)
    {
        RadioButton qno4cb2=(RadioButton) findViewById(R.id.qno4cb2);             //for radiobutton functionalities
        qno4cb2.setChecked(false);
        RadioButton qno4cb3=(RadioButton) findViewById(R.id.qno4cb3);
        qno4cb3.setChecked(false);
        question4_point=0;
    }
    public void ques4rb2(View view)
    {
        RadioButton qno4cb1=(RadioButton) findViewById(R.id.qno4cb1);                 //for radiobutton functionalities
        qno4cb1.setChecked(false);
        RadioButton qno4cb3=(RadioButton) findViewById(R.id.qno4cb3);
        qno4cb3.setChecked(false);
        question4_point=2;            //updating question4 point as 2 because this radio button euqivalences correct answer
    }
    public void ques4rb3(View view)
    {
        RadioButton qno4cb2=(RadioButton) findViewById(R.id.qno4cb2);                 //for radiobutton functionalities
        qno4cb2.setChecked(false);
        RadioButton qno4cb1=(RadioButton) findViewById(R.id.qno4cb1);
        qno4cb1.setChecked(false);
        question4_point=0;
    }
    public void ques5rb1(View view)
    {
        RadioButton qno5cb2=(RadioButton) findViewById(R.id.qno5cb2);                     //for radiobutton functionalities
        qno5cb2.setChecked(false);
        RadioButton qno5cb3=(RadioButton) findViewById(R.id.qno5cb3);
        qno5cb3.setChecked(false);
        question5_point=0;
    }
    public void ques5rb2(View view)
    {
        RadioButton qno5cb1=(RadioButton) findViewById(R.id.qno5cb1);                     //for radiobutton functionalities
        qno5cb1.setChecked(false);
        RadioButton qno5cb3=(RadioButton) findViewById(R.id.qno5cb3);
        qno5cb3.setChecked(false);
        question5_point=0;
    }
    public void ques5rb3(View view)
    {
        RadioButton qno5cb2=(RadioButton) findViewById(R.id.qno5cb2);                         //for radiobutton functionalities
        qno5cb2.setChecked(false);
        RadioButton qno5cb1=(RadioButton) findViewById(R.id.qno5cb1);
        qno5cb1.setChecked(false);
        question5_point=2;                //updating question5 point as 2 because this radio button euqivalences correct answer
    }




    public void submit_answer(View view)
    {
        CheckBox cb1=(CheckBox) findViewById(R.id.qno1cb1);
        Boolean a=cb1.isChecked();
        CheckBox cb2=(CheckBox) findViewById(R.id.qno1cb2);
        Boolean b=cb2.isChecked();
        CheckBox cb3=(CheckBox) findViewById(R.id.qno1cb3);
        Boolean c=cb3.isChecked();
        if(a==true  && b==false && c==true)                           //checking the question 1   --  a,c are the correct answers
        {
            question1_point=2;
        }
        else
        {
            question1_point=0;
        }

        EditText edittext=(EditText) findViewById(R.id.edittext);
        String ques2=edittext.getText().toString();
        String ques2_answer_typed=ques2.toUpperCase().replaceAll("\\s","");
        String ques2_answer="INTENTCLASS";

        if(ques2_answer_typed.equals(ques2_answer))          //checking the user answer with correct answer
        {
            question3_point=2;
        }
        else
        {
            question3_point=0;
        }

                                             //Displaying the results


        finalpoint=question1_point+question2_point+question3_point+question4_point+question5_point;
        Toast.makeText(MainActivity.this,"Your Scored "+finalpoint+" points",Toast.LENGTH_SHORT).show();
        TextView result=(TextView) findViewById(R.id.result);

                result.setText("Congratulations!\n\n You have scored "+finalpoint+" points out of 10\n\n" + " 2 points will be awarded per each correct submission. ");

    }

}


/*         Correct answers

            question1 - a,c
            question2 - c
            question3 - Intent Class
            question4 - b
            question5 - c
 */
