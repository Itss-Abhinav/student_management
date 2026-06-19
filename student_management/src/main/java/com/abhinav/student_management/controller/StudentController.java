package com.abhinav.student_management.controller;

import com.abhinav.student_management.model.Student;
import com.abhinav.student_management.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")   // ← add this
@RestController
@RequestMapping("/api/students")




//@RestController
//@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Student> create(@Valid @RequestBody Student student) {
        return ResponseEntity.ok(service.create(student));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id,
                                          @Valid @RequestBody Student student) {
        return ResponseEntity.ok(service.update(id, student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Student deleted successfully");
    }

    @GetMapping("/search")
    public ResponseEntity<List<Student>> searchByCourse(@RequestParam String course) {
        return ResponseEntity.ok(service.searchByCourse(course));
    }
}