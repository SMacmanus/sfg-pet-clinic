package com.company.sfgpetclinic.services.map;

import com.company.sfgpetclinic.model.Vet;
import com.company.sfgpetclinic.services.VetServiceInterface;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetServiceInterface {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
