package br.com.senai.util;

import java.io.BufferedReader;
import java.io.IOException;

public class ConvertJsonToString {
    public static String converterJsonToString(BufferedReader bufferedReader) throws IOException {
        String response, jsonToString = "";

        while((response = bufferedReader.readLine()) != null){
            jsonToString += response;
        }

        return jsonToString;
    }
}
