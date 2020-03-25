package br.com.alura.dao;

import java.util.ArrayList;
import java.util.List;

public class CriaturaDAO {

	public List<String> listar() throws InterruptedException {
		List<String> criaturas = new ArrayList<String>();
		Thread.sleep(2000);
		criaturas.add("Shewbacca");
		criaturas.add("Yoda");
		return criaturas;
	}
}
