// Name: Cynthia Luong
// Date: 9/29/2020
// Class: CS 3560.01
//
// Stimulation Driver Class - Simulates students and answer selection


import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {

    private static Random rn = new Random();
    private static Student students[];
    private static QuestionInterface q;

    public static void main(String[] args) {
        students = createStudents();

        //decide question type
        int num = rn.nextInt(2);
        if (num == 0) {
            q = new MultipleChoice();
            multiple();
        }
        else if(num == 1) {
            q = new SingleChoice();
            single();
        }

        VoteService v = new VoteService(students, q);
    }
    
    //creates students and assigns randomly generated IDs
    private static Student[] createStudents(){
       int numOfStudents = 200;
       Student students[] = new Student[numOfStudents];
       ArrayList<Integer> idNumbers= new ArrayList<>(); 

       for(int i=0; i<numOfStudents; i++) {
          int generatedID= rn.nextInt(899999)+100000;
          while(idNumbers.contains(generatedID))
             generatedID= rn.nextInt(899999)+100000;
          
          idNumbers.add(generatedID);
          students[i]=new Student();
          students[i].setID(generatedID);
       }

       return students;
    }

    //multiple choice selection
    private static void multiple(){ 
        String answers[] = {"A", "B", "C", "D"};
        q.setQuestion("Choose A, B, C, or D");
        int index = rn.nextInt(4);
        q.setAnswer(answers[index]); 

        for (int i=0; i<students.length; i++) { 
            index = rn.nextInt(4);
            students[i].setAnswer(answers[index]);
        }
    }
    
   //single choice selection
    private static void single(){ 
        q.setQuestion("Write Right or Wrong");
        q.setAnswer("Right"); 

        for(int i=0; i<students.length; i++) {
           int choice= rn.nextInt(2);
           if(choice==0)
              students[i].setAnswer("Right");
           else
              students[i].setAnswer("Wrong");
        }
    }

}
