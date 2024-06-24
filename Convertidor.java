import com.google.gson.JsonObject;

public class Convertidor {

    public static void ConvertirDivisa(double amount, String fromCurrency, String toCurrency, JsonObject rates) {
        double fromRate = rates.get(fromCurrency).getAsDouble();
        double toRate = rates.get(toCurrency).getAsDouble();
        double convertedAmount = amount * (toRate / fromRate);
        System.out.printf("La cantidad convertida es: %.2f %s%n", convertedAmount, toCurrency);
    }
}
