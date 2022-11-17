package com.starton.sdk.initializer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Initializer {

    public Initializer() throws IOException {
        URL url = new URL("https://api.starton.io/v2/wallet/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        con.setRequestProperty("x-api-key", "your api key");
        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String strCurrentLine;
        while ((strCurrentLine = br.readLine()) != null) {
            System.out.println(strCurrentLine);
        }
    }
}
