package com.example.weeksix;

import com.example.weeksix.Model.Donut;
import com.example.weeksix.Model.Type;
import com.example.weeksix.Repo.DonutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    DonutRepo donutRepo;



    @Override
    public void run(String... args) throws Exception {


        donutRepo.save(new Donut("Glazed", true, Type.YEAST));


    }
}
