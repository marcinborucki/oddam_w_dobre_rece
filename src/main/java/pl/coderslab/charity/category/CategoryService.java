package pl.coderslab.charity.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRespository categoryRespository;

    public List<Category> categoryList() {
        return categoryRespository.findAll();
    }
}
