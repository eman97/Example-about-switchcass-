package switchcass;

public class Test {

   public static void main(String args[]) {
      // char grade = args[0].charAt(0);
      char grade = 'V';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
           break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
          break;
         case 'D' :
            System.out.println("You passed");
            break;
         case 'F' :
            System.out.println("Better try again");
            
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}
