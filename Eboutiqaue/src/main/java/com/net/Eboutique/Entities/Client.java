package com.net.Eboutique.Entities;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable {
	
	private Long idClient ;
	private String nomClient;
	private String addresse;
	private String email;
	private String tel;
    private Collection<Commande> commandes;
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	public Client() {
		
	}
	public Client(String nomClient, String addresse, String email, String tel) {
		super();
		this.nomClient = nomClient;
		this.addresse = addresse;
		this.email = email;
		this.tel = tel;
	}
	
    
}
