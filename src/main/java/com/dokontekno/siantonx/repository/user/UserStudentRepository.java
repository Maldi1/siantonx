package com.dokontekno.siantonx.repository.user;

import com.dokontekno.siantonx.entity.user.UserStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserStudentRepository extends JpaRepository<UserStudent, String> {
}
