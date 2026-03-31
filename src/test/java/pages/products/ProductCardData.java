package pages.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProductCardData {

    private String cardTitle;
    private String cardDescription;
    private String cardPrice;
}
