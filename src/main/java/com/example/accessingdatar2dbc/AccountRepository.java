package com.example.accessingdatar2dbc;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;

interface AccountRepository extends ReactiveCrudRepository<Account, Long> {
    @Query("SELECT * FROM account WHERE last_name = :lastname")
    Flux<Account> findByLastname(String lastName);
}
