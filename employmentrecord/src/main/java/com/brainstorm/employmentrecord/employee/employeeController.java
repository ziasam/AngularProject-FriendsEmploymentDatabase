package com.brainstorm.employmentrecord.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee/friends")
public class employeeController {

    private final employeeService employeeservice;

    @Autowired
    public employeeController(employeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Employee>> getEmployee() {
        List<Employee> list = employeeservice.getAllEmployee();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(path = "/find/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable ("id") long id) {
        Employee emp = employeeservice.findEmployee(id);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }


    @PutMapping(path = "/add")
    public ResponseEntity<Employee> addNewEmployee(@RequestBody Employee employee){
        Employee emp = employeeservice.addEmployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable ("id") long id)
    {
        employeeservice.delEmployee(id);
       return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(path = {"/update/{id}"})
    public ResponseEntity<Employee> updateEmployee(@PathVariable ("id") long id, @RequestParam(required = false) String email, @RequestParam(required = false) String companyName, @RequestParam(required = false) String previousCompany, @RequestParam(required = false) long phone)
    {
        Employee emp = employeeservice.updateEmployeeById(id, email, companyName, previousCompany, phone);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
}
