package com.ydlclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @RequestMapping("/test1")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hellotest");
        mv.addObject("test","hello test");
        return mv;
    }
    @RequestMapping("/test2")
    public ModelAndView test2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hellotest");
        mv.addObject("test","hello test2");
        return mv;
    }
    @RequestMapping("/test3")
    public ModelAndView test3(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hellotest");
        mv.addObject("test","hello test3");
        return mv;
    }
    @RequestMapping("/test4/*")
    public ModelAndView test4(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hellotest");
        mv.addObject("test","hello test3");
        return mv;
    }
    @RequestMapping("/test5/{pathId}/**")
    public ModelAndView test5(@PathVariable("pathId") String id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hellotest");
        mv.addObject("test","hello test3"+id);
        return mv;
    }

}
