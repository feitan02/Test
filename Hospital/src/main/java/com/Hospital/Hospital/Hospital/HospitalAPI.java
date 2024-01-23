package com.Hospital.Hospital.Hospital;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalAPI {

    private final HospitalService hospitalService;

    @Autowired
    public HospitalAPI(HospitalService hospitalService){
        this.hospitalService = hospitalService;
    }

    @PostMapping
    public ResponseEntity salvar(@RequestBody Hospital hospital){
        return ResponseEntity.ok(this.hospitalService.salvar(hospital));
    }
}