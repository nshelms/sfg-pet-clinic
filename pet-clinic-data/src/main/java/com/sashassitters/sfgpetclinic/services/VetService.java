package com.sashassitters.sfgpetclinic.services;

import com.sashassitters.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);
}
