import icu.insomniac.config.SpringConfig;
import icu.insomniac.main.Goods;
import icu.insomniac.service.GoodsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        GoodsService goodsService = context.getBean(GoodsService.class);
        ArrayList<Goods> goodsArrayList = goodsService.showAllGoods();
        for (Goods goods : goodsArrayList){
            System.out.println(goods);
        }
    }
}
