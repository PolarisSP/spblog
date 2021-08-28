package xin.spgraceme.spblog.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xin.spgraceme.spblog.entity.MUser;
import xin.spgraceme.spblog.service.MUserService;

/**
 * @author 沈鹏
 * @date 2021/8/27 -16:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testSpblogApplication {

    @Autowired
    MUserService mUserService;

    @Test
    public void contextLoads() {
        MUser byId = mUserService.getById(1);
        System.out.println(byId.toString());
    }
}
