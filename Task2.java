
 import java.util.*;;
 class Subject {
    int totalmarks;
    int obtmarks;
    String subject;
    Scanner sc =new Scanner(System.in);
    void input(){
        System.out.println("Enter Subject Name : ");
        subject=sc.next();
        System.out.println("Enter Total Marks for "+subject+" : ");
        
        totalmarks=sc.nextInt();
        System.out.println("Enter Obtain Marks for "+subject+" : ");
        
        obtmarks=sc.nextInt();

    }
    void output(){
        System.out.println(subject+"\t\t"+obtmarks+"\t\t"+totalmarks);
    }
    
}


public class Task2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int j,tobt=0,ttm=0;
        System.out.println("Enter how many subject You have ");
        j=scn.nextInt();
        Subject[] sub=new Subject[j];
        for(int i=0;i<j;i++){
            sub[i]=new Subject();
            sub[i].input();
            tobt+=sub[i].obtmarks;
            ttm+=sub[i].totalmarks;
        
        }
        System.out.println("subject\t\tobtmarks\t\ttmarks");
    
        for(int i=0;i<j;i++){
         sub[i].output();
        }
        char grade;
        int per=(tobt*100)/ttm;
        if (per>80) {
            grade='A';
            
        }
        else if(per>70){
            grade ='B';
        }
        else if(per>60){
            grade ='C';
        }
        else if(per>50){
            grade ='D';
        }
        else {
            grade ='F';
        }
System.out.println("\n TOTAL MARSKS = "+ttm+"\tTOTAL OBTAINED MARKS = "+tobt+"\n PERCENTAGE  =  "+per+"\tGRADE  =  "+grade);
        
    }
}
