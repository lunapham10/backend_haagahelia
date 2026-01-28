package fi.haagahelia.homework2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.homework2.domain.Student;

@Controller
public class StudentListController {

    @RequestMapping(value = "/studentlist")
    public String listStudents(Model model) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student();
        student1.setFirstName("Kate");
        student1.setLastName("Cole");
        studentList.add(student1);

        Student student2 = new Student();
        student2.setFirstName("Dan");
        student2.setLastName("Brown");
        studentList.add(student2);

        Student student3 = new Student();
        student3.setFirstName("Mike");
        student3.setLastName("Mars");
        studentList.add(student3);

        model.addAttribute("students", studentList);
        return "studentlist";
    }
}
