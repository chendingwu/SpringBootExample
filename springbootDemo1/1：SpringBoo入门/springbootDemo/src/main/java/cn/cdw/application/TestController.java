package cn.cdw.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DW-CHEN
 * 测试
 */
@RestController
public class TestController {
    @RequestMapping("/test1")
    public String test1() {
        System.out.println("TESTING SPRINGBOOT SUCCESS...");
        return "TESTING SPRINGBOOT SUCCESS...";
    }
}
