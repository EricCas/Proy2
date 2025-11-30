import java.util.Scanner;
public class E9{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double[] cal=new double[6];
        double suma=0;

        for(int i=0;i<6;i++){
            System.out.print("Calificación " + (i+1) + ": ");
            cal[i]=sc.nextDouble();
            suma+=cal[i];
        }
        double promedio=suma/6;
        	System.out.println("calificaciones:");
       	 for(int i=0;i<6;i++){
            		System.out.print(cal[i]+ " ");
        	}

        System.out.println("\npromedio final "+promedio);
    	}
}
