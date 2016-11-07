package com.stefanini.model;
// Generated 07/11/2016 12:04:56 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Infracoes generated by hbm2java
 */
@Entity
@Table(name = "infracoes", catalog = "db_hackathon")
public class Infracoes implements java.io.Serializable {

	private Integer idInfracao;
	private int idAgente;
	private int idLocalInfracao;
	private int idTipoInfracao;
	private String placa;
	private Integer velocidade;

	public Infracoes() {
	}

	public Infracoes(int idAgente, int idLocalInfracao, int idTipoInfracao, String placa) {
		this.idAgente = idAgente;
		this.idLocalInfracao = idLocalInfracao;
		this.idTipoInfracao = idTipoInfracao;
		this.placa = placa;
	}

	public Infracoes(int idAgente, int idLocalInfracao, int idTipoInfracao, String placa, Integer velocidade) {
		this.idAgente = idAgente;
		this.idLocalInfracao = idLocalInfracao;
		this.idTipoInfracao = idTipoInfracao;
		this.placa = placa;
		this.velocidade = velocidade;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idInfracao", unique = true, nullable = false)
	public Integer getIdInfracao() {
		return this.idInfracao;
	}

	public void setIdInfracao(Integer idInfracao) {
		this.idInfracao = idInfracao;
	}

	@Column(name = "idAgente", nullable = false)
	public int getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

	@Column(name = "idLocalInfracao", nullable = false)
	public int getIdLocalInfracao() {
		return this.idLocalInfracao;
	}

	public void setIdLocalInfracao(int idLocalInfracao) {
		this.idLocalInfracao = idLocalInfracao;
	}

	@Column(name = "idTipoInfracao", nullable = false)
	public int getIdTipoInfracao() {
		return this.idTipoInfracao;
	}

	public void setIdTipoInfracao(int idTipoInfracao) {
		this.idTipoInfracao = idTipoInfracao;
	}

	@Column(name = "placa", nullable = false, length = 7)
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Column(name = "velocidade")
	public Integer getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

}
