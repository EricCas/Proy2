import java.util.Scanner;
public class cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar = 'S';
        int opcion;
        
        while(continuar == 'S' || continuar == 's'){
            System.out.println("\nPago servicio Energia ");
            System.out.println("1.- Consulta ");
            System.out.println("2.- Pago del mes ");
            System.out.println("3.- Pago del adeudo");
            System.out.println("4.- Salir ");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Tiene un adeudo de $1000 ");
                break;

                case 2:
                    System.out.println("Pago mensual de $1000 ");
                break;

                case 3:
                    System.out.println("Pago de adeudo de $1000 ");
                break;

                case 4:
                    System.out.println("Gracias por usar el cajero.");
                    return;

                default:
                    System.out.println("opción no disponible.");
                break;
         	   }

            System.out.print(" Desea continuar? S/N : ");
           	 continuar = sc.next().charAt(0);
     	   }

        	System.out.println("Progama finalizado");
   	 }
}