package com.example.weeksix.Controller;

import com.example.weeksix.Model.Donut;
import com.example.weeksix.Repo.DonutRepo;
import com.example.weeksix.Service.DonutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DonutController {

    @Autowired
    DonutService donutService;

    @Autowired
    DonutRepo donutRepo;


    //get method
    @GetMapping("/donuts")
    public Iterable getAllDonuts(){
        return donutService.getAllDonuts();
    }

    //TODO implement create method

    @PostMapping("/donut") // post is the HTTP method
    public Donut createDonut(@RequestBody Donut donut){ // "create" aligns with create in CRUD
        return donutService.createDonut(donut);
    }


    //TODO implement update method


    @PutMapping("/donut/{id}") //working put method, thank you Sofia!
    public Optional<Donut> updateDonut(@RequestBody Donut newDonut, @PathVariable Long id) {
        Optional<Donut> updatedDonut = donutRepo.findById(id).map(donut -> {
            donut.setFrosted(newDonut.isFrosted());
            donut.setName(newDonut.getName());
            donut.setDonutType(newDonut.getDonutType());
            return donutRepo.save(donut);
        });
        return donutRepo.findById(id);
    }

    //TODO implement individual read method

    @GetMapping("/donut/{id}")
    public Optional<Donut> getDonut(@PathVariable Long id){
     return donutService.getDonut(id);
    }

    //TODO implement delete method

    @DeleteMapping("/donut/{id}")
    public void deleteDonut(@PathVariable Long id){
        donutService.deleteDonut(id);
    }


}
