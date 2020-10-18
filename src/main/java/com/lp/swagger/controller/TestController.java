package com.lp.swagger.controller;

import com.lp.swagger.vo.TestDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lp
 * @Date: 2020/10/18 16:32
 */
@RestController
@RequestMapping("/test")
@Api(value = "测试", tags = {"测试"})
public class TestController {

    @GetMapping("a")
    @ApiOperation("测试")
    public String a(){
//        testDto.setName("zhansgan");
        return "hello";
    }
}
