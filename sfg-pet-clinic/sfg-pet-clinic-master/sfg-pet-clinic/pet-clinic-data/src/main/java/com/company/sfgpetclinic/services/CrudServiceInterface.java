package com.company.sfgpetclinic.services;

import java.util.Set;

// mimicking CrudRepository from Spring Data with the CrudServiceInterface
// all of our Service Interfaces are going to inherit these methods
// eliminates a bunch of duplicate code


public interface CrudServiceInterface <T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
