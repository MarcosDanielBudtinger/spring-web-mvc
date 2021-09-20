package com.labmarcos.springwebmvc.repository;

import com.labmarcos.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {

    private List<Jedi> listOfJedi = new ArrayList<>();

    public List<Jedi> getAllJedi() {
        return this.listOfJedi;
    }

    public void saveJedi(Jedi jedi) {
        this.listOfJedi.add(jedi);
    }
}
