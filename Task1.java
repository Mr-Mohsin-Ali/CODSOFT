 package CODSOFT;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
       int choice=1;
        while (choice !=0) {
            
        
        int rnum;rnum=(int)(Math.random()*100);
        int num;
        Scanner sc =new Scanner(System.in);
        int life =3;

while(life>0){
        System.out.print("Guess The number : ");
        num=sc.nextInt();
        if (num==rnum) {
            System.out.println("YOU FOUND ME ! IN "+(4-life)+ " Attempt");
            break ;
        }
        else if (num>rnum) {
            life--;
            System.out.println("TOO HIGH GUESS !  "+life+"  life left");
        }
        
        else if (num<rnum) {
            life--;
            System.out.println("TOO LOW GUESS !  "+life+"  life left");
        }
        if(life==0){System.out.println("Game Over the correct number is "+rnum);}
    }
    System.out.println("Enter 0 to exit any other number to retry ");
    choice=sc.nextInt();

    }

    
}

}