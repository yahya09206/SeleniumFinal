package come.yahya.tests.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerPracticeTest {

    @Test
    public void testPrintFakeData(){

        Faker faker = new Faker();

        // faker.YourCategory().WhateverAvailable
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name.lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
    }
}
