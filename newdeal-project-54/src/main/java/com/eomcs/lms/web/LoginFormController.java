package com.eomcs.lms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFormController {

  @RequestMapping("/auth/form")
  public String form(
      HttpServletRequest request, HttpServletResponse response)
          throws Exception {
    
    response.setContentType("text/html;charset=UTF-8");

    return "/auth/form.jsp";
  }
}