package com.company;

import java.util.*;

class secureRandom{

    static Scanner sc=new Scanner(System.in);

    static Random rm=new Random();

    static int count=0, cor=0, incor=0;

    public static void main(String[] args)

    {

        System.out.println("Choose the Arithmetic operation You want to learn");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Mixture of above four operations");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        int count = 0;

        if(option == 1 || option == 2 || option == 3 || option == 4)
        {

            {
                if(arithmetic[option-1].getAnswer())
                {
                    count++;
                }
            }
        }

        System.out.println("Enter difficulty level between 1 - 4");

        int lb=sc.nextInt();

        switch(lb)

        {
            case 1:while(count< 10){

                count++;

                int n1=rm.nextInt(10);

                int n2=rm.nextInt(10);

                Random rnum = new Random();

                mult(n1, n2);

            }

                percen();

                break;

            case 2:while(count< 10){

                count++;

                int n1=rm.nextInt(100);

                int n2=rm.nextInt(100);

                Random rnum = new Random();

                mult(n1, n2);

            }

                percen();

                break;

            case 3:while(count< 10){

                count++;

                int n1=rm.nextInt(1000);

                int n2=rm.nextInt(1000);

                Random rnum = new Random();

                mult(n1, n2);

            }

                percen();

                break;

            case 4:while(count< 10){

                count++;

                int n1=rm.nextInt(10000);

                int n2=rm.nextInt(10000);

                Random rnum = new Random();

                mult(n1, n2);

            }

                percen();

                break;

        }

    }

    static void mult(int n1, int n2){


        int multi=n1*n2;

        while(true){

            System.out.println("How much "+n1+" times "+n2+"?");

            int n3=sc.nextInt();

            if(n3==multi){

                cor++;

                correct();

                break;

            }

            else{

                incor++;

                incorrect();

                break;

            }

        }

    }


    static void correct(){

        int c1=rm.nextInt(4);

        switch(c1){

            case 0: System.out.println("Very Good!");

                break;

            case 1: System.out.println("Excellent!");

                break;

            case 2: System.out.println("Nice Work!");

                break;

            case 3: System.out.println("Keep up the good work!");

                break;

        }

    }

    static void incorrect(){

        int c2=rm.nextInt(4);

        switch(c2){

            case 0: System.out.println("No, please try again!");

                break;

            case 1: System.out.println("wrong, try once more!");

                break;

            case 2: System.out.println("Don't give up!");

                break;

            case 3: System.out.println("No, keep trying!");

                break;

        }


    }

    static void percen(){

        if(cor>= 7.5){

            System.out.println("Congratulations, you are ready to go to the next level!");

        }

        else {

            System.out.println("Please ask your teacher for extra help");

        }

    }


}