import java.util.Scanner;
public class E6{
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int aprobados=0, reprobados=0;
        double suma=0;

        for(int i=1;i<= 5;i++){
            System.out.print("Calificación " + i + ": ");
           	 double cal=sc.nextDouble();
            if(cal>= 6){
                aprobados++;
            } else {
                reprobados++;
           	 }
            suma+= cal;
      	  	}
        double promedio=suma/5;
        	System.out.println("aprobados " + aprobados);
        	System.out.println("reprobados " + reprobados);
        	System.out.println("promedio grupo " + promedio);
   	 }
}
