package fr.esgi.verbes_irreguliers.thomas.buisness;

public class Partie {

	// attribut
	private Long id;
	private int nbQuestionsSouhaitees;
	private int score;
	private Long compteur = 0L;

	// constructeur
	public Partie(int nbQuestionsSouhaitees, int score) {
		id = ++compteur;
		this.nbQuestionsSouhaitees = nbQuestionsSouhaitees;
		this.score = score;
	}

	// getter and setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNbQuestionsSouhaitees() {
		return nbQuestionsSouhaitees;
	}

	public void setNbQuestionsSouhaitees(int nbQuestionsSouhaitees) {
		this.nbQuestionsSouhaitees = nbQuestionsSouhaitees;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Long getCompteur() {
		return compteur;
	}

	public void setCompteur(Long compteur) {
		this.compteur = compteur;
	}

	// hashcode/ equal
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compteur == null) ? 0 : compteur.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + nbQuestionsSouhaitees;
		result = prime * result + score;
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
		Partie other = (Partie) obj;
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
		if (nbQuestionsSouhaitees != other.nbQuestionsSouhaitees)
			return false;
		if (score != other.score)
			return false;
		return true;
	}

	// to string
	@Override
	public String toString() {
		return "Partie [id=" + id + ", nbQuestionsSouhaitees=" + nbQuestionsSouhaitees + ", score=" + score
				+ ", compteur=" + compteur + "]";
	}
}
