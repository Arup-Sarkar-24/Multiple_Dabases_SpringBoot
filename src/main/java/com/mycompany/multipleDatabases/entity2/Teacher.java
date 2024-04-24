package com.mycompany.multipleDatabases.entity2;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teacher_list")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String subject;
}
