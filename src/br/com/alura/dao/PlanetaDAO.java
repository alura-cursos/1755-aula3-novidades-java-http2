package br.com.alura.dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class PlanetaDAO {

	public void listar() throws URISyntaxException {
		HttpClient httpClient = HttpClient.newBuilder()
				.followRedirects(Redirect.ALWAYS)
				.build();

		httpClient.sendAsync( 
				HttpRequest.newBuilder()
				.uri(new URI("https://swapi.co/api/planets/"))
				.GET()
				.build(), BodyHandlers.ofString())
		.whenComplete((s,t) -> System.out.println(s.body()));
	}
}
