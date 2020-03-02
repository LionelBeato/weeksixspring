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


    public Donut createDonut(Donut donut){
      return donutRepo.save(donut);
    };


    public Optional<Donut> updateDonut(Long id){
        return donutRepo.findById(id);
    };

    public Optional<Donut> getDonut(Long id){
      return donutRepo.findById(id);
    };

    public void deleteDonut(Long id){
        donutRepo.deleteById(id);
    }
}
