package com.WAcnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WAcnt.Model.Currency;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Integer>{

}
