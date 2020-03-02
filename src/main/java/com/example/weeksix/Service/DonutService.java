package com.example.weeksix.Service;

import com.example.weeksix.Model.Donut;
import com.example.weeksix.Repo.DonutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DonutService {

    @Autowired
    DonutRepo donutRepo;

    //get all method
    public Iterable getAllDonuts(){
        return donutRepo.findAll();
    };

    //TODO make create method

    public Donut createDonut(Donut donut){
      return donutRepo.save(donut);
    };

    //TODO make update method

    public Optional<Donut> updateDonut(Long id){
        return donutRepo.findById(id);
    };

    //TODO make individual read method

    public Optional<Donut> getDonut(Long id){
      return donutRepo.findById(id);
    };

    //TODO make delete method

    public void deleteDonut(Long id){
        donutRepo.deleteById(id);
    }
}
