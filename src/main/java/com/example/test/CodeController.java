package com.example.test;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 编码接口
 *
 * @author liushimin
 */
@RequestMapping(value = "/api/store/code")
@RestController
public class CodeController {
    /**
     * 查询可用商
     * @return
     */
    @GetMapping("/merchant")
    public String merchant() {
        return "Test hello world!";
    }

}
