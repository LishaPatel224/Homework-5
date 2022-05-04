package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array nums to 99.
    // d) set the value of the 13th element to 15
    // d) set the value of the 2nd element to 6
    // d) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
    
    ArrayList <Integer> number = new ArrayList <Integer>(15);
    number.add(1);
    number.add(2);
    number.add(3);
    number.add(4);
    number.add(5);
    number.add(6);
    number.add(7);
    number.add(8);
    number.add(9);
    number.add(10);
    number.add(11);
    number.add(12);
    number.add(13);
    number.add(14);
    number.add(15);
    System.out.println(number.get(9));
    ArrayList <Integer> second = new ArrayList <Integer>();
    second.add(1);
    second.add(1);
    second.add(1);
    second.add(1);
    second.add(1);
    second.add(1);
    second.add(1);
    second.add(1);
    second.add(1);
    second.set(4,99);
    second.set(8,number.get(5)+ number.get(12));
    System.out.println(second);

    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week that we have class 
    // d) change the arrayList to start on Sunday

    ArrayList <String> week = new ArrayList<String>();
    week.add("Monday");
    week.add("Tuesday");
    week.add("Wednesday");
    week.add("Thursday");
    week.add("Friday");
    week.add("Saturday");
    week.add("Sunday");
    System.out.println(week);
    System.out.println("The days of the week are:");
    System.out.println(week.get(0));
    System.out.println(week.get(1));
    System.out.println(week.get(2));
    System.out.println(week.get(3));
    System.out.println(week.get(4));
    System.out.println(week.get(5));
    System.out.println(week.get(6));
    System.out.println("The days of the week we have class are:");
    System.out.println(week.get(1));
    System.out.println(week.get(3));
    System.out.println("The ArrayList before update:"+ week);
    String Weekday= "Sunday";
    week.remove(week.indexOf(Weekday));
    week.add(0, Weekday);
    System.out.println("The ArrayList after update:"+ week);

    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
    // Hint 1: use collections sort to sort the numbers 
    // Hint 2: you can see if the size of the array list is divisible by 3 by running:
    //  numbers.size()%3==0
    // Hint 3: You can use this logic to print the array list in a 3x3 pattern once its created:
    // for(int i=0;i<numbers.size();i++)
    //     {
    //         System.out.print(numbers.get(i)+" ");
    //         if((i+1)%3==0)
    //         {
    //             System.out.println();
    //         }
    //     }
    ArrayList<Integer> enter = new ArrayList<Integer>();
    System.out.println("In ArrayList, enter the numbers to be added:");
    System.out.println("Number:");
    int data = keyboard.nextInt();
    while (data!=0) {
        enter.add(data);
        System.out.println(enter);
        System.out.println("Number:");
        data = keyboard.nextInt();
    }
    System.out.println("TOTAL ENDED");
    System.out.println("The ArrayList is: "+ enter);  
    int n = enter.size();
    System.out.println("ArrayList elements are:");
    for (int i = 0; i < n; i++) {
        System.out.print(enter.get(i) + " ");
    }
    System.out.println();
    int max = Collections.max(enter);
    System.out.println("The Largest Number is: " + max);

    int min = Collections.min(enter);
    System.out.println("The Smallest Number is: " + min); 
    Collections.sort(enter);
    System.out.println("The ArrayList after Sorting is: "+ enter);
    System.out.println(enter);
    int no =enter.size();
    int div = no %3;
    int num1= 0;
    int num2 = 0;
    while(!(div == 0)){
        if(div == 1){
            System.out.println("Please enter 2 numbers to create the matrix:");
            System.out.println("Enter the number 1:");
            num1 = keyboard.nextInt();
            enter.add(num1);
            System.out.println("Please enter number 2:");
            num2 = keyboard.nextInt();
            enter.add(num2);
            no = enter.size();
            div = no % 3;
        }
        else if(div == 2){
            System.out.println("Please enter 1 more number to create the matrix:");
            System.out.println("Enter the number:");
            num1= keyboard.nextInt();
            enter.add(num1);
            no = enter.size();
            div = no % 3;
        }
    }
    System.out.println(enter);
    

            no = enter.size();
            int Value = no /3;
            int b = Value;
            ArrayList<ArrayList<Integer>> Matrix = new ArrayList<>();
            int count = 0;
            for(int i=0;i<b;i++) {
                ArrayList<Integer> Row = new ArrayList<>();
                for(int k=0;k<3;k++) {
                    Row.add(enter.get(k+count));
                }
                count +=3; 
                Matrix.add(Row);
                
            }
            for(int row=0;row<Matrix.size();row++) {
                for(int col=0;col<Matrix.get(row).size();col++) {
                    System.out.print(Matrix.get(row).get(col)+" ");
                }
                System.out.println(" ");
            }

}
}





   

