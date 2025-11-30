import java.util.Scanner;
public class E13{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int[][] m=new int[3][4];

        System.out.println("Ingrese el nivel ");
	System.out.println(" 0=Basico");
	System.out.println("1=Medio");
	System.out.println("2=Perfeccionamiento");
	System.out.println(" ");
        System.out.println("Idiomas ");
	System.out.println("0=Inglés ");
	System.out.println("1=Francés");
	System.out.println("2=Alemán ");
	System.out.println("3=Ruso ");

        for(int i=0;i<12;i++){
            System.out.print("Nivel: ");
            int nivel=sc.nextInt();

            System.out.print("Idioma: ");
            int idioma=sc.nextInt();
            m[nivel][idioma]++;
        			}
        System.out.println("Matriz resultante:");
        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(m[i][j] + " ");
            		}
            System.out.println();
        	}
    	}
}
