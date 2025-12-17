package tech.stabnashiamunashe.omni.controllers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class HealthController {

    @GetMapping()
    public ResponseEntity<Map<String, String>> healthCheck(){
        return new ResponseEntity<>(Map.of("status","ok"), HttpStatus.OK);
    }
}
