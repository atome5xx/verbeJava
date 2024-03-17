package fr.esgi.verbes_irreguliers.thomas.buisness;

public class Verbe {

	// attribut
	private Long id;
	private String baseVerbale;
	private String preterit;
	private String participePasse;
	private String traduction;
	private Long compteur = 0L;

	// constructor
	public Verbe(String baseVerbale, String preterit, String participePasse, String traduction) {
		id = ++compteur;
		this.baseVerbale = baseVerbale;
		this.preterit = preterit;
		this.participePasse = participePasse;
		this.traduction = traduction;
		compteur = ++compteur;
	}

	// getter and setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBaseVerbale() {
		return baseVerbale;
	}

	public void setBaseVerbale(String baseVerbale) {
		this.baseVerbale = baseVerbale;
	}

	public String getPreterit() {
		return preterit;
	}

	public void setPreterit(String preterit) {
		this.preterit = preterit;
	}

	public String getParticipePasse() {
		return participePasse;
	}

	public void setParticipePasse(String participePasse) {
		this.participePasse = participePasse;
	}

	public String getTraduction() {
		return traduction;
	}

	public void setTraduction(String traduction) {
		this.traduction = traduction;
	}

	public Long getCompteur() {
		return compteur;
	}

	public void setCompteur(Long compteur) {
		this.compteur = compteur;
	}

	// hashcode and equal
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baseVerbale == null) ? 0 : baseVerbale.hashCode());
		result = prime * result + ((compteur == null) ? 0 : compteur.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((participePasse == null) ? 0 : participePasse.hashCode());
		result = prime * result + ((preterit == null) ? 0 : preterit.hashCode());
		result = prime * result + ((traduction == null) ? 0 : traduction.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Verbe other = (Verbe) obj;
		if (baseVerbale == null) {
			if (other.baseVerbale != null)
				return false;
		} else if (!baseVerbale.equals(other.baseVerbale))
			return false;
		if (compteur == null) {
			if (other.compteur != null)
				return false;
		} else if (!compteur.equals(other.compteur))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (participePasse == null) {
			if (other.participePasse != null)
				return false;
		} else if (!participePasse.equals(other.participePasse))
			return false;
		if (preterit == null) {
			if (other.preterit != null)
				return false;
		} else if (!preterit.equals(other.preterit))
			return false;
		if (traduction == null) {
			if (other.traduction != null)
				return false;
		} else if (!traduction.equals(other.traduction))
			return false;
		return true;
	}

	// to string
	@Override
	public String toString() {
		return "Verbe [id=" + id + ", baseVerbale=" + baseVerbale + ", preterit=" + preterit + ", participePasse="
				+ participePasse + ", traduction=" + traduction + ", compteur=" + compteur + "]";
	}
}
