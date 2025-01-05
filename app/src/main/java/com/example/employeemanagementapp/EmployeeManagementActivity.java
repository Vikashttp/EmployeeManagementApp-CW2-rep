package com.example.employeemanagementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_management);

        // Input fields
        EditText employeeIdEditText = findViewById(R.id.employeeIdEditText);
        EditText firstNameEditText = findViewById(R.id.firstNameEditText);
        EditText lastNameEditText = findViewById(R.id.lastNameEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText departmentEditText = findViewById(R.id.departmentEditText);
        EditText salaryEditText = findViewById(R.id.salaryEditText);
        EditText joiningDateEditText = findViewById(R.id.joiningDateEditText);

        // Buttons
        Button addEmployeeButton = findViewById(R.id.addEmployeeButton);
        Button editEmployeeButton = findViewById(R.id.editEmployeeButton);
        Button deleteEmployeeButton = findViewById(R.id.deleteEmployeeButton);
        Button viewAllEmployeesButton = findViewById(R.id.viewAllEmployeesButton);

        // RecyclerView
        RecyclerView employeeRecyclerView = findViewById(R.id.employeeRecyclerView);

        // Button click listeners
        addEmployeeButton.setOnClickListener(v -> {
            // TODO: Implement add employee functionality
            Toast.makeText(this, "Add Employee Clicked", Toast.LENGTH_SHORT).show();
        });

        editEmployeeButton.setOnClickListener(v -> {
            // TODO: Implement edit employee functionality
            Toast.makeText(this, "Edit Employee Clicked", Toast.LENGTH_SHORT).show();
        });

        deleteEmployeeButton.setOnClickListener(v -> {
            // TODO: Implement delete employee functionality
            Toast.makeText(this, "Delete Employee Clicked", Toast.LENGTH_SHORT).show();
        });

        viewAllEmployeesButton.setOnClickListener(v -> {
            // TODO: Implement view all employees functionality
            Toast.makeText(this, "View All Employees Clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
