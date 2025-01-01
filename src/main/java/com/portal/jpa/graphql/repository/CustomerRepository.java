package com.portal.jpa.graphql.repository;

import com.portal.jpa.graphql.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.graphql.data.GraphQlRepository;

@GraphQlRepository
public interface CustomerRepository extends JpaRepository<Customer, Long>,
        QueryByExampleExecutor<Customer> {
}
