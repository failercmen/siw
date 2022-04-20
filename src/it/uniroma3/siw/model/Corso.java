package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Corso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private LocalDate dataInizio;
	
	@Column
	private int durataInMesi;
	
	
	//essendo un sistema che eroga corsi di formazione è subito necessario sapere
	//quale professore è abbinato al corso
	@ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Docente docente;
	
	@ManyToMany
	private List<Allievo> listaAllievi;

	public Corso(Long id, String nome, LocalDate dataInizio, int durataInMesi, Docente docente,
			List<Allievo> listaAllievi) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInizio = dataInizio;
		this.durataInMesi = durataInMesi;
		this.docente = docente;
		this.listaAllievi = listaAllievi;
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

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurataInMesi() {
		return durataInMesi;
	}

	public void setDurataInMesi(int durataInMesi) {
		this.durataInMesi = durataInMesi;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Allievo> getListaAllievi() {
		return listaAllievi;
	}

	public void setListaAllievi(List<Allievo> listaAllievi) {
		this.listaAllievi = listaAllievi;
	}
	
}
