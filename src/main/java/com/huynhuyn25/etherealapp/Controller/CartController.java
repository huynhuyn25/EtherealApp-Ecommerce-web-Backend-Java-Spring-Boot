package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.Cart;
import com.huynhuyn25.etherealapp.Service.ICartService;
//import com.huynhuyn25.etherealapp.Service.IProductCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private ICartService iCartService;


    @PostMapping("/add")
    public Cart addCart(@RequestParam int idCart,@RequestParam int idProduct, @RequestParam int soLuong){
        return iCartService.addCart(idCart,idProduct,soLuong);

    }

    @PutMapping("/update")
    public Cart updateCart(@RequestParam int idCart, @RequestParam int idProductCart,@RequestParam int soLuong){
        return iCartService.updateCart(idCart,idProductCart,soLuong);
    }


    @DeleteMapping("/delete/{id}")
    public Boolean deleteProductCart(@PathVariable int id){
        return iCartService.removeCart(id);
    }

    @GetMapping("/get")
    public Cart getCart(@RequestParam int id){
        return iCartService.getCart(id);
    }


}
