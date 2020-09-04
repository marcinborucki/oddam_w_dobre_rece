package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class InstitutionController {

    private final InstitutionService institutionService;


    @GetMapping("/institutions")
    public ResponseEntity <List<Institution>> allInstitution() {
        return ResponseEntity.ok(institutionService.institutionsAll());
    }
}
