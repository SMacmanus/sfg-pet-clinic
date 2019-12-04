package com.company.sfgpetclinic.bootstrap;

import com.company.sfgpetclinic.model.Owner;
import com.company.sfgpetclinic.model.Vet;
import com.company.sfgpetclinic.services.OwnerServiceInterface;
import com.company.sfgpetclinic.services.VetServiceInterface;
import com.company.sfgpetclinic.services.map.OwnerServiceMap;
import com.company.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServiceInterface ownerServiceInterface;
    private final VetServiceInterface vetServiceInterface;

    public DataLoader() {
        ownerServiceInterface = new OwnerServiceMap();
        vetServiceInterface = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerServiceInterface.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerServiceInterface.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetServiceInterface.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jesse");
        vet2.setLastName("Porter");

        vetServiceInterface.save(vet2);

        System.out.println("Loaded Vets");
    }
}
