import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

    // Clase interna para mapear cada personaje
    static class Personaje {
        int id;
        String fullName;
        String title;
        String family;

        @Override
        public String toString() {
            return "👤 " + fullName + " | 🏰 " + family + " | 🎖️ " + title;
        }
    }

    public static void main(String[] args) {
        try {
            // Crear cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Crear petición a la API
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://thronesapi.com/api/v2/Characters"))
                    .GET()
                    .build();

            // Enviar y recibir la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertir JSON a lista de objetos
            Gson gson = new Gson();
            List<Personaje> personajes = gson.fromJson(response.body(), new TypeToken<List<Personaje>>() {}.getType());

            // Mostrar personajes
            String input;
            int personaje;
            Scanner teclado = new Scanner(System.in);

            while (true) {
                System.out.println("\n📜 Ingresá un número de personaje (0 a 53) o escribí 'salir' para terminar:");
                input = teclado.nextLine();

                if (input.equalsIgnoreCase("salir")) {
                    System.out.println("👋 ¡Adiós!");
                    break;
                }

                try {
                    personaje = Integer.parseInt(input);
                    boolean encontrado = false;

                    for (Personaje p : personajes) {
                        if (p.id == personaje) {
                            System.out.println("🎯 Personaje encontrado:");
                            System.out.println(p);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("⚠️ No se encontró ese personaje. Intentá con un número válido.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("❌ Entrada no válida. Escribí un número o 'salir'.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}