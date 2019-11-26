package com.company.sfgpetclinic.services;

import com.company.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetServiceInterface {
    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findall();
}
