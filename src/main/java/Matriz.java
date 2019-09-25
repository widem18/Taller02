import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriz {


    public static int pedirDias() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dias para los que necesita hacer la evaluacion");
        int numero;
        try {
            numero = sc.nextInt();
            if (numero < 1 || numero > 31) {
                numero = pedirDias();
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo numeros enteros dentro del rango establecido");
            numero = pedirDias();
        }
        return numero;
    }

    public static double[][] matriz() {
        double[][] mtriz = new double[pedirDias()][24];
        for (int i = 0; i < mtriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < mtriz[i].length; j++) {
                mtriz[i][j] = Math.random() * 8.5 + 1;
                System.out.print(mtriz[i][j]);
                if (j != mtriz[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
        return mtriz;
    }
}

