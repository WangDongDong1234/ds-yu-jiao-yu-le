package cn.ds.application;

import cn.ds.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestApplication {

    @Autowired
    private TestRepository testRepository;
    public void test() {
        log.info("TestApplication-测试接口运行正常");
        testRepository.test();
    }
}
