package com.wuye.repository;


import com.wuye.bean.Goods;
import com.wuye.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2017/2/16.
 */
public interface GoodsRepository extends JpaRepository<Goods,Long> {
    Goods findByIdetifyID(@Param("idetifyID") int idetifyID);
    //User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
