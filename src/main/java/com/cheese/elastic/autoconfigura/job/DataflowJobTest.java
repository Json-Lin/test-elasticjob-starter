package com.cheese.elastic.autoconfigura.job;

import com.cheese.elastic.autoconfigure.annotation.ElasticJobScheduler;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author JasonLin
 * @version V1.0
 * @date 2019/3/20
 */
@ElasticJobScheduler(cron = "0/3 * * * * ?",streamingProcess = false,overwrite = true)
public class DataflowJobTest implements DataflowJob<Integer> {
    @Override
    public List<Integer> fetchData(ShardingContext shardingContext) {
        return Lists.newArrayList(111,222);
    }

    @Override
    public void processData(ShardingContext shardingContext, List<Integer> data) {
        System.out.println(data);
    }
}
