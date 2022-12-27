import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        System.out.print("Please imput a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            System.out.println(" you imputted positive number");
        }
        else if(number < 0){ 
            System.out.println(" You imputted negative number");
        }
        else {
            System.out.println(" you imputted zero number");
        }
        System.out.println("You imputted: " + number);

    }
}
