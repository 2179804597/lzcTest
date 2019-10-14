package com.lzc.admin.web.controller;

import com.lzc.admin.entity.Test;
import com.lzc.admin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="test",method = RequestMethod.GET)
    public String test(HttpServletRequest req){
        System.out.println("进入test");
        List<Test> list = new ArrayList<Test>();
        try {
            list = testService.getList();
            String aa = testService.test();
            System.out.println(aa);
        }catch (Exception e){
            e.printStackTrace();
        }

//        req.setAttribute("list",list);
        return "admin/test";
    }



}
