package icu.insomniac.dao;

import icu.insomniac.main.Goods;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface GoodsDao {
    @Select("select * from goodsinfo")
    ArrayList<Goods> findAll();
}
