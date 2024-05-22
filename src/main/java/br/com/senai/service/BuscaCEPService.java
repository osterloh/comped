package br.com.senai.service;

import br.com.senai.dto.EnderecoViaCepDTO;
import br.com.senai.util.ConvertJsonToString;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class BuscaCEPService {
    static String apiViaCep = "http://viacep.com.br/ws/";
    static int statusCodeOk = 200;

    public EnderecoViaCepDTO buscaCep(String cep) throws Exception {
        try {
            URL url = new URL(apiViaCep + cep + "/json/ ");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if(conexao.getResponseCode() != statusCodeOk){
                throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());
            }

            BufferedReader response = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String jsonString = ConvertJsonToString.converterJsonToString(response);

            Gson gson = new Gson();
            EnderecoViaCepDTO enderecoViaCepDTO = gson.fromJson(jsonString, EnderecoViaCepDTO.class);

            return enderecoViaCepDTO;
        } catch (Exception e){
            throw new Exception("Error: " + e);
        }
    }
}
