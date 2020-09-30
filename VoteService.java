// Name: Cynthia Luong
// Date: 9/29/2020
// Class: CS 3560.01
//
// iVote Service Class - Gathers scores and prints data


import java.text.NumberFormat;
public class VoteService {

    private Student[] students;
    private QuestionInterface q;
    private int A = 0, B = 0, C = 0, D = 0;
    private int right = 0, wrong = 0;

    public VoteService(Student[] students, QuestionInterface q){
        this.students = students;
        this.q = q;

        countAnswers();
        
        printData();
    }

   //tally all students' answers according to question type
   public void countAnswers(){
      if (q.isMultipleChoice())  
         for (int i=0; i< students.length; i++) { 
            switch(students[i].getAnswer()) {
            case "A": 
               A++;
               break;
            case "B":
               B++;
               break;
            case "C":
               C++;
               break;
            case "D": 
               D++;
               break;
            default:
            }
            
         }

      else
         for (int i=0; i< students.length; i++) { 
            if (students[i].getAnswer().compareTo("Right") == 0)
                right++;
            else
                wrong++;
         }

   }

   //prints question and student data
   public void printData(){ 
      System.out.println("iVote Simulator Data");
      System.out.println("Number of Students : " + students.length);
      System.out.println("Question           : " + q.question());
      System.out.println("Answer             : " + q.answer() + "\n");

      System.out.println("Student results");
         double percent;
         NumberFormat percentFormat=NumberFormat.getPercentInstance();
         percentFormat.setMinimumFractionDigits(1);
         if (q.isMultipleChoice()){
            percent= ((double) A/students.length);
            System.out.println("A: " + A + "    " + percentFormat.format(percent));
            percent= ((double) B/students.length);
            System.out.println("B: " + B + "    " + percentFormat.format(percent));
            percent= ((double) C/students.length);
            System.out.println("C: " + C + "    " + percentFormat.format(percent));
            percent= ((double) D/students.length);
            System.out.println("D: " + D + "    " + percentFormat.format(percent));
         }
         else {
            percent= ((double) right/students.length);
            System.out.println("Right: " + right + "    " + percentFormat.format(percent));
            percent= ((double) wrong/students.length);
            System.out.println("Wrong: " + wrong + "    " + percentFormat.format(percent));
         }
   }
}
