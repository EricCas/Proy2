import java.util.Scanner;
public class E4{
    public static void main(String[] args) {	
        Scanner sc = new Scanner(System.in);
        double saldo = 5000;
        char continuar = 's';

        while(continuar == 's' || continuar == 'S'){
            System.out.println("Saldo actual es: " + saldo);
            System.out.print("cuanto quiere retirar?: ");
            double retiro = sc.nextDouble();

            if(retiro <= saldo){
                saldo -= retiro;
                	System.out.println("retiro realizado su nuevo es saldo: " + saldo);
            } else {
               		System.out.println("saldo insuficiente.");
            }

            System.out.print("desea hacer otro retiro? s/n: ");
            continuar = sc.next().charAt(0); 
       		 }

        System.out.println("Programa finalizado.");
   	 }
}

