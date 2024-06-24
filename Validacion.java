import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Validacion{

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/31dce0a0a9c450355fe2c362/latest/USD";

    public static JsonObject getTasaCambio(HttpClient client) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(API_URL))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            return jsonObject.getAsJsonObject("conversion_rates");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

