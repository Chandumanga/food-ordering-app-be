package com.cm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
