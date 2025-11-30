import java.util.Scanner;
public class E17{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    String[][] at = new String[5][4];
    double mejorTiempo = 9999;
    int indiceMejor = 0;

        for(int i=0;i<5;i++){
            System.out.println("Atleta " + (i+1));

            System.out.print("nombre: ");
            	at[i][0] =sc.next();

            System.out.print("apellido: ");
            	at[i][1] =sc.next();

            System.out.print("especialidad(metros): ");
            	at[i][2] =sc.next();

            System.out.print("tiempo (s): ");
            double tiempo =sc.nextDouble();
            	at[i][3]="" + tiempo;

            if(tiempo < mejorTiempo){
                mejorTiempo = tiempo;
                	indiceMejor = i;
           		 	}
       		 }

        System.out.println("\nTabla de Atletas:");
        for(int i=0;i<5;i++){
            System.out.println(at[i][0] + " " + at[i][1] + " | " +
                               at[i][2] + " | " +
                               at[i][3] + "s");
        			}

        System.out.println("\nmejor tiempo: " + at[indiceMejor][0] + " " +
                           at[indiceMejor][1] + " con " + mejorTiempo + "s");
    		}
}

