package icu.insomniac.service;

import icu.insomniac.config.SpringConfig;
import icu.insomniac.main.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class GoodsServiceTest {
    @Autowired
    private GoodsService goodsService;

    @Test
    public void testShowAllGoods(){
        ArrayList<Goods> goodsArrayList = goodsService.showAllGoods();
        for (Goods goods : goodsArrayList){
            System.out.println(goods);
        }
    }
}
