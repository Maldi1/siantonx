package com.dokontekno.siantonx.repository.user;

import com.dokontekno.siantonx.entity.user.UserEmployeeTeacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEmployeeTeacherRepository extends JpaRepository<UserEmployeeTeacher, String> {
}
