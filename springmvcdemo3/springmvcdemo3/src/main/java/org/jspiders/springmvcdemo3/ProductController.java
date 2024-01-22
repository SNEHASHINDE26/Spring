package org.jspiders.springmvcdemo3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    List<Product>productData=new ArrayList<>();
    {
        productData.add((new Product(1,"Mobile",25000.25)));
        productData.add((new Product(2,"Laptop",75000.25)));
        productData.add((new Product(3,"Headphone",5000.25)));

    }

    @GetMapping("/")
    public String getAllProducts(Model model){
        model.addAttribute("records",productData);
        return "productlist";
    }

    @GetMapping("/addproduct")
    public String displayProductForm(Model model){
        model.addAttribute("product", new Product());
        return "addproduct";
    }
    @PostMapping("/insertproduct")
    public String addProductDetails(Product p){
        productData.add(p);
        return "redirect:/";
    }
    @GetMapping("/updateproduct/{id}")
    public String showUpdateForm(@PathVariable (value ="id")int id,Model model){
       Product p = productData.get(id-1);
       model.addAttribute("product",p);
        return "updateproduct";

    }
    @GetMapping("/modifyproduct")
    public String changeProduct(Product p){
        productData.set(p.getProductId()-1,p);
        return "redirect:/";
    }
    @GetMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable(value = "id")int id,Model model){
        Product p=productData.get(id-1);
        productData.remove(p);
        return "redirect:/";


    }
}
