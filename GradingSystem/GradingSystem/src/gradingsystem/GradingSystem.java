/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradingsystem;

import java.util.Scanner;


interface Grader {

    double getMarks();
    
   

    String getGrade(double mark);

    String getRemarks(double mark);

}

class Mark implements Grader {

    double marks;
    
  

    @Override
    public double getMarks() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter students marks:");
        marks = scan.nextDouble();
        return marks;
    }

    @Override
    public String getGrade(double mark) {
        return null;
       
    }

    @Override
    public String getRemarks(double mark) {
        return null;
      
    }

}

class Result implements Grader {

    String grade, remarks;

    @Override
    public double getMarks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGrade(double mark) {
        if (mark >= 0 && mark <= 39) {
           
            return "F" ;
            
        } else if (mark > 39 && mark <= 44) {
            return "D";
        } else if (mark > 44 && mark <= 49) {
            return "C+";
        } else if (mark > 49 && mark <= 54) {
            return "C";
        } else if (mark > 54 && mark <= 59) {
            return "B-";
        } else if (mark > 59 && mark <= 64) {
            return "B";
        } else if (mark > 64 && mark <= 69) {
            return "B+";
        } else if (mark > 69 && mark <= 74) {
            return "A-";
        } else if (mark > 74 && mark <= 79) {
            return "A";
        } else if (mark > 79 && mark <= 100) {
            return "A+";
        }

        return "invalid grades";
    }

    @Override
    public String getRemarks(double mark) {
        if (mark >= 0 && mark <= 39) {
            return "Fail";
        } else if (mark > 39 && mark <= 44) {
            return "Pass";
        } else if (mark > 44 && mark <= 49) {
            return "Poor";
        } else if (mark > 49 && mark <= 54) {
            return "Below";
        } else if (mark > 54 && mark <= 59) {
            return "Fair";
        } else if (mark > 59 && mark <= 64) {
            return "Average";
        } else if (mark > 64 && mark <= 69) {
            return "Above Average";
        } else if (mark > 69 && mark <= 74) {
            return "Good";
        } else if (mark > 74 && mark <= 79) {
            return "Very Good";
        } else if (mark > 79 && mark <= 100) {
            return "Excellent";
        }

        return "invalid Remarks";
    }

}

public class GradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mark mark = new Mark();
        double exaammark = mark.getMarks();
        Result result = new Result();
        String gradePoint = result.getGrade(exaammark);
        String remarks = result.getRemarks(exaammark);

        System.out.println("Marks: " + exaammark + " Grade: " + gradePoint + " Remarks: " + remarks + " ");

    }

}
