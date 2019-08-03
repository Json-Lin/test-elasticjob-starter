package com.cheese.elastic.autoconfigura.job;

import com.cheese.elastic.autoconfigure.annotation.ElasticJobScheduler;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * @author JasonLin
 * @version V1.0
 * @date 2019/2/22
 */
@ElasticJobScheduler(cron = "0/3 * * * * ?",
        itemParameters = "0=2564",
        desc = "测试",
        shardingTotalCount = 2,
        overwrite = true,
        misfire = true)
public class SimpleAnnoJobTest implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("SimpleAnnoJobTest" + System.currentTimeMillis());
    }
}
