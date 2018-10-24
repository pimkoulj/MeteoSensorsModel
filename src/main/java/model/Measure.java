package model;

import java.util.Date;

public class Measure {
	private String nom;
	private long date;
	private String type;
	private double valeur;
	private int id;
	private String ville;
	private String pays;
	
	public Measure() {}
	
	public Measure(String nom, long date, String type, double valeur, int id, String ville, String pays) {
		super();
		this.nom = nom;
		this.date = date;
		this.type = type;
		this.valeur = valeur;
		this.id = id;
		this.ville = ville;
		this.pays = pays;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	
}
