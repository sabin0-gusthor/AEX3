package com.br.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backend.model.Animal;
import com.br.backend.model.User;
import com.br.backend.repository.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal registerAnimal(String name, String species, String breed, String location, User user) {
        Animal animal = new Animal(name, species, breed, location, user);
        return animalRepository.save(animal);
    }

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }
}
