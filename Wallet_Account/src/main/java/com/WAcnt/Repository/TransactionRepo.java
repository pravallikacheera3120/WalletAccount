package com.WAcnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WAcnt.Model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
