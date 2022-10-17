package com.training.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping("/getEmployee")
    public List<Employee> getEmployee(){
        return repository.findAll();
    }

    @GetMapping("/getEmployeeById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id){
        return repository.findById(id);
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        repository.save(employee);
        return employee.toString()+" Saved Successfully";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        if(repository.existsById(employee.getEmpId())){
            repository.save(employee);
            return employee.toString()+" Updated Successfully";
        }
        return "Invalid Employee Id̥";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        if(repository.existsById(id)){
            Optional<Employee> employeeData = Optional.of(new Employee());
            employeeData = repository.findById(id);
            repository.deleteById(id);
            return employeeData.toString() + "Deleted Successfully";
        }
        return "Invalid Employee Id̥";
    }

}
