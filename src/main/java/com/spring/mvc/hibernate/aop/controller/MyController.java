package com.spring.mvc.hibernate.aop.controller;

import com.spring.mvc.hibernate.aop.entity.Employee;
import com.spring.mvc.hibernate.aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/")
    public String showAllEmpl(Model model) {

        List<Employee> allEmpl = employeeService.getAllEmpl();
        model.addAttribute("allEmpls", allEmpl);
        return "all_employees";
    }
    @RequestMapping("/addNewEmployee")
    public String addNewEmpl(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "empl_info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmpl(@ModelAttribute("employee") Employee employee) {


        employeeService.saveEmpl(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmpl(@RequestParam("empl-ID") int id, Model model) {

        Employee employee = employeeService.getEmpl(id);
        model.addAttribute("employee", employee);
        return "empl_info";
    }

    @RequestMapping("/delEmpl")
    public String deleteEmpl(@RequestParam("empl-ID") int id) {
        employeeService.deleteEmpl(id);
        return "redirect:/";
    }
}
