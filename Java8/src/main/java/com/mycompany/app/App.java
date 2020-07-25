package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Average of a list of integers\n2. Return strings that start with 'a' and have exactly 3 letters\n3. Return list of all palindrome strings from list of strings." );
        System.out.println("Enter your choice");
        int n=sc.nextInt();

        if(n>0 && n<=3){
            System.out.println("Enter list length:");
            int l=sc.nextInt();
            if(n==1){
                System.out.println("Enter list of integers:");
                List<Integer> lst = new ArrayList<Integer>();
                for(int i=0;i<l;++i){
                    lst.add(sc.nextInt());
                }
                ListAverage a=new ListAverage();
                System.out.println("Average: "+a.avgCalculate(lst));
            }
            else if(n==2){
                System.out.println("Enter strings line by line:");
                List<String> lst=new ArrayList<String>();
                for(int i=0;i<=l;++i){
                    lst.add(sc.nextLine());
                }
                ListOfPalindromes a=new ListOfPalindromes();
                lst=a.typeCalculate(lst);
                System.out.println("list of strings that start with 'a' and have exactly 3 letters: ");
                for(String i: lst){
                    System.out.println(i);
                }

            }
            else if(n==3){
                System.out.println("Enter strings line by  line:");
                List<String> lst=new ArrayList<String>();
                for(int i=0;i<=l;++i){
                    lst.add(sc.nextLine());
                }
                ListOfStrings a=new ListOfStrings();
                lst=a.palCalculate(lst);
                System.out.println("List of Palindrome strings: ");
                for(String i: lst){
                    System.out.println(i);
                }
            }

        }
    }

}