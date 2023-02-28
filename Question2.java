


import java.util.Scanner;

public class Question2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input="";
        while(true){
            System.out.print("Enter text: ");
            String line=sc.nextLine();
            if(line.equals("XDONE")){
                break;
            }
            input+=line+"\n";
        }
        System.out.println("Entered text is:");
        System.out.println(input);

    }
}
