package com.nlhui.eduservice.controller;


import com.nlhui.eduservice.entity.EduTeacher;
import com.nlhui.eduservice.service.impl.EduTeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author nlhui
 * @since 2022-05-18
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherServiceImpl eduTeacherService;

    @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> list = eduTeacherService.list(null);
        return list;
    }

    @DeleteMapping("{id}")
    public boolean deleteByID(@PathVariable String id){
        boolean flag = eduTeacherService.removeById(id);
        return flag;
    }
}

