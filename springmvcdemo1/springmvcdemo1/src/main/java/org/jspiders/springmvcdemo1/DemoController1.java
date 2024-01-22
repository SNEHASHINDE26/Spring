package org.jspiders.springmvcdemo1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController1 {
    List<Store> itemlist = new ArrayList<>();

    {
        itemlist.add(new Store("TABLE", 15000.25, 16000.50));
        itemlist.add(new Store("AC", 15000.25, 17000.50));
        itemlist.add(new Store("IRON", 1000.25, 900.50));
        itemlist.add(new Store("Mobile", 20000.25, 25000.50));
        itemlist.add(new Store("Tablet", 25000.25, 9000.50));
    }
    @GetMapping("/")
    public String getMessage() {
        return "welcome";
    }

    @GetMapping("/aboutus")
    public String getStoreInfo(Model model) {

        model.addAttribute("records", itemlist);

        return "aboutus";
    }

    @GetMapping("/addproduct")
    public String getProductForm(Model model) {
        model.addAttribute("store", new Store());
        return "productform";
    }
    //this method will add new object into list
    @PostMapping("/saveproduct")
    public String insertProduct(Store store) {
        itemlist.add(store);
        return "redirect:/aboutus";
    }

    @GetMapping("/portfolio")
    public String getPortfolio(Model model){

        List<Project>projectList=new ArrayList<Project>();
        projectList.add(new Project(1,"ECOMMERCE","SPRING"));
        projectList.add(new Project(2,"ECOMMERCE","SPRING"));
        projectList.add(new Project(3,"ECOMMERCE","SPRING"));

        model.addAttribute("projects",projectList);

        return "portfolio";
    }
}
