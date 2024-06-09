package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.AccountDetails;

@Repository
public interface AccountRepo extends JpaRepository<AccountDetails,Long> {

}
