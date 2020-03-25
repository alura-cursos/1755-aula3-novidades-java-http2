package br.com.alura;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TesteHttp2 {

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {

		URI uri = new URI("https://turini.github.io/livro-java-9/");

		HttpClient httpClient = HttpClient.newHttpClient();

		HttpRequest httpRequest = HttpRequest.newBuilder(uri).GET().build();
		HttpResponse<String> httpResponse =  
				httpClient.send(httpRequest, BodyHandlers.ofString());

		System.out.format(
				"Status code: %s %n"
						+ "URI: %s %n"
						+ "Http version: %s %n"
						+ "Body: %s", httpResponse.statusCode(), 
						httpResponse.uri(), httpResponse.version(), 
						httpResponse.body());
	}
}
