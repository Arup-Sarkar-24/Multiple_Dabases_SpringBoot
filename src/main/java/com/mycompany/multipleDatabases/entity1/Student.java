package com.mycompany.multipleDatabases.entity1;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student_list")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String standard;
    private String schoolName;
    private String address;
}
