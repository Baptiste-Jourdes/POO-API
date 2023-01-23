package Jourdes.TP3.controller;

import Jourdes.TP3.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AddressFormController {
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/addresse")
    public String showAddresses(Model model) {
        return "addresse";
    }
}
