package com.zuehlke.testing.rules.exercises;

import com.zuehlke.testing.rules.Person;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    @Test
    void constructor_parametersGiven_initializedPerson() {
        // act
        Person result = new Person("Peter");

        // assert
        assertThat(result, is(notNullValue()));
        assertThat("name", result.getName(), is(equalTo("Peter")));
    }

    @Test
    void constructor_parameterEmptyString_initializedPerson() {
        // act
        Person result = new Person("");

        // assert
        assertThat(result, is(notNullValue()));
        assertThat("name", result.getName(), is(emptyString()));
    }

    @Test
    void constructor_parameterNull_exceptionThrown() {
        // act & assert
        assertThrows(IllegalArgumentException.class, () -> new Person(null));
    }

}
