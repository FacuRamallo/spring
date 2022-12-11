package tacos.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.data.OrderRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private OrderRepository orderRepository;

    public AdminController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping("/deleteOrders")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteAllOrders() {
        orderRepository.deleteAll();
        return "redirect:/admin";
    }

    @GetMapping
    public String returnView() {
        return "admin";
    }
}
