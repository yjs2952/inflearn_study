package com.study.inflearn.jpaexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Study {

    @Id @GeneratedValue
    private Long id;

    private String name;
}
