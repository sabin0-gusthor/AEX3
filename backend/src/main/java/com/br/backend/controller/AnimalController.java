package com.br.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.br.backend.model.Animal;
import com.br.backend.model.User;
import com.br.backend.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animals")
@CrossOrigin("*")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping("/register")
    public Animal registerAnimal(@RequestBody Animal animal, @RequestParam Long userId) {
        User user = new User();
        user.setId(userId);
        return animalService.registerAnimal(animal.getName(), animal.getSpecies(), animal.getBreed(), animal.getLocation(), user);
    }

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }
}
