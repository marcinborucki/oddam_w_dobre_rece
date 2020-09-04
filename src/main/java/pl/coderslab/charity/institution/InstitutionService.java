package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstitutionService {

    private final InstitutionRepository institutionRepository;

    List<Institution> institutionsAll() {
        List<Institution> institutions = institutionRepository.findAll();
        return institutions;
    }
}
