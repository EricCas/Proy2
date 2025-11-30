import java.util.Scanner;
public class E11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] n=new int[8];

        for(int i=0;i<8;i++){
            System.out.print("Número " + (i+1) + ": ");
            n[i] =sc.nextInt();
        }

        System.out.print("numero a buscar: ");
        int buscar=sc.nextInt();

        boolean existe = false;

        for(int i=0;i<8;i++){
            if(n[i] == buscar){
                existe=true;
            		}
       		 }
        if(existe){
            System.out.println("numero si esta en el arreglo.");
        } else {
            System.out.println("numero no esta en el arreglo.");
        	}
    	}
}
