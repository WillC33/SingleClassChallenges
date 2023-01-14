import java.net.URI;
import java.net.http.*;
import java.io.IOException;

public class JokeAPI {
    public static void APICall() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jokes-by-api-ninjas.p.rapidapi.com/v1/jokes"))
                .header("X-RapidAPI-Host", keys.keys()[0])
                .header("X-RapidAPI-Key", keys.keys()[1])
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = null;

        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            for (int i = 0; i <= 3; i++) {
                e.printStackTrace();
                APICall();
            }
        }
        assert response != null;
        System.out.println(response.body());
    }

    public static void main(String[] args) {
        APICall();
    }
}

