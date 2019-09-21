package com.dokontekno.siantonx.repository.user;

import com.dokontekno.siantonx.entity.user.UserEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEmployeeRepository extends JpaRepository<UserEmployee, String> {
}
