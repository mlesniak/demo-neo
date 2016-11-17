package com.mlesniak.demo.neo;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableExperimentalNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
// Packages for repositories
@EnableExperimentalNeo4jRepositories("com.mlesniak.demo.neo")
public class NeoConfiguration {
  @Bean
  public SessionFactory sessionFactory() {
    // Packages for entities
    return new SessionFactory("com.mlesniak.demo.neo");
  }

  @Bean
  public Neo4jTransactionManager transactionManager() throws Exception {
    return new Neo4jTransactionManager(sessionFactory());
  }
}
