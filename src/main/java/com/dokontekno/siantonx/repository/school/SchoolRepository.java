package com.dokontekno.siantonx.repository.school;

import com.dokontekno.siantonx.entity.school.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SchoolRepository extends JpaRepository<School, UUID> {
    Boolean existsByNpsn(String npsn);

    @Query(value = "SELECT * FROM \"master_school\" \n" +
                   "WHERE id IS NOT NULL AND npsn LIKE :npsn AND name LIKE :name AND address LIKE :address \n" +
                   "AND email LIKE :email AND phone_number LIKE :phoneNumber AND whatsapp_number LIKE :whatsappNumber",
                    nativeQuery = true)
    List<School> getSchools(@Param("npsn") String npsn,
                                   @Param("name") String name,
                                   @Param("address") String address,
                                   @Param("email") String email,
                                   @Param("phoneNumber") String phoneNumber,
                                   @Param("whatsappNumber") String whatsappNumber);
}
