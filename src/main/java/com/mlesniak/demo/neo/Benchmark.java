package com.mlesniak.demo.neo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Benchmark {
  private static final Logger LOG = LoggerFactory.getLogger(Benchmark.class);

  @Autowired
  private ArticleRepository repository;

  @PostConstruct
  public void start() {
    LOG.info("Starting benchmark...");

    LOG.info("Creating a single article.");
    Article article = new Article();
    article.setTitle("article");
    repository.save(article);
  }
}
