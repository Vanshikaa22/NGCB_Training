package com.training.employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Employee,Integer> {
}
