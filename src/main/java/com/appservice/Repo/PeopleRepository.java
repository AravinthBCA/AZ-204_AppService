package com.appservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appservice.Model.People;

@Repository
public interface PeopleRepository extends JpaRepository<People,Integer>{
    
}