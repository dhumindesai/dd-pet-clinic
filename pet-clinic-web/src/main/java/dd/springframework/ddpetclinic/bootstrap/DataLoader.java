package dd.springframework.ddpetclinic.bootstrap;

import dd.springframework.ddpetclinic.model.Owner;
import dd.springframework.ddpetclinic.model.Vet;
import dd.springframework.ddpetclinic.service.OwnerService;
import dd.springframework.ddpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

   private final OwnerService ownerService;
   private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1= new Owner();
        owner1.setId(1L);
        owner1.setFirstname("John");
        owner1.setLastname("Wick");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Jig");
        owner1.setLastname("Shaw");

        ownerService.save(owner2);

        System.out.println("Owners added.....");


        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstname("John");
        vet1.setLastname("Snow");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstname("Sansa");
        vet2.setLastname("Stark");

        vetService.save(vet2);

        System.out.println("Vets added.....");


    }
}
