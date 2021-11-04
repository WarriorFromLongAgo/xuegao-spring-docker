package com.xuegao.xuegaospringdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/> @PackageName：com.xuegao.xuegaospringdocker.controller
 * <br/> @ClassName：TestController
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2021/11/4 0:08
 */
@RestController
public class TestController {

    @RequestMapping(path = "/test")
    public String test() {
        return "TestController";
    }
}