package com.chenanle.dao;

import com.chenanle.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenanle on 2018/6/8.
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
