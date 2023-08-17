package patrickmelo.saborosogourmet.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import patrickmelo.saborosogourmet.entities.Dish;

@Data
public class DishToFrontDTO {
    private String identifier;
    private String title;
    private String dishSize;
    private String price;
    private String pic;
    private Boolean inStock;

    public DishToFrontDTO(Dish dishEntity) {
        this.identifier = dishEntity.getIdentifier();
        this.title = dishEntity.getTitle();
        this.pic = dishEntity.getPic();
        this.dishSize = dishEntity.getDishSize().toString();
        this.price = dishEntity.getPrice().toString();
        this.inStock = dishEntity.getInStock();
    }
}
