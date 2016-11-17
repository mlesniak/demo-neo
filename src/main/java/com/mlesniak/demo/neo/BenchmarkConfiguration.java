package com.mlesniak.demo.neo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class BenchmarkConfiguration {
  private long numArticles;
  private long numSources;
  private boolean clean;

  public long getNumArticles() {
    return numArticles;
  }

  public void setNumArticles(long numArticles) {
    this.numArticles = numArticles;
  }

  public long getNumSources() {
    return numSources;
  }

  public void setNumSources(long numSources) {
    this.numSources = numSources;
  }

  public boolean isClean() {
    return clean;
  }

  public void setClean(boolean clean) {
    this.clean = clean;
  }
}
