package com.ydlclass.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ydlclass.entity.User;
import com.ydlclass.entity.vo.QueryVo;
import com.ydlclass.entity.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("user")
public class UserController {
//@RequestMapping("/hello2")
//    public String index(Model model) {
//    model.addAttribute("msg","hello model!");
//    //redirect:
//        return "redirect:https://www.ydlclass.com";
//    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("user", "Tom");
        return "user";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String add(Model model) {
        model.addAttribute("user", "add User");
        return "user";
    }

    @GetMapping()
    public String user() {
        return "user";
    }

    @GetMapping("getOne")
    public String getOne(HttpServletRequest request) {
        String age = request.getParameter("age");
        System.out.println(age);
        return "user";
    }

    @PostMapping("insert")
    public String insert(@Validated UserVo user, BindingResult br) {
        List<ObjectError> allErrors = br.getAllErrors();
        for (ObjectError error : allErrors) {
            String defaultMessage = error.getDefaultMessage();

            log.error(defaultMessage);
        }
        if (allErrors.size()>0){
            return "error";
        }
        System.out.println(user);

        return "user";
    }

    @PutMapping("update")
    public String update(HttpServlet httpServlet) {
        return "user";
    }

    @DeleteMapping("delete")
    public String delete(HttpServlet httpServlet) {
        return "user";
    }

    @PostMapping("queryParam")
    public String queryParam(QueryVo queryVo) {
        System.out.println(queryVo);
        return "success";
    }

    @GetMapping(value = "getAll", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getAll() {
        List<User> users = List.of(new User("tom", "12"), new User("jerry", "21"));
        return JSONArray.toJSONString(users);
    }

    @PostMapping("insertUsers")
    public String insertUserJson(@RequestBody UserVo user) {
        String jsonString = JSONObject.toJSONString(user);
        System.out.println(user);

        return "user";
    }
}
