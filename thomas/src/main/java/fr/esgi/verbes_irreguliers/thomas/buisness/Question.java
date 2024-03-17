package fr.esgi.verbes_irreguliers.thomas.buisness;

import java.time.LocalDateTime;

public class Question {
	// attribut
	private Long id;
	private String reponsePreterit;
	private String reponseParticipePasse;
	private LocalDateTime dateHeureEnvoie;
	private LocalDateTime dateHeureReponse;
	private Long compteur = 0L;

	// constructeur
	public Question(String reponsePreterit, String reponseParticipePasse, LocalDateTime dateHeureEnvoie,
			LocalDateTime dateHeureReponse) {
		id = compteur++;
		this.reponsePreterit = reponsePreterit;
		this.reponseParticipePasse = reponseParticipePasse;
		this.dateHeureEnvoie = dateHeureEnvoie;
		this.dateHeureReponse = dateHeureReponse;
		compteur = ++compteur;
	}

	// getter and setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReponsePreterit() {
		return reponsePreterit;
	}

	public void setReponsePreterit(String reponsePreterit) {
		this.reponsePreterit = reponsePreterit;
	}

	public String getReponseParticipePasse() {
		return reponseParticipePasse;
	}

	public void setReponseParticipePasse(String reponseParticipePasse) {
		this.reponseParticipePasse = reponseParticipePasse;
	}

	public LocalDateTime getDateHeureEnvoie() {
		return dateHeureEnvoie;
	}

	public void setDateHeureEnvoie(LocalDateTime dateHeureEnvoie) {
		this.dateHeureEnvoie = dateHeureEnvoie;
	}

	public LocalDateTime getDateHeureReponse() {
		return dateHeureReponse;
	}

	public void setDateHeureReponse(LocalDateTime dateHeureReponse) {
		this.dateHeureReponse = dateHeureReponse;
	}

	public Long getCompteur() {
		return compteur;
	}

	public void setCompteur(Long compteur) {
		this.compteur = compteur;
	}

	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compteur == null) ? 0 : compteur.hashCode());
		result = prime * result + ((dateHeureEnvoie == null) ? 0 : dateHeureEnvoie.hashCode());
		result = prime * result + ((dateHeureReponse == null) ? 0 : dateHeureReponse.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reponseParticipePasse == null) ? 0 : reponseParticipePasse.hashCode());
		result = prime * result + ((reponsePreterit == null) ? 0 : reponsePreterit.hashCode());
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
		Question other = (Question) obj;
		if (compteur == null) {
			if (other.compteur != null)
				return false;
		} else if (!compteur.equals(other.compteur))
			return false;
		if (dateHeureEnvoie == null) {
			if (other.dateHeureEnvoie != null)
				return false;
		} else if (!dateHeureEnvoie.equals(other.dateHeureEnvoie))
			return false;
		if (dateHeureReponse == null) {
			if (other.dateHeureReponse != null)
				return false;
		} else if (!dateHeureReponse.equals(other.dateHeureReponse))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reponseParticipePasse == null) {
			if (other.reponseParticipePasse != null)
				return false;
		} else if (!reponseParticipePasse.equals(other.reponseParticipePasse))
			return false;
		if (reponsePreterit == null) {
			if (other.reponsePreterit != null)
				return false;
		} else if (!reponsePreterit.equals(other.reponsePreterit))
			return false;
		return true;
	}

	// to strings
	@Override
	public String toString() {
		return "Question [id=" + id + ", reponsePreterit=" + reponsePreterit + ", reponseParticipePasse="
				+ reponseParticipePasse + ", dateHeureEnvoie=" + dateHeureEnvoie + ", dateHeureReponse="
				+ dateHeureReponse + ", compteur=" + compteur + "]";
	}

}
