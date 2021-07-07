package settimana3;

import java.math.BigDecimal;

public class Impiegato {
	private String nome;
	private String cognome;

	public enum Sesso {
		M, F
	};

	private Sesso sesso;
	private BigDecimal stipendio;

	public Impiegato(String nome, String cognome, Sesso sesso, BigDecimal stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.stipendio = stipendio;
	}

	public BigDecimal getStipendio() {
		return stipendio;
	}

	public void setStipendio(BigDecimal stipendio) {
		this.stipendio = stipendio;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Sesso getSesso() {
		return sesso;
	}

}
