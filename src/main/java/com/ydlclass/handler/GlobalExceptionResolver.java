package com.ydlclass.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
@Slf4j
public class GlobalExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv=new ModelAndView();
        if (e instanceof ArithmeticException){

            return ArithmeticExceptionResolvers(mv,e);
        }

        return mv;
    }
    private ModelAndView ArithmeticExceptionResolvers(ModelAndView mv,Exception e){
        log.error("这里发生了异常，内容是",e);
        mv.setViewName("error");
        return mv;
    }
}
