package com.snim.core;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude = {
        // mysql
        DataSourceAutoConfiguration.class,

        // cassandra
        CassandraAutoConfiguration.class,
        CassandraDataAutoConfiguration.class,
        CassandraRepositoriesAutoConfiguration.class,
        CassandraReactiveDataAutoConfiguration.class
})
public class DisableAutoConfiguration {
}
