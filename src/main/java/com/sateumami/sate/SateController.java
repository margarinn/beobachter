package com.sateumami.sate;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;	
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sateumami.products.Products;
import com.sateumami.products.ProductsService;

@Controller
@RequestMapping("/sates") // Change to "/sates" for Sate data
public class SateController {

    @Autowired
    private SateRepository sateRepository;

    @GetMapping
    public String getSates(Model model) {
        List<Sate> sateList = sateRepository.findAll(); // Fetch all Sates
        model.addAttribute("sates", sateList); // Use "sates" for consistency
        return "index"; // Return template name
    }
}
