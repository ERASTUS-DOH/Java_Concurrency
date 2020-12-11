package com.Turntabl.io;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class WordCountHandler implements HttpHandler {

    private String text;

    public WordCountHandler(String text){
        this.text = text;
    }

    public void handle(HttpExchange httpExchange) throws IOException{
        String query = httpExchange.getRequestURI().getQuery();
        String [] keyValue = query.split("=");
        String action = keyValue[0];
        String word = keyValue[1];
        if(!action.equals("word")){
            httpExchange.sendResponseHeaders(400,0);
            return;
        }
        long count = countword(word);

        byte [] response = Long.toString(count).getBytes();
        httpExchange.sendResponseHeaders(200,response.length);
        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(response);
        outputStream.close();
    }

    private long countword(String word){
        long count = 0;
        int index = 0;
        while(index >= 0){
            index = text.indexOf(word, index);
            if(index >= 0){
                count++;
                index++;
            }
        }
        return count;
    }
}
