

import java.util.Scanner;

public class Question3 {
    public static void area(int rad){
        int area=(22*rad*rad)/7;
        System.out.println(area);
    }
    public static void circumference(int rad){
        int ans=22*rad*2/7;
        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1 for calculating area of circle");
        System.out.println("Enter 2 for calculating circumference of circle");

        int option=sc.nextInt();
        if(option<1 || option>3) {
            System.out.println("Error");
            return;
        }

        System.out.println("Enter radius");
        int r=sc.nextInt();

        switch(option){
            case 1:area(r);
                break;
            case 2:circumference(r);
                break;
            case 3: System.out.println("Exit");
                break;
            default: System.out.println("Error");
        }
    }

}