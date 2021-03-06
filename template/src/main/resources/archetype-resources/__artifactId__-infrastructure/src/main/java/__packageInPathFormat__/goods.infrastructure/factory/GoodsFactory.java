package ${package}.goods.infrastructure.factory;

import ${package}.goods.domain.model.Goods;
import ${package}.goods.domain.model.GoodsId;
import ${package}.goods.domain.model.Price;
import ${package}.goods.infrastructure.entity.GoodsEntity;

/**
 * 商品工厂
 *
 * @author only
 * @since 2020-05-22
 */
public class GoodsFactory {

    public static Goods valueOf(GoodsEntity entity) {
        GoodsId id = GoodsId.create(entity.getId());
        Price price = Price.create(entity.getPrice());

        return new Goods(id, entity.getTitle(), price);
    }
}
