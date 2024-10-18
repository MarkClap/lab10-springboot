package com.tecsup.petclinic.services;
import java.util.List;
import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

public interface OwnerService {

    Owner create(Owner owner);
    List<Owner> findAll();
    Owner update(Owner owner);
    void delete(Integer id) throws OwnerNotFoundException;
    Owner findbyfirstname(String firstname) throws OwnerNotFoundException;
    Owner findbyId(Integer id) throws OwnerNotFoundException;
}
