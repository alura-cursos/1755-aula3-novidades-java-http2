package br.com.alura.dao;

import java.util.ArrayList;
import java.util.List;

public class GalaxiaDAO {

	public List<String> listar() throws InterruptedException {
		List<String> galaxias = new ArrayList<>();
		Thread.sleep(2000);
		galaxias.add("A Pequena Nuvem de Magalh�es");
		galaxias.add("A Grande Nuvem de Magalh�es");
		galaxias.add("A gal�xia de Andr�meda");
		return galaxias;
	}
}
