# Introduction

This is a small demo project to benchmark a few operations with
Neo4j for large graphs.

## Preparations

- [Download](https://neo4j.com/download/), install and start neo4j.
 
## Remarks
 
- No support for dynamic properties in Spring Data 4, see this
[report](https://jira.spring.io/browse/DATAGRAPH-555)
 
## Scratchpad

    match (node)--(source) where source.title = '4' return source,node