package br.com.youtube.mongobd.model;

import java.time.LocalDate;

public class StudentRequest {
	
	private String nome;
	private LocalDate birthDate;
	private String document;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}

}
