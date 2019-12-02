package com.company.sfgpetclinic.services.map;

import com.company.sfgpetclinic.model.Owner;
import com.company.sfgpetclinic.services.CrudServiceInterface;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements CrudServiceInterface <Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
    
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}