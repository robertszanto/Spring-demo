package com.example.demo.repostory;

import com.example.demo.model.Elev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElevRepository extends JpaRepository<Elev, Integer> {
}
