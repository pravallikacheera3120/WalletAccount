package com.WAcnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WAcnt.Model.Wallet;

@Repository
public interface WalletRepo extends JpaRepository<Wallet, Integer>{

}
