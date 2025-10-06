import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion, numero;

        do {
            System.out.println("\n--- Menú Árbol Binario ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número a insertar: ");
                    numero = sc.nextInt();
                    arbol.insertar(numero);
                    break;
                case 2:
                    System.out.println("Recorrido Inorden:");
                    arbol.inorden();
                    break;
                case 3:
                    System.out.print("Ingrese número a buscar: ");
                    numero = sc.nextInt();
                    if (arbol.buscar(numero)) {
                        System.out.println("El número " + numero + " SÍ existe en el árbol.");
                    } else {
                        System.out.println("El número " + numero + " NO existe en el árbol.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
