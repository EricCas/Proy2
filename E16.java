import java.util.Scanner;
public class E16{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String[][] arti=new String[3][3];

        for(int i=0;i<3;i++){
            System.out.println("articulo " + (i+1));
            System.out.print("nombre: ");
            arti[i][0] = sc.nextLine();

            System.out.print("talla: ");
            arti[i][1] =sc.nextLine();

            System.out.print("color: ");
            arti[i][2] =sc.nextLine();
        		}

        System.out.println("\nTabla de articulos:");
        System.out.println("Articulo - Talla - Color");

        for(int i=0;i<3;i++){
            System.out.println(arti[i][0] + " | " + arti[i][1] + " | " + arti[i][2]);
        	}
    	}
}
