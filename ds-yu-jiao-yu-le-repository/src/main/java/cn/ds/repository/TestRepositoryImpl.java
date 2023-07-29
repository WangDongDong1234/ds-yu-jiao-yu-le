package cn.ds.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class TestRepositoryImpl implements TestRepository{
    @Override
    public void test() {
        log.info("TestRepositoryImpl-测试接口运行正常");
    }
}
