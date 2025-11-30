import java.util.Scanner;
public class E14{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        String[] empleados=new String[4];
        double[][] sueldos=new double[4][3];
        double[] totalEmpleado=new double[4];

        for(int i=0;i<4;i++){
            System.out.print("Nombre del empleado " + (i+1) + ": ");
            empleados[i]=sc.next();

            for(int j=0;j<3;j++){
                System.out.print("Sueldo mes " + (j+1) + ": ");
                sueldos[i][j] =sc.nextDouble();
                totalEmpleado[i] +=sueldos[i][j];
            		}
        	}

        double totalGeneral=0;
        int mayor=0;
        for(int i =0;i<4;i++){
            totalGeneral +=totalEmpleado[i];

            if(totalEmpleado[i] > totalEmpleado[mayor]){
                mayor=i;
            		}
        	}
        System.out.println("Total pagado en sueldos: " + totalGeneral);
        System.out.println("Empleado con mayor ingreso: " + empleados[mayor]);
    	}
}
