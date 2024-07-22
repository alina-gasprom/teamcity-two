package ru.alina.teamcitytwo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {
    @GetMapping("/")
    public ResponseEntity<?> getOne() {
        return new ResponseEntity<>("I AM NUMBER TWO!", HttpStatus.OK);
    }
}
