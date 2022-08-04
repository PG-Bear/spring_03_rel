package icu.insomniac.service.impl;

import icu.insomniac.dao.GoodsDao;
import icu.insomniac.main.Goods;
import icu.insomniac.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    public ArrayList<Goods> showAllGoods() {
        return goodsDao.findAll();
    }
}
