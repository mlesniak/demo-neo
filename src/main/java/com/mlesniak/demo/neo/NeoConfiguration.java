package com.mlesniak.demo.neo;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories
public class NeoConfiguration extends Neo4jConfiguration {
  @Override
  public SessionFactory getSessionFactory() {
    return new SessionFactory("com.mlesniak.demo.neo");
  }
}
