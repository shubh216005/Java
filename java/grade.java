import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
         try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your Grade: ");
            int grade = input.nextInt();
            if(grade>=90){
                System.out.println("You secured A grade");
            }
            else if(grade>=80 ){
                System.out.println("You secured B grade");
            }
            else if(grade>=70 ){
                System.out.println("You secured C grade");
            }
            else if(grade>=60 ){
                System.out.println("You secured D grade");
            } 
            else{
                System.out.println("You secured F grade");
            }
        }
        }     
        
    } 

