package pl.coderslab.charity.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRespository categoryRespository;

    public List<Category> categoryList() {
        return categoryRespository.findAll();
    }

    public Optional<Category> oneCategory(Long id) {
        Optional <Category> category = categoryRespository.findById(id);
        return category;
    }
}
