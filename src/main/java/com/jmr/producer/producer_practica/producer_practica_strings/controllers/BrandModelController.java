package com.jmr.producer.producer_practica.producer_practica_strings.controllers;

import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.BrandModel;
import com.jmr.producer.producer_practica.producer_practica_strings.services.BrandModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bmodel")
@Slf4j
public class BrandModelController {

    private final BrandModelService brandModelService;

    public BrandModelController(BrandModelService brandModelService) {
        this.brandModelService = brandModelService;
    }

    @GetMapping("/all")
    public List<BrandModel> getAll(){
        List<BrandModel> list = brandModelService.all();
        return list;
    }
}
