
package com.yourame ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonneIterationTest {

    @Test
    public void testAjoutPersonneDansSet() {
       
        Set<Personne> personnes = new HashSet<>();

        
        personnes.add(new Personne(1 ,"Alice"));
        personnes.add(new Personne(2, "Bob"));

        
        Assertions.assertThat(personnes)
                .isNotEmpty()
                .hasSize(2)
                .extracting("nom")
                .containsExactlyInAnyOrder("Alice", "Bob");
    }

    @Test
    public void testSuppressionPersonneAvecIterator() {
        
        Set<Personne> personnes = new HashSet<>();
        personnes.add(new Personne(1, "Alice"));
        personnes.add(new Personne(2, "Bob"));
        personnes.add(new Personne(3, "Charlie"));

        
        Iterator<Personne> iterator = personnes.iterator();
        while (iterator.hasNext()) {
            Personne personne = iterator.next();
            if (personne.getNom().equals("Bob")) {
                iterator.remove();
            }
        }

        
        Assertions.assertThat(personnes)
                .hasSize(2)
                .extracting("nom")
                .doesNotContain("Bob");
    }
}

