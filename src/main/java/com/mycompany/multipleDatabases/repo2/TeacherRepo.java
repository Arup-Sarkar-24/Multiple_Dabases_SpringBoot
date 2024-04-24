package com.mycompany.multipleDatabases.repo2;

import com.mycompany.multipleDatabases.entity2.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {
}
