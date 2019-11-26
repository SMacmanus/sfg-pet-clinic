package com.company.sfgpetclinic.services;

import com.company.sfgpetclinic.model.Owner;

public interface OwnerServiceInterface extends CrudServiceInterface<Owner, Long> {

    Owner findByLastName(String lastName);
}
