package com.tecsup.petclinic.OwnerRepository;
import com.tecsup.petclinic.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Deivid Laura
 *
 */

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer>{

    @Override
    List<Owner> findAll();
}
