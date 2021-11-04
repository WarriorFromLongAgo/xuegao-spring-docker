package com.xuegao.xuegaospringdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <br/> @PackageName：com.xuegao.xuegaospringdocker.controller
 * <br/> @ClassName：IndexController
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2021/11/4 0:07
 */
@Controller
public class IndexController {

    @RequestMapping(path = {"/", "/index"})
    public String index() {
        return "index";
    }

}