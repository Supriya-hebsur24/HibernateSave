package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pen {
    @Id
    private  int id;
    private int name;
}
