package com.mycompany.praktykiv1;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Grucha
 */
public class StringConverter {

    private static final String EOF = "[\r\n]+";

    public String convetrToStatic(String text, PropertyList list) {
        String[] dashboard = text.split(EOF);
        for (int i = 0; i < dashboard.length; i++) {
            dashboard[i] = dashboard[i].trim().replaceAll(" ", "_").toUpperCase();

            String holder = "";
            List<AdditionalProperty> filteredList = list.stream().filter(p -> p.getActive()).collect(Collectors.toList());
            for (AdditionalProperty property : filteredList) {
                holder += property.getValue() + " ";
            }
            dashboard[i] = holder.trim() + " " + dashboard[i];

        }
        String out = "";
        StringBuilder strB = new StringBuilder(out);
        for (int i = 0; i < dashboard.length; i++) {
            strB.append(dashboard[i]);
            strB.append("\n");
        }
        out = strB.toString();

        return out;

    }

    
    
    
    public String toCamelCase(String out) {
        String[] parts = out.split("_");
        String camelCaseString = "";
        for (String part : parts) {
            camelCaseString = camelCaseString + toProperCase(part);
        }
        return camelCaseString;
    }

    public String toProperCase(String out) {
        return out.substring(0, 1).toUpperCase()
                + out.substring(1).toLowerCase();
    }

}

//PropertyList
