package com.company.sfgpetclinic.services;

import com.company.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetServiceInterface {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findall();
}
