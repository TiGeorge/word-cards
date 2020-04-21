package com.example.wordcards.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Homograph {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String value;
}
