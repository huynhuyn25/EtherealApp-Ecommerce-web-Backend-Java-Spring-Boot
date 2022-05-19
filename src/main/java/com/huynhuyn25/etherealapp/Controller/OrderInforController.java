package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.OrderInfor;
import com.huynhuyn25.etherealapp.Service.IOrderInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/order_infor")
public class OrderInforController {
    @Autowired
    private IOrderInforService iOrderInforService;

    @PostMapping("/add")
    public OrderInfor addOrderInfor(@RequestBody OrderInfor orderInfor){
        return iOrderInforService.addOrderInfor(orderInfor);

    }

    @PutMapping("/update")
    public OrderInfor updateOrderInfor(@RequestParam int id, @RequestBody OrderInfor orderInfor){
        return iOrderInforService.updateOrderInfor(orderInfor,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteOrderInfor(@PathVariable int id){
        return iOrderInforService.removeOrderInfor(id);
    }

    @GetMapping("/getAll")
    public ArrayList<OrderInfor> getAllOrderInfor(){
        return iOrderInforService.getAllOrderInfor();
    }

    @GetMapping("/get")
    public OrderInfor getOneOrderInfor(@RequestParam int id){
        return iOrderInforService.getOneOrderInfor(id);
    }
}
