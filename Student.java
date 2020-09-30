// Name: Cynthia Luong
// Date: 9/29/2020
// Class: CS 3560.01
//
// Student Class - Holds Student's ID and answer


public class Student {

    private int id;
    private String answer;

    public Student(){
        this.id = 0;
        this.answer = "default";
    }

    public void setID(int id){
        this.id = id;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public int getID(){
        return id;
    }

    public String getAnswer(){
        return answer;
    }
}
