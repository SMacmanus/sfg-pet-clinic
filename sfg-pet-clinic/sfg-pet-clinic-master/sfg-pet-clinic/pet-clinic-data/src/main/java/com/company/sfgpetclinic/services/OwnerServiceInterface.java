package com.company.sfgpetclinic.services;

import com.company.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerServiceInterface {
    Owner findById(Long id);

    Owner save (Owner owner);

    Owner findByLastName(String lastName);

    Set<Owner> findall();

}
