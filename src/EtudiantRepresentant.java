
public class EtudiantRepresentant extends Etudiant {
	private Etudiant uniqueInstance;
	
	//Super constructeur
	public EtudiantRepresentant(String nom_, String prenom_) {
		super(nom_, prenom_);
	}
	
	//Création d'un représentant si pas de représentant existant
	public void instance(String nom_, String prenom_) {
		if(this.isInstanciated()) {
			
		} else {
			this.uniqueInstance = new EtudiantRepresentant(nom_,prenom_);
		}
	}
	
	//Verification de l'existance d'un représentant
	private boolean isInstanciated() {
		if(this.getInstance() == null) {
			return true;
		} else {
			return false;
		}		
	}
	
	//getter de l'instance
	public Etudiant getInstance() {
		return this.uniqueInstance;
	}
}
