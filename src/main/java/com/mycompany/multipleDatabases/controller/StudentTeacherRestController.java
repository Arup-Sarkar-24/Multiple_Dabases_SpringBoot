package com.mycompany.multipleDatabases.controller;

import com.mycompany.multipleDatabases.builder.ObjectBuilder;
import com.mycompany.multipleDatabases.entity1.Student;
import com.mycompany.multipleDatabases.entity1.StudentDTO;
import com.mycompany.multipleDatabases.entity2.Teacher;
import com.mycompany.multipleDatabases.entity2.TeacherDTO;
import com.mycompany.multipleDatabases.repo1.StudentRepo;
import com.mycompany.multipleDatabases.repo2.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentTeacherRestController {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    TeacherRepo teacherRepo;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody StudentDTO studentDTO) {
        Student student = ObjectBuilder.createStudentFromStudentDTO(studentDTO);
        return studentRepo.save(student);
    }

    @PostMapping("/saveTeacher")
    public Teacher saveTeacher(@RequestBody TeacherDTO teacherDTO) {
        Teacher teacher = ObjectBuilder.createTeacherFromTeacherDTO(teacherDTO);
        return teacherRepo.save(teacher);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers(){
        return teacherRepo.findAll();
    }

}
