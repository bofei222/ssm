package com.bf.v1;

public class BFSqlSessionV1 {
    private BFConfigurationV1 configuration;
    private BFExecutorV1 executor;

    public BFSqlSessionV1(BFConfigurationV1 configuration, BFExecutorV1 executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String sql, String arg) {
        return executor.query(sql, arg);
    }

    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper();
    }

}
