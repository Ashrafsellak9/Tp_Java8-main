package com.yourame;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;



public class PersonServiceTest {

    private final PersonService personService = new PersonService(); 

    @Test
    public void testFilterByAddress() {
        
        List<Person> peopleLivingIn123RueA = personService.filterByAddress("123 Rue A");

        
        List<Person> expectedPersonsLivingIn123RueA = Arrays.asList(
            new Person("Alice", "Doe", LocalDate.of(1990, 5, 12), "123 Rue A"),
            new Person("Charlie", "Brown", LocalDate.of(1985, 3, 9), "123 Rue A")
        );

        
        assertThat(peopleLivingIn123RueA)
                .isNotNull()
                .hasSize(2) 
                .containsExactlyInAnyOrderElementsOf(expectedPersonsLivingIn123RueA) 
                .extracting(Person::getAddress)
                .containsOnly("123 Rue A"); 
    }
}
