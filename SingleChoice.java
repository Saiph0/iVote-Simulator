// Name: Cynthia Luong
// Date: 9/29/2020
// Class: CS 3560.01
//
// Single Choice Question Class - Holds Question and Answer


public class SingleChoice implements QuestionInterface {
    String q;
    String a;

    public String question(){
        return q;
    }
    public String answer(){
        return a;
    }

    public void setQuestion(String q){
        this.q = q;
    }
    public void setAnswer(String a){
        this.a = a;
    }

    public boolean isMultipleChoice(){
        return false;
    }
}
    }
}
