package com.tecsup.petclinic.services;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

@SpringBootTest
public class OwnerServiceTest {
    private static Logger logger = LoggerFactory.getLogger(OwnerServiceTest.class);

    @Autowired
    private OwnerService ownerService;

    @Test
    public void testCreateOwner() {
        String firstName = "John";
        String lastName = "Doe";
        String address = "123 Main Street";
        String city = "San Francisco";
        Integer telephone = 1234;

        Owner owner = new Owner(firstName, lastName, address, city, telephone);


        Owner createdOwner = ownerService.create(owner);
        logger.info(owner.toString());

        assertThat(createdOwner.getFirst_name(),is(firstName));
        assertThat(createdOwner.getLast_name(),is(lastName));
        assertThat(createdOwner.getAddress(),is(address));
        assertThat(createdOwner.getCity(),is(city));
        assertThat(createdOwner.getTelephone(),is(telephone));


    }


}
