package com.minishop.minishop.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/product")
public class ProductController {
  @Autowired

  private ProductRepository productRepository;

  @PostMapping(value = "/add", produces = "application/json; charset=UTF-8")
  public @ResponseBody String addNewProduct (@RequestParam String title, @RequestParam String description, @RequestParam Integer quantity, @RequestParam Double price, @RequestParam String sku, @RequestParam String image) {

    Product n = new Product();
    n.setTitle(title);
    n.setDescription(description);
    n.setQuantity(quantity);
    n.setPrice(price);
    n.setSku(sku);
    n.setImage(image);
    productRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Product> getAllProducts() {
    return productRepository.findAll();
  }
}