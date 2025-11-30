import java.util.Scanner;
public class E12{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double[] ventas=new double[7];
    double total=0;
    int dm=0;

        for(int i=0;i<7;i++){
            System.out.print("Venta día " + (i+1) + ": ");
            ventas[i]=sc.nextDouble();
            total+= ventas[i];

            if(ventas[i] > ventas[dm]){
                dm=i;
            		}
        	}
        System.out.println("venta total de la semana: " + total);
        System.out.println("dia con mayor venta: Dia " + (dm+1));
    	}
}
