package fr.esgi.verbes_irreguliers.thomas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import fr.esgi.verbes_irreguliers.thomas.buisness.Partie;
import fr.esgi.verbes_irreguliers.thomas.buisness.Question;
import fr.esgi.verbes_irreguliers.thomas.buisness.Verbe;

public class App {
	private static ArrayList<Verbe> verbes = new ArrayList<Verbe>();
	private static ArrayList<Question> questions = new ArrayList<Question>();
	private static Scanner scanner = new Scanner(System.in);
	private static int nombreVerbe;
	private static LocalDateTime heureFinit;
	private static String reponse;
	private static Random random = new Random();

	public static void main(String[] args) {

		importerVerbe();
		System.out.println("Bienvenue sur verbes irréguliers !\r");
		System.out.println("Nombre de verbes disponibles : " + verbes.size());
		do {
			System.out.println("Nouvelle partie !");
			System.out.println("Combien de verbe pour cette partie ? ");
			int nombreVerbe = scanner.nextInt();
			while (nombreVerbe < 1 || nombreVerbe > verbes.size()) {
				System.out.println("Nombre incorect, veuillez réessayé : ");
				nombreVerbe = scanner.nextInt();
			}
			Partie partie = creerPartie(nombreVerbe);
			System.out.println("Merci de séparer le prétérit et le participe passé avec une virgule");
			for (int i = 0; i < nombreVerbe; i++) {
				String[] valeurHorsQuestion = creerQuestion();
				System.out.println("Question " + (i + 1) + ": donnez le prétérit et le participe passé du verbe "
						+ valeurHorsQuestion[1] + " (" + valeurHorsQuestion[0] + ")");
				reponse = scanner.nextLine();
				heureFinit = LocalDateTime.now();
				// partie.setCompteur(1);
				if (reponse == questions.get(i).getReponsePreterit() + ", "
						+ questions.get(i).getReponseParticipePasse()) {
					partie.setScore(partie.getScore() + 1);
					System.out.println("Bravo! Score " + partie.getScore() + "/" + partie.getCompteur());
				} else {
					System.out.println(
							"Ce n’est pas la bonne réponse. Score" + partie.getScore() + "/" + partie.getCompteur());
				}
			}
			System.out.println("Score Final : " + partie.getScore() + "/" + partie.getCompteur());
		} while (1 == 1);

	}

	// j'importe mes verbe
	private static void importerVerbe() {
		Verbe verbe1 = new Verbe("cut", "cut", "cut", "couper");
		verbes.add(verbe1);
		Verbe verbe2 = new Verbe("do", "did", "done", "faire");
		verbes.add(verbe2);
		Verbe verbe3 = new Verbe("begin", "began", "begun", "commencer");
		verbes.add(verbe3);
		Verbe verbe4 = new Verbe("be", "was/were", "been", "être");
		verbes.add(verbe4);
		Verbe verbe5 = new Verbe("lead", "led", "led", "mener");
		verbes.add(verbe5);
	}

	private static String[] creerQuestion() {
		int idVerbe;
		String reponsePreterite = null;
		String reponseParticipePasse = null;
		String traduction = null;
		String baseVerbale = null;
		LocalDateTime heureActuelle = LocalDateTime.now();
		idVerbe = random.nextInt(5);
		for (Verbe v : verbes) {
			if (v.getId().equals(idVerbe)) {
				System.out.println("courgette");
				reponsePreterite = v.getPreterit();
				reponseParticipePasse = v.getParticipePasse();
				traduction = v.getTraduction();
				baseVerbale = v.getBaseVerbale();
				break;
			}
		}
		Question question = new Question(reponsePreterite, reponseParticipePasse, heureActuelle, null);
		questions.add(question);
		return new String[] { traduction, baseVerbale };
	}

	private static Partie creerPartie(int nbQuestion) {
		Partie partie = new Partie(nbQuestion, 0);
		return partie;
	}

}
