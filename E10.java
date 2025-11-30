import java.util.Scanner;
public class E10{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] n=new int[10];

        for(int i=0;i<10;i++){
            System.out.print("numero " +(i+1) + ": ");
            n[i] = sc.nextInt();
       		 }

        System.out.println("Números en orden inverso:");
        for(int i=9;i>=0;i--){
            System.out.println(n[i]);
       		 }
    	}
}
