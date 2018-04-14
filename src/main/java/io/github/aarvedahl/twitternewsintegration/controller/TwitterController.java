package io.github.aarvedahl.twitternewsintegration.controller;

import com.google.gson.Gson;
import io.github.aarvedahl.twitternewsintegration.dto.Status;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

public class TwitterController {
    OkHttpClient client;
    Gson gson = new Gson();

    public Status searchTweets(String searchTweets) {
        // Set the correct header

        Status status = gson.fromJson(run(url), Status.class);
        return status;
    }

    public String run(String url, List<String> header) throws IOException {
        client= new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
