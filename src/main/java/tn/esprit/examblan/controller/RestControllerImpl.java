package tn.esprit.examblan.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examblan.services.IService;

@RestController
@AllArgsConstructor
public class RestControllerImpl {
    IService service;
}
