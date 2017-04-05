package com.wuye.controller;

import com.wuye.bean.Goods;
import com.wuye.bean.User;
import com.wuye.repository.GoodsRepository;
import com.wuye.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 入库管理
 * Created by Administrator on 2017/4/1.
 */
@RestController
public class InstoreController {
    @Autowired
    private GoodsRepository repository;
    @RequestMapping(value = "/instore", method = RequestMethod.POST)
    public String saveInstoreInfo(@RequestParam("idetifyID") String idetifyID,@RequestParam("name") String name
    ,@RequestParam("price") String price,@RequestParam("instoreNum") String instoreNum,@RequestParam("goodstype") String goodstype) {
        Goods existgoods=repository.findByIdetifyID(Integer.parseInt(idetifyID));
        if(existgoods!=null){
            existgoods.setTotalNum(existgoods.getTotalNum()+Integer.parseInt(instoreNum));
            repository.save(existgoods);
            return "SUCCESS";
        }
        else {
        Goods goods=new Goods();
        goods.setIdetifyID(Integer.parseInt(idetifyID));
        goods.setName(name);
        goods.setPrice(Double.parseDouble(price));
        goods.setTotalNum(Integer.parseInt(instoreNum));
        goods.setType(goodstype);
        repository.save(goods);
            return "SUCCESS";
        }

    }
}
