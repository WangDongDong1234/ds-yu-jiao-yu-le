package cn.ds.controller;

import cn.ds.application.TestApplication;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "测试接口")
public class TestController {

    @Autowired
    private TestApplication testApplication;

    /**
     * http://localhost:8080/swagger-ui.html
     */
    @ApiOperation("")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        log.info("TestController-测试接口运行正常");
        testApplication.test();
    }
}