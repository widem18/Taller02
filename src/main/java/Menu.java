import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la opcion que corresponda. 1 es para mostrar el sismo mas intenso, 2 para mostrar los sismos mayores a 4 grados y 3 para salir");
        int bandera = sc.nextInt();

        while (bandera > 1 || bandera < 3) {
            switch (bandera) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }

    }
}

