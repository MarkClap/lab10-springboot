package com.tecsup.petclinic.services;

import java.util.List;
import java.util.Optional;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.OwnerRepository.OwnerRepository;

@Service
@Slf4j
public class OwnerServiceImpl implements OwnerService {

    OwnerRepository ownerRepository;
    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    @Override
    public Owner create(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public List<Owner> findAll() {
        return List.of();
    }

    @Override
    public Owner update(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Integer id) throws OwnerNotFoundException {
        Owner owner = findbyId(id);
        ownerRepository.delete(owner);
    }

    @Override
    public Owner findbyfirstname(String firstname) throws OwnerNotFoundException {
        return null;
    }

    @Override
    public Owner findbyId(Integer id) throws OwnerNotFoundException {
        Optional<Owner> owner = ownerRepository.findById(id);

        if (owner.isEmpty())
            throw new OwnerNotFoundException("Record not found...!");

        return owner.get();
    }
}
