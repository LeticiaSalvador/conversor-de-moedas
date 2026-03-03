package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultaMoeda {

    private final String apiKey = "sua chave aqui";

    public double buscarTaxa(String base, String destino) {

        try {
            String url = "https://v6.exchangerate-api.com/v6/"
                    + apiKey + "/pair/" + base + "/" + destino;

            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest requisicao = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> resposta =
                    cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

            if (resposta.statusCode() != 200) {
                throw new RuntimeException("Erro na requisição");
            }

            JsonElement elemento = JsonParser.parseString(resposta.body());
            JsonObject objeto = elemento.getAsJsonObject();

            return objeto.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar taxa: " + e.getMessage());
        }
    }
}