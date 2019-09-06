package com.mentorondemand.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.model.Payments;
@Repository
public interface PaymentRepository extends CrudRepository<Payments, Long> {

}
