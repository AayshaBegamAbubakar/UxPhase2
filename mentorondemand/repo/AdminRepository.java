package com.mentorondemand.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.model.Admin;
@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {

}
