package CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
     Integer Tires = 4;

     String getModel();
     Integer getHorsePower();
     String countryProduced();
     String getColor();

}



