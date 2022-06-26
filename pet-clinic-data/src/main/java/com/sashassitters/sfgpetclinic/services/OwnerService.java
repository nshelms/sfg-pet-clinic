package com.sashassitters.sfgpetclinic.services;

import com.sashassitters.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
