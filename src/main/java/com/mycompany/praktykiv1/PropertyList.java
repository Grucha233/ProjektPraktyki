package com.mycompany.praktykiv1;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Grucha
 */
public class PropertyList extends ArrayList<AdditionalProperty> {

    public void addSafe(AdditionalProperty property) {
        Optional<AdditionalProperty> optional = this.stream().filter(p -> p.getKey().equals(property.getKey())).findFirst();
        if (optional.isPresent()) {
            AdditionalProperty findedProperty = optional.get();
            findedProperty.setActive(property.getActive());
            findedProperty.setValue(property.getValue());

        } else {
              this.add(property);
        }

    }
}
