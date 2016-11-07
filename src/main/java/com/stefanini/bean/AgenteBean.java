package com.stefanini.bean;

import javax.inject.Inject;
import javax.inject.Named;
import com.stefanini.model.Agente;
import com.stefanini.repository.AgenteRepository;

@Named("agenteMB")
public class AgenteBean {
	
	@Inject
	private Agente agente;
	private AgenteRepository repository;
	
	public AgenteBean(){
		
		repository = new AgenteRepository();
		agente = new Agente();
		
	}
	
	public AgenteRepository getRepository() {
		return repository;
	}

	public void setRepository(AgenteRepository repository) {
		this.repository = repository;
	}
	
	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public String chamada(){
		
		return "pages/Teste";
		
	}
	
	public void inserir(){
		
		repository.incluir(agente);
		
	}
	

}
