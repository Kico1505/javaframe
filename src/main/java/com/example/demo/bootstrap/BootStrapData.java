package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long partCount = outsourcedPartRepository.count();
        if (partCount == 0) {

            OutsourcedPart gc = new OutsourcedPart();
            gc.setCompanyName("NVIDIA");
            gc.setName("Graphics Card");
            gc.setInv(3);
            gc.setMinInv(0);
            gc.setMaxInv(20);
            gc.setPrice(149.99);
            gc.setId(10855);
            outsourcedPartRepository.save(gc);

            OutsourcedPart cpu = new OutsourcedPart();
            cpu.setCompanyName("Intel");
            cpu.setName("CPU");
            cpu.setInv(7);
            cpu.setMinInv(0);
            cpu.setMaxInv(20);
            cpu.setPrice(99.99);
            cpu.setId(10974);
            outsourcedPartRepository.save(cpu);

            OutsourcedPart ram = new OutsourcedPart();
            ram.setCompanyName("Corsair");
            ram.setName("RAM Stick");
            ram.setInv(12);
            ram.setMinInv(0);
            ram.setMaxInv(20);
            ram.setPrice(39.99);
            ram.setId(10233);
            outsourcedPartRepository.save(ram);

            OutsourcedPart psu = new OutsourcedPart();
            psu.setCompanyName("EVGA");
            psu.setName("Power Supply Unit");
            psu.setInv(15);
            psu.setMinInv(0);
            psu.setMaxInv(20);
            psu.setPrice(29.99);
            psu.setId(13311);
            outsourcedPartRepository.save(psu);

            OutsourcedPart ssd = new OutsourcedPart();
            ssd.setCompanyName("Samsung");
            ssd.setName("Solid State Drive");
            ssd.setInv(5);
            ssd.setMinInv(0);
            ssd.setMaxInv(20);
            ssd.setPrice(19.99);
            ssd.setId(12673);
            outsourcedPartRepository.save(ssd);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        long productCount = productRepository.count();
        if (productCount == 0) {
            Product newbie = new Product("Newbie PC", 399.99, 10);
            Product starter = new Product("Starter PC", 499.99, 7);
            Product mid = new Product("Mid-Tier PC", 799.99, 5);
            Product high = new Product("High-End PC", 1299.99, 2);
            Product extreme = new Product("Extreme PC", 1999.99, 1);
            productRepository.save(newbie);
            productRepository.save(starter);
            productRepository.save(mid);
            productRepository.save(high);
            productRepository.save(extreme);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
