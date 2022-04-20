package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Società {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String regioneSociale;

	@Column(length = 2000)
	private String via;
	@Column
	private int civico;
	@Column
	private String comune;
	@Column
	private String provincia;
	@Column
	private int cap;

	@Column
	private long numeroTelefono;

	public Società(Long id, String regioneSociale, String via, int civico, String comune, String provincia, int cap,
			long numeroTelefono) {
		super();
		this.id = id;
		this.regioneSociale = regioneSociale;
		this.via = via;
		this.civico = civico;
		this.comune = comune;
		this.provincia = provincia;
		this.cap = cap;
		this.numeroTelefono = numeroTelefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegioneSociale() {
		return regioneSociale;
	}

	public void setRegioneSociale(String regioneSociale) {
		this.regioneSociale = regioneSociale;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		this.civico = civico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public long getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(long numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	
}
