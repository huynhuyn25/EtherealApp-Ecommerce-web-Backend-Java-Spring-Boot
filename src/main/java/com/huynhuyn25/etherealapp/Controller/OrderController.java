package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.Cart;
import com.huynhuyn25.etherealapp.Model.Category;
import com.huynhuyn25.etherealapp.Model.Order;
import com.huynhuyn25.etherealapp.Model.User;
import com.huynhuyn25.etherealapp.Service.ICartService;
import com.huynhuyn25.etherealapp.Service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;

    @PostMapping("/add")
    public Order addOrder(@RequestParam int idUser,@RequestParam int idOrderInfor,@RequestParam String status,@RequestParam double tongTien){
        return iOrderService.addOrder(idUser, idOrderInfor,status, tongTien);

    }

    @GetMapping("/listOrder")
    public ArrayList<Order> getOrderByIDUser(@RequestParam int id){
        return iOrderService.getOrderByIDUser(id);
    }

    @PutMapping("/update")
    public Order updateOrder(@RequestParam int idOrder,@RequestParam String status){
        return iOrderService.updateOrder(idOrder,status);
    }

    @PutMapping("/addProduct")
    public Order updateProductOrder(@RequestParam int idOrder,@RequestParam int idProduct, @RequestParam int soLuong){
        return iOrderService.updateProductOrder(idOrder,idProduct,soLuong);
    }
    @GetMapping("/getAll")
    public ArrayList<Order> getAllOrder(){
        return iOrderService.getAllOrder();
    }
}
