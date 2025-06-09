package api.conversordemoedas;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConversorDeMoedas{

    public double obterTaxaDeCambio(String moedaDe, String moedaPara) {
        try {
            String urlStr = String.format("https://v6.exchangerate-api.com/v6/6322b646d5b23554b57163f2/latest/%s", moedaDe);

            URL url = new URL(urlStr);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
            double taxa = rates.get(moedaPara).getAsDouble();

            return taxa;

        } catch (Exception e) {
            System.out.println("Erro ao obter taxa de câmbio: " + e.getMessage());
            return 0;
        }
    }
}

