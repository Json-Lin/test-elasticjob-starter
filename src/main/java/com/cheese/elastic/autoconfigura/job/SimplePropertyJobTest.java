package com.cheese.elastic.autoconfigura.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

/**
 * @author JasonLin
 * @version V1.0
 * @date 2019/3/20
 */
@Component
public class SimplePropertyJobTest implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("SimplePropertyJobTest" + System.currentTimeMillis());
    }
}
