package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @PostMapping("/dept/add")
    public Boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping("/dept/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }


    @GetMapping("/dept/list")
    public List<Dept> list() {
        return service.list();
    }
}
