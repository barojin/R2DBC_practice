# Getting Started
## Environment
Gradle 6.8.1
Kotlin:       1.4.20  
Groovy:       2.5.12  
Ant:          Apache Ant(TM) version 1.10.9 compiled on September 27 2020  
JVM:          1.8.0_282 (Amazon.com Inc. 25.282-b08)  
OS:           Mac OS X 10.16 x86_64  

Using IDE(intellij ultimate 2020.3), run the AccessingDataR2dbcApplication in the project.  
Then the console will show you the log related with the repository.  
You can also make the jar file through the terminal or Spring STS and run the jar file.

# Description of the project
### This is made for understanding the R2DBC and naming convention in Spring for the repository.
- Built the java application with gradle[1].
- gradle dependecy: R2DBC, H2<br>
- Used the interface **ReactiveCrudRepository**<br>
- Implemented the repository proxy By deriving the query from the method name directly[4].
- findTop2ByOrderByBalanceDesc method in AccountRepository.java[5]

# Terms
- R2DBC is the Reactive Relational Database Connectivity.<br>  
- Reactive programming APIs to relational databases.<br>
- In contrast to the blocking nature of JDBC, it uses an reactive API.[2]

Reference
[1] https://spring.io/guides/gs/accessing-data-r2dbc/
[2] https://r2dbc.io/
[3] https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/reactive/ReactiveCrudRepository.html
https://docs.spring.io/spring data/commons/docs/2.4.8/reference/html/#reference
[4] 8.2.2. Query creation, https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#reference
[5] 4.4.5 Limiting Query, https://docs.spring.io/spring-data/commons/docs/2.4.8/reference/html/#repositories.limit-query-result
