package com.corutine.graphqlpractice.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider")
@Configuration
class AuditConfig {
}