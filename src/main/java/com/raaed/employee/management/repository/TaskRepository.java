package com.raaed.employee.management.repository;

import com.raaed.employee.management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import com.raaed.employee.management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository <Task,Long> {
}
