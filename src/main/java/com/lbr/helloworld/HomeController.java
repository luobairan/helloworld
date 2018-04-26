/**
 * <p>Title: HomeController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: www.zto.com</p>
 */
package com.lbr.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "SUCCESS";
    }

    @RequestMapping("/check")
    public Integer check(Integer age) {
        System.out.println("=================");
        System.out.println(age);
        System.out.println("=================");

        return age;
    }

    @RequestMapping("/abc")
    public Integer check() {
        return 1002200021;
    }
}



