// Name: Cynthia Luong
// Date: 9/29/2020
// Class: CS 3560.01
//
// Question Interface

public interface QuestionInterface {

   /**
    * Finds the question stored.
    * @return String question
    */
    public String question();
    
    /**
     * Finds the answer stored
     * @return String correct answer
     */
    public String answer();
    
    /**
     * Changes the question
     * @param q new question
     */
    public void setQuestion(String q);
    
    /**
     * Changes the answer
     * @param a new answer
     */
    public void setAnswer(String a);
    
    /**
     * Finds if the answer is multiple choice
     * @return true if multiple choice
     */
    public boolean isMultipleChoice();
}
