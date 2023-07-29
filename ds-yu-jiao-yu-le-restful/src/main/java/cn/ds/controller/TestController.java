package cn.ds.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "测试接口")
public class TestController {

    /**
     * http://localhost:8080/swagger-ui.html
     */
    @ApiOperation("")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        log.info("测试接口运行正常");
    }
}