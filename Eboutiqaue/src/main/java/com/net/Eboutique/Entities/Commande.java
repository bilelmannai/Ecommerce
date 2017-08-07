package com.net.Eboutique.Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Commande  implements Serializable {
	
	
	private Long idCommande;
	private Date dateCommande;
	private Collection<LigneCommande> items;
	private Client client;
	

}
