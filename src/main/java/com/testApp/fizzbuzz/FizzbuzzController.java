package com.testApp.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/")
public class FizzbuzzController {

    private final FizzbuzService service;

    @Autowired
    public FizzbuzzController(FizzbuzService service) {
        this.service = service;
    }

    @GetMapping(value = "/fizzbuzz{entry}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getEntries(@RequestParam(value = "entry", required = false)
                                                   @PathVariable Integer entry) {

        List<String> response = entry == null ? this.service.getResults(100) :
                Collections.singletonList(this.service.getResult(entry));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}