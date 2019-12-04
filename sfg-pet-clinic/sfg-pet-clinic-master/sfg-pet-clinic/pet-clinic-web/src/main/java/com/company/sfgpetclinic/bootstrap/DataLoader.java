package com.company.sfgpetclinic.bootstrap;

import com.company.sfgpetclinic.model.Owner;
import com.company.sfgpetclinic.model.Vet;
import com.company.sfgpetclinic.services.OwnerServiceInterface;
import com.company.sfgpetclinic.services.VetServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServiceInterface ownerServiceInterface;
    private final VetServiceInterface vetServiceInterface;

    @Autowired
    public DataLoader(OwnerServiceInterface ownerServiceInterface, VetServiceInterface vetServiceInterface) {
        this.ownerServiceInterface = ownerServiceInterface;
        this.vetServiceInterface = vetServiceInterface;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerServiceInterface.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerServiceInterface.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetServiceInterface.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jesse");
        vet2.setLastName("Porter");

        vetServiceInterface.save(vet2);

        System.out.println("Loaded Vets");
    }
}
