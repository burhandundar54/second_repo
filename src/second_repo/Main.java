package second_repo;



	//Write a program that reads input from a user and prints statistics about those inputs. will get numbers more one and store in a list.
	// When the user enters the string "end", the reading is stopped. Other inputs are numbers in string format.
	// When you stop reading inputs, the program prints the number of positive integers divisible by three, and the average of all values. take numbers from list one by one, check if divisible by 3- average of all number.
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	public class Main {
	    public static void main(String[] args) {
	       myMethod();
	    }
	 public static void myMethod (){
	       Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a number");
	        List <String> inputs = new ArrayList<>();
	        do {
	            String number= scan.next();
	            System.out.println("Enter another number");
	            if (number.equalsIgnoreCase("end")){
	                break;
	            }else {
	                inputs.add(number);
	            }
	        }while(true);
	        long numbersDivisibleByThree= inputs.stream().mapToInt(Integer::valueOf).filter(number-> number%3==0).count();
	        double average= inputs.stream().mapToInt(Integer::valueOf).average().getAsDouble();
	        System.out.println("The numbers divisible by 3: "+numbersDivisibleByThree+ " The average of number:"+ average);
	}
	}

