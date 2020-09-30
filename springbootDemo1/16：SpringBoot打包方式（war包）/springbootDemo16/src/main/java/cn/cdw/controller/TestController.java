package cn.cdw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DW-CHEN
 */
@RestController
public class TestController {

    @RequestMapping("/test1")
    public String test1() {
        return "TESTING SERVER SUCCESS...";
    }
}
