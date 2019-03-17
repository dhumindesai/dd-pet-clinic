package dd.springframework.ddpetclinic.service;

import dd.springframework.ddpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
