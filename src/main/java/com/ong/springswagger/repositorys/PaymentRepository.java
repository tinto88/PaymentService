package com.ong.springswagger.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ong.springswagger.models.PaymentAccount;



@Repository
public interface PaymentRepository extends JpaRepository<PaymentAccount, Long>{

}
