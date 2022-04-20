package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@Column
	private Long partitaIva;
	
	@Column
	private LocalDate dataNascita;

	@Column
	private String luogoNascita;
	
	
	//è utile sapere dato un professore tutti i possibili corsi a cui
	//questo insegna
	@OneToMany(mappedBy = "docente",fetch = FetchType.EAGER)
	private List<Corso> corsi;

	public Docente(Long id, String nome, String cognome, Long partitaIva, LocalDate dataNascita, String luogoNascita,
			List<Corso> corsi) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.partitaIva = partitaIva;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.corsi = corsi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Long getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(Long partitaIva) {
		this.partitaIva = partitaIva;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	
	
}


