package com.mlesniak.demo.neo;

import org.springframework.data.neo4j.repository.GraphRepository;

public interface ArticleRepository extends GraphRepository<Article> {
  // Empty.
}
