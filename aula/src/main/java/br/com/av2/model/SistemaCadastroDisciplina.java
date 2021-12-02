package br.com.av2.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastroDisciplina {
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void adicionar(Disciplina e) {
		disciplinas.add(e);
	}
	
	public List<Disciplina> listarDisciplinas(){
		return disciplinas;
	}
	
}
