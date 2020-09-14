package pl.coderslab.charity.category;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity categoriesAll() {
        return ResponseEntity.ok(categoryService.categoryList());
    }

    @GetMapping("/category/{id}")
    public ResponseEntity categoryById(@PathVariable Long id ) {
        return ResponseEntity.ok(categoryService.oneCategory(id));
    }
}
