import java.util.Scanner;
public class E15{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        String[] paises=new String[4];
        double[][] temp=new double[4][3];
        double[] promedio=new double[4];

        for(int i=0; i<4;i++){
            System.out.print("nombre del pais " + (i+1) + ": ");
            paises[i] = sc.next();

            for(int j=0; j<3;j++){
                System.out.print("temperatura mes " + (j+1) + ": ");
                temp[i][j]=sc.nextDouble();
                promedio[i] += temp[i][j];
            			}
            promedio[i] /=3;
        		}
        int mayor=0;
        for(int i=0;i<4;i++){
            if(promedio[i] > promedio[mayor]){
            mayor =i;
            		}
        	}
        System.out.println("temperaturas ingresadas:");
        for(int i=0;i<4;i++){
            System.out.print(paises[i] + ": ");
            for(int j=0;j<3;j++){
                System.out.print(temp[i][j] + " ");
           	 	}
         System.out.println(" | promedio: " + promedio[i]);
        	}
        System.out.println("país con mayor temperatura promedio: " + paises[mayor]);
    	}
}
