package com.dokontekno.siantonx.service.school;

import com.dokontekno.siantonx.entity.school.School;
import com.dokontekno.siantonx.repository.school.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School getSchool(UUID id){
        School school = schoolRepository.getOne(id);
        return school;
    }

    public List<School> getSchools(String npsn, String name, String address, String email, String phoneNumber, String whatsappNumber){
        return schoolRepository.getSchools(npsn, name, address, email, phoneNumber, whatsappNumber);
    }

    @Transactional
    public School saveData(School school){
        if (school.getId() == null){
            valNpsn(true, school.getId(), school.getNpsn());
        }else{
            valNpsn(false, school.getId(), school.getNpsn());
        }

        return schoolRepository.save(buildData(school));
    }

    private void valNpsn(Boolean isAdd, UUID id, String npsn){
        if (isAdd){
            if (schoolRepository.existsByNpsn(npsn))
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "NPSN Telah digunakan");
        }else{
            School school = getSchool(id);
            if (npsn.equals(school.getNpsn()))
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "NPSN Tidak boleh berubah");
        }
    }

    @Transactional
    public void delete(UUID id){
        if (id == null || getSchool(id) == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "NPSN tidak ditemukan");

        schoolRepository.deleteById(id);
    }

    private School buildData(School school){
        School data = school.getId() == null ? new School() : getSchool(school.getId());

        data.setNpsn(school.getNpsn());
        data.setName(school.getName());
        data.setAddress(school.getAddress());
        data.setPhoneNumber(school.getPhoneNumber());
        data.setEmail(school.getEmail());
        data.setWhatsappNumber(school.getWhatsappNumber());
        data.setActive(school.getActive());
        data.setCreateBy("malikxxx");
        data.setUpdateBy("malikxxx");

        return data;
    }

}
