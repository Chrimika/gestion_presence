package MODEL;

public class Etudiant {
        private int ID_Etudiant;
        private String Nom_Etudiant;
        private String Prenom_Etudiant;
        private int ID_Niveau;
        private int ID_Filiere;
        private int ID_Annee;

        public Etudiant(int ID_Etudiant, String Nom_Etudiant, String Prenom_Etudiant, int ID_Niveau, int ID_Filiere, int ID_Annee) {
            this.ID_Etudiant = ID_Etudiant;
            this.Nom_Etudiant = Nom_Etudiant;
            this.Prenom_Etudiant = Prenom_Etudiant;
            this.ID_Niveau = ID_Niveau;
            this.ID_Filiere = ID_Filiere;
            this.ID_Annee = ID_Annee;
        }

        public int getID_Etudiant() {
            return ID_Etudiant;
        }

        public void setID_Etudiant(int ID_Etudiant) {
            this.ID_Etudiant = ID_Etudiant;
        }

        public String getNom_Etudiant() {
            return Nom_Etudiant;
        }

        public void setNom_Etudiant(String Nom_Etudiant) {
            this.Nom_Etudiant = Nom_Etudiant;
        }

        public String getPrenom_Etudiant() {
            return Prenom_Etudiant;
        }

        public void setPrenom_Etudiant(String Prenom_Etudiant) {
            this.Prenom_Etudiant = Prenom_Etudiant;
        }

        public int getID_Niveau() {
            return ID_Niveau;
        }

        public void setID_Niveau(int ID_Niveau) {
            this.ID_Niveau = ID_Niveau;
        }

        public int getID_Filiere() {
            return ID_Filiere;
        }

        public void setID_Filiere(int ID_Filiere) {
            this.ID_Filiere = ID_Filiere;
        }

        public int getID_Annee() {
            return ID_Annee;
        }

        public void setID_Annee(int ID_Annee) {
            this.ID_Annee = ID_Annee;
        }

    }
