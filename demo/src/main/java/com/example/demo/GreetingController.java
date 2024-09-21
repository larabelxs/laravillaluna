package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class GreetingController {

    private String fullName = "Villaluna, Lara G.";
    private String age = "23";
    private String studentID = "201180";
    private String address = "Pambujan N. Samar";
    private String email = "laravillaluna457@gmail.com";
    private String motto = "Pag May Salapi MAUPAY AK PAMATI";

    @GetMapping
    public String getStudentInfo() {
        StudentInfo studentInfo = new StudentInfo(fullName, age, studentID, address, email, motto);
        return studentInfo.formatInfo();
    }
}
