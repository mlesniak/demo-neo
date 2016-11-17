package com.mlesniak.demo.neo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class Benchmark {
  private static final Logger LOG = LoggerFactory.getLogger(Benchmark.class);

  @Autowired
  private ArticleRepository repository;

  @PostConstruct
  public void start() {
    LOG.info("Starting benchmark...");

    // TODO ML Configurable
    int numArticles = 1_000;
    int numSources = 10;

    LOG.info("Creating {} sources.", numSources);
    List<Source> sources = new ArrayList<>();
    for (int i = 0; i < numSources; i++) {
      Source source = new Source();
      source.setTitle(Integer.toString(i));
      sources.add(source);
    }
    LOG.info("Done / source  creation");

    LOG.info("Creating {} articles.", numArticles);
    List<Article> articles = new LinkedList<>();
    for (int i = 0; i < numArticles; i++) {
      Article article = new Article();
      article.setTitle(UUID.randomUUID().toString());
      articles.add(article);

      int pos = (int) (Math.random() * 10);
      List<Source> srcs = new LinkedList<>();
      srcs.add(sources.get(pos));
      article.setSources(srcs);
    }
    LOG.info("Persisting articles");
    repository.save(articles);
    LOG.info("Done / article creation");
  }
}
