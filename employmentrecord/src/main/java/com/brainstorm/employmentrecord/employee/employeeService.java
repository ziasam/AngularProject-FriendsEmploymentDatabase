package com.brainstorm.employmentrecord.employee;

import com.brainstorm.employmentrecord.employee.exception.UserNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class employeeService {

    private final employeeRepo employeerepo;

    @Autowired
    public employeeService(employeeRepo employeerepo) {
        this.employeerepo = employeerepo;
    }

    public List<Employee> getAllEmployee(){
        return employeerepo.findAll();
    }

    public Employee updateEmployeeById(long id, String email, String companyName, String previousCompany, String phone){
        Employee emp = employeerepo.findEmployeeById(id).orElseThrow(() -> new UserNotFound("No employee by this ID"));

        if(email != null)
        {
            emp.setEmail(email);
        }
        else
        {
            throw  new IllegalStateException("No email selected");
        }

        if(companyName != null)
        {
            emp.setCompanyName(companyName);
        }
        else
        {
            throw  new IllegalStateException("No companyName selected");
        }

        if(previousCompany != null)
        {
            emp.setPreviousCompany(previousCompany);
        }
        else
        {
            throw  new IllegalStateException("No prevousCompany selected");
        }

        if(phone.length() != 0)
        {
            emp.setPhone(phone);
        }
        else
        {
            throw  new IllegalStateException("No phone selected");
        }

        return employeerepo.save(emp);
    }

    public Employee addEmployee(Employee employee)
    {
        Optional<Employee> Optional = employeerepo.findEmployeeById(employee.getId());
        if(Optional.isEmpty())
        {
            return employeerepo.save(employee);
        }
        else
        {
            throw new IllegalStateException("Wrong ID");
        }
    }

    public void delEmployee(long id)
    {
        boolean exist = employeerepo.existsById(id);

        if(!exist)
        {
            throw new IllegalStateException(" No employee by this id Exist ");
        }
        else
        {
            employeerepo.deleteById(id);
        }
    }

    public Employee findEmployee(long id)
    {
        Employee emp = employeerepo.findEmployeeById(id).orElseThrow(() -> new UserNotFound("No user by this id"));
        return emp;
    }
}
