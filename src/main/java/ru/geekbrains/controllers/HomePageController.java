package ru.geekbrains.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.services.CategoryService;
import ru.geekbrains.services.ProductService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HomePageController {

    private final CategoryService categoryService;
    private final ProductService productService;

    @GetMapping
    public String main(Model model){
        model.addAttribute("products", productService.findAll());
        model.addAttribute("categories", categoryService.findAll());
        return "index";
    }
}
