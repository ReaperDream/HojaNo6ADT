import java.util.Scanner;

/**
 * Programa principal ejecutable.
 */
public final class Principal {

    public static void main(String... args) {
        mkMenu("Seleccione el tipo de Set que desea:\n" + "1. Hash set\n" + "2. Tree set\n" +
                "3. Linked Hash Set", 1, 3);
    }

    private static int mkMenu(String menu, int min, int max) {
        System.out.println(menu);
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        while ((val < min) || (val > max)) {
            System.out.print("Ingrese una opción correcta: ");
            val = sc.nextInt();
        }
        return val;
    }
}
