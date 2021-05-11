package com.example.springwithelasticsearch;


import elasticSearch.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController
{
    private final Repo repo;

    private List<Person> personList = new ArrayList<>();

    public RestController( Repo repo ) {
        this.repo = repo;
    }

    private void addPersonData()
    {
        Person person1 = new Person(1,"Amimul", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person2 = new Person(2,"Shibli", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person3 = new Person(3,"Ritu", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person4 = new Person(4,"Roustam", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person5 = new Person(5,"Amimul", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person6 = new Person(6,"Amimul", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person7 = new Person(7,"Amimul", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person8 = new Person(8,"Amimul", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person9 = new Person(9,"Amimul", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");
        Person person10 = new Person(10,"Amimul", "Ehsan", "Roustam ALi Helaly", "Nurun Nahar", false, 22, "01731304074", "amimulahsan7@gmail.com");




        personList.add(person1);
    }

    @GetMapping("/savePersonToCluster")
    public String savePersonToCluster()
    {
        Person person = new Person();

        person.setId(1);
        person.setFirstName("Amimul");
        person.setLastName("Ehsan");
        person.setFatherName("Roustam ALi Helaly");
        person.setMotherName("Nurun Nahar");
        person.setMarried(false);
        person.setAge(22);
        person.setMobileNumber("01731304074");
        person.setEmail("amimulahsan7@gmail.com");

        repo.save(person);

        return "Saved Successfully";
    }
}

@Repository
interface Repo extends ElasticsearchRepository<Person, Integer> {
}


