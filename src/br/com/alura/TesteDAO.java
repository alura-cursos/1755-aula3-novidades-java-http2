package br.com.alura;

import java.net.URISyntaxException;

import br.com.alura.dao.CriaturaDAO;
import br.com.alura.dao.GalaxiaDAO;
import br.com.alura.dao.PlanetaDAO;

public class TesteDAO {

	public static void main(String[] args) throws URISyntaxException, InterruptedException {

		new PlanetaDAO().listar();

		new CriaturaDAO().listar()
			.stream().forEach(System.out::println);
		
		new GalaxiaDAO().listar()
			.stream().forEach(System.out::println);
	}
}
