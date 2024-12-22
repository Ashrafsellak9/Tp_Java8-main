package com.yourame;

import java.util.Objects;

public class Personne implements Comparable<Personne> {
        
        
        private String prenom;
        private String nom;
        private int age;
    
        public Personne(int age ,String nom){
            this.nom = nom ;
            this.age = age ;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true ;
            if (obj == null || getClass() != obj.getClass()) return false;
            Personne personne = (Personne) obj;
            return Objects.equals(nom , personne.nom) && Objects.equals(prenom , personne.prenom);
        }
        @Override
        public int hashCode(){
            return Objects.hash(nom , prenom);
        }


    
        
        public Personne(String prenom, String nom, int age) {
            this.prenom = prenom;
            this.nom = nom;
            this.age = age;
        }
        public Personne(String prenom, String nom) {
            this.prenom = prenom;
            this.nom = nom;
        }



    
        
        public String getPrenom() {
            return prenom;
        }
    
       
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }
    
        
        public String getNom() {
            return nom;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Personne p) {
        
        int comparaisonPrenom = this.prenom.compareTo(p.prenom);
        if (comparaisonPrenom != 0) {
            return comparaisonPrenom;
        } else {
            return this.nom.compareTo(p.nom);
        }
    }
        
    
       
        
    @Override
    public String toString() {
        return prenom + " " + nom  ; }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Object getAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
    

}
