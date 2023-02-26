package com.snim.core;

import com.snim.core.infra.CassandraConfiguration;
import com.snim.core.infra.MySqlConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        DisableAutoConfiguration.class,
        MySqlConfiguration.class,
        CassandraConfiguration.class
})
public class CoreConfiguration {
}
