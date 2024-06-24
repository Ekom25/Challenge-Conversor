import com.google.gson.JsonObject;

import java.net.http.HttpClient;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();
        JsonObject rates = Validacion.getTasaCambio(client);

        if (rates == null) {
            System.out.println("No se pudieron obtener las tasas de cambio.");
            return;
        }

        while (true) {
            printMenu();
            try {
                int choice = getMenuChoice(scanner);
                if (choice == 7) {
                    System.out.println("Gracias por usar el conversor de moneda.");
                    break;
                }
                double amount = getAmount(scanner);
                handleConversion(choice, amount, rates);
            } catch (Excepcion e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("*********************************************************************");
        System.out.println("Menú, bienvenido al conversor de moneda (Divisas):");
        System.out.println("1 - Dolar a Peso argentino");
        System.out.println("2 - Dolar a Peso colombiano");
        System.out.println("3 - Dolar a Real brasileño");
        System.out.println("4 - Peso argentino a Dolar");
        System.out.println("5 - Peso colombiano a Dolar");
        System.out.println("6 - Real brasileño a Dolar");
        System.out.println("7 - Salir");
        System.out.println("Elija una opción:");
        System.out.println("*********************************************************************");
    }

    private static int getMenuChoice(Scanner scanner) throws Excepcion {
        try {
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 7) {
                throw new Excepcion("Entrada no válida. Por favor, intente de nuevo.");
            }
            return choice;
        } catch (InputMismatchException e) {
            scanner.next(); // Clear the invalid input
            throw new Excepcion("Entrada no válida. Por favor, intente de nuevo.");
        }
    }

    private static double getAmount(Scanner scanner) throws Excepcion{
        System.out.print("Ingrese la cantidad: ");
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.next(); // Clear the invalid input
            throw new Excepcion("Entrada no válida. Por favor, intente de nuevo.");
        }
    }

    private static void handleConversion(int choice, double amount, JsonObject rates) {
        switch (choice) {
            case 1:
                Convertidor.ConvertirDivisa(amount, "USD", "ARS", rates);
                break;
            case 2:
                Convertidor.ConvertirDivisa(amount, "USD", "COP", rates);
                break;
            case 3:
                Convertidor.ConvertirDivisa(amount, "USD", "BRL", rates);
                break;
            case 4:
                Convertidor.ConvertirDivisa(amount, "ARS", "USD", rates);
                break;
            case 5:
                Convertidor.ConvertirDivisa(amount, "COP", "USD", rates);
                break;
            case 6:
                Convertidor.ConvertirDivisa(amount, "BRL", "USD", rates);
                break;
        }
    }
}
