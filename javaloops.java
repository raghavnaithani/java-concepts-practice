import java.util.Scanner;
public class javaloops{
    public static void main(String[] args) {
        // //IF ELSE  LOOP
        // //for ex 
        // System.out.println("enter your age");
        
        // Scanner s = new Scanner(System.in);
        
        // int age = s.nextInt();
        // s.nextLine();
        // //boolean con = (age == 18);
        // // if(con){                                   //if the conditions is false , the else is executed
        // //     System.out.println("Yes you can drive.");
        // // }
        // if( age >= 18){                                   //if the conditions is false , the else is executed
        //     System.out.println("give your driving licence status\n 1.you have a valid driving licence\n 2.you have a valid learner's licence\n 3. you don't have any of these ");
        //     String st = s.nextLine();
        //     if(st.equalsIgnoreCase("1")){
        //         System.out.println("you can drive");
        //     }
        //     else if(st.equalsIgnoreCase("2")){
        //         System.out.println("you can drive but with some restrictions");
        //     }
        //     else if(st.equalsIgnoreCase("3")){
        //         System.out.println("you cannot drive");

        //     }
        //     else{
        //         System.out.println("invalid input.");
        //     }
        // }

        // else{
        //    System.out.println("You cannot drive yet."); // can also be used without writing else 
        // }
        // s.close();
        // can take boolean as condition
        // can use relational operators



        //SWITCH CASE
        // int age;
        // System.out.println("choose an age group \n 1.0-18 \n 2. 18-25 \n 3. 25-35 \n");
        // Scanner s = new Scanner(System.in);
        // age = s.nextInt();
        // s.nextLine(); 
        
        // switch (age) {
        //     case 1:
        //         System.out.println("Focus on development of your mind and body!");
        //         break;
        //     case 2:
        //         System.out.println("Try to gain skills for your careers!");
        //         break;
        //     case 3:
        //         System.out.println("Focus on bigger and broader skills to make life stable and smooth!");
        //     default:
        //         System.out.println("Enjoy your life!");
        //         break;
        //     }
        // System.out.println("thanks for using this program for general consultation");




        //WHILE LOOPS
        // print natural no.s from 100 to 200
        // int i= 100;
        // while(i<=200){ // if the condition is true then loop will work 
        //     System.out.println(i);
        //     i++;
        // }
        // // when condition becomes false then loop will end and will move further in the code
        // // while (true) {                            // loop will keep on runnning
        // //     System.out.println("This is an infinite loop");
            
        // // }
        // System.out.println("loop end");

        // int a = 20;

        // while (a<5) {
        //     System.out.println(a);
        //     a++;
            
        // } // wont work 
        // do{
        //     System.out.println(a);
        //     a++;     // will work atleast once

        // }while(a<10); // then check the condition
        

        //FOR LOOP
        // Scanner s = new Scanner(System.in);
        // System.out.println("enter the no. even number you want (in reverse order) : ");
        // int n = s.nextInt();
        // for(/* initialization */ int i = n ; /* checking condition if T or F */ i>=0 ; /* updating */ i-- ){
        //     System.out.println(2*i+1);

        // }
        



        // BREAK AND CONTINUE

        // Break 
        // for( int i= 0 ; i < 5 ; i ++){
        //     System.out.println(i);
        //     System.out.println("going to next no.");
        //     if(i==3){
        //         System.out.println("ending the loop");
    
        //         break;
        //     }
        // }
        // System.out.println("loop closed here");



        // int i = 0;
        // while(i<5){
        //     System.out.println(i);
        //     System.out.println("going to next no.");
        //     if(i==3){
        //         System.out.println("ending the loop");
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("loop finished");


        // do{
        //     System.out.println("i");
        //     System.out.println("going to the next iteration");
        //     if(i==3){
        //         System.out.println("ending the loop");
        //         break;
        //     }
        //     i++;

        // }while(i<5);
        // System.out.println("loop ends here");



        // CONTINUE

        // for(int i= 0 ; i <=5 ; i++) {
        //     System.out.println(i);
           
        //     if(i==3){
        //         System.out.println("continue to next iteration");
        //         continue;
        //     }
        //     System.out.println("going to next no.");

         
        // }
        // System.out.println("loop ends here");

        int i = 0;
        while (i<5) {
            i++;
            System.out.println(i);
            if(i==3){
                System.out.println("continue to next iteration");
                continue;
            }
            System.out.println("going to next iteration");
            
        }
        System.out.println("loop ends here");
    }
}