package com.nkuvr.controller;

import com.nkuvr.service.ILabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/lab")
public class LabController {

    @Autowired
    private ILabService labService;

    /**
     * 跳转到实验室列表页面
     *
     * @return
     */
    @GetMapping(value = "/list")
    public String toLabList() {
        return "lab/labList";
    }
}

