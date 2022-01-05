package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        int weight = scanner.nextInt();
        System.out.println("Enter your height");
        float height = scanner.nextFloat();
        float bmi = weight/(height*height);
        if(bmi>=30){
            System.out.println("Obese");
        } else if(bmi>= 25 && bmi < 30){
            System.out.println("Overweight");
        } else if(bmi >=18.5 && bmi<25){
            System.out.println("Normal");
        } else if(bmi < 18.5){
            System.out.println("Underweight");
        }
    }
}
