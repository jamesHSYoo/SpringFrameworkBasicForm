package com.juro.study.service;

import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class HttpService {

    private String url;
    public HttpService(){ }

    public void setUrl(String url){
        this.url = url;
    }

    public void request(Map<String, Object> param) throws IOException {
        BufferedReader in = null;
        String result = null;
        ObjectMapper mapper = new ObjectMapper();
        try{
            URL targetUrl = new URL(this.url + "/startup");
            HttpURLConnection conn = (HttpURLConnection) targetUrl.openConnection();

            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            conn.setRequestProperty("Content-Type", "application/json");
            // param to string which forms of json
            String jsonParam = mapper.writeValueAsString(param);

            // string to byte
            byte[] postDataBytes = jsonParam.getBytes("UTF-8");
            conn.getOutputStream().write(postDataBytes);

            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

            String inputLine;
            StringBuffer response = new StringBuffer();
            while((inputLine = in.readLine()) != null) { // response 출력
                response.append(inputLine);
            }
            result = response.toString();
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            if(in != null)
                in.close();
        }
        Map<String, Object> resultMap = mapper.readValue(result, Map.class);
        System.out.println(resultMap.get("resultCode"));
    }
}
