package com.yourame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

   public  class SortPersonsExampleTest {

    @Test
  public void testSortPeople() {
        
        List<Personne> people = new ArrayList<>();
        people.add(new Personne("Hamid", "Jamila"));
        people.add(new Personne("Martin", "Bob"));
        people.add(new Personne("Hamid", "Charles"));
        people.add(new Personne("Bernard", "Jamila"));

        
        Collections.sort(people);

        
        assertThat(people).containsExactly(
            new Personne("Bernard", "Jamila"),
            new Personne("Hamid", "Charles"),
            new Personne("Hamid", "Jamila"),
            new Personne("Martin", "Bob")
        );
    }
}
