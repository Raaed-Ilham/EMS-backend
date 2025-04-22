package com.raaed.employee.management.model;

import jakarta.persistence.*;
import java.time.LocalDate;

//marks this class as an entity for spring to find
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password; // ✅ NEW

    private String role; // ✅ NEW

    private String department;
    private String position;
    private String workingDays;
    private String shift;
    private String currentProject;
    private LocalDate dateJoined;
    private boolean isActive;

    private String dailyTask;

    public Employee() {}

    public Employee(String name, String email, String password, String role,
                    String department, String position, String workingDays,
                    String shift, String currentProject, LocalDate dateJoined,
                    boolean isActive, String dailyTask) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.department = department;
        this.position = position;
        this.workingDays = workingDays;
        this.shift = shift;
        this.currentProject = currentProject;
        this.dateJoined = dateJoined;
        this.isActive = isActive;
        this.dailyTask = dailyTask;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getWorkingDays() { return workingDays; }
    public void setWorkingDays(String workingDays) { this.workingDays = workingDays; }

    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }

    public String getCurrentProject() { return currentProject; }
    public void setCurrentProject(String currentProject) { this.currentProject = currentProject; }

    public LocalDate getDateJoined() { return dateJoined; }
    public void setDateJoined(LocalDate dateJoined) { this.dateJoined = dateJoined; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public String getDailyTask() { return dailyTask; }
    public void setDailyTask(String dailyTask) { this.dailyTask = dailyTask; }
}
