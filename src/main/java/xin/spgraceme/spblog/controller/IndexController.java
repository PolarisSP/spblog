package xin.spgraceme.spblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 沈鹏
 * @date 2021/8/27 -19:05
 */
@Controller
public class IndexController{

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
