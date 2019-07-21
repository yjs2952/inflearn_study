package com.study.inflearn.jpaexample;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    @OneToMany
    private Set<Study> studies;
}
