package BasicsOfJava;

import java.util.Scanner;

public class RepetitionStructures {
    public static void main(String[] args){
        //Guess my fav no
        int favNo = 13;
        //Get user value
        System.out.println("Guess my fav no");
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        int count = 0;
        //While loop
        while(userChoice != favNo){
            System.out.println("OOps Wrong Number, Try again");
            count ++;
            if(count==3 && count<5) {
                System.out.println("TIP: Fav no is bw 10 and 20 TRY AGAIN!!");
            }
            userChoice = input.nextInt(); //break condition if not given will result in infinite loop

            }
        System.out.println(userChoice + " is correct");

        //Do while
        int runAgain = 0;
        System.out.println("Find the sum");
        do{
            System.out.println("Enter first no");
            double num1 = input.nextDouble();

            System.out.println("Enter Second no");
            double num2 = input.nextDouble();

            double sum = num1+num2;

            System.out.println("The sum is " +sum);

            System.out.println("Do you want to run this again if yes enter 1 else 0");
            runAgain = input.nextInt();
        }while(runAgain == 1);  //condition checked at the end, so it will run one time even if the condition is wrong

        //for loop
        for(int i=0; i <=5; i++){
            System.out.print(i+ " ");
        }
        //while loop
        int i =0;
        while(i <=5){
            System.out.print(i + " ");
            i++; //break condition
        }

        }
    }

