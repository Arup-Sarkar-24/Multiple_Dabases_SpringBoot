package com.mycompany.multipleDatabases.repo1;

import com.mycompany.multipleDatabases.entity1.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Long> {
}
