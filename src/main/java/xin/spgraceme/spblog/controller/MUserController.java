package xin.spgraceme.spblog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import xin.spgraceme.spblog.entity.MUser;
import xin.spgraceme.spblog.service.MUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author spgraceme
 * @since 2021-08-27
 */
@RestController
@RequestMapping("/m-user")
public class MUserController {

    @Autowired
    MUserService mUserService;

    @GetMapping("/user")
    public MUser getMuser() {
        MUser byId = mUserService.getById(1);
        return byId;
    }
}
