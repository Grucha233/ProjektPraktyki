package com.mycompany.praktykiv1;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Grucha
 */
public class StringConverter {

    private static final String EOF = "[\r\n]+";

    public String convetrToStatic(String text, PropertyList list, String suffix, String prefix) {
        String[] dashboard = text.split(EOF);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dashboard.length; i++) {
            dashboard[i] = dashboard[i].trim().replaceAll(" +", "_").toUpperCase();

            addPropertiesSuffixAndPrefix(list, sb, suffix, dashboard[i], prefix);
            sb.append("\n");
        }
        return sb.toString();
    }

    private void addPropertiesSuffixAndPrefix(PropertyList list, StringBuilder sb, String suffix, String row, String prefix) {
        List<AdditionalProperty> filteredList = list.stream()
                .filter(p -> p.getActive())
                .sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
                .collect(Collectors.toList());

        for (AdditionalProperty property : filteredList) {
            sb.append(property.getValue()).append(" ");
        }

        if (suffix != null && !suffix.isEmpty()) {
            sb.append(suffix);
        }
        sb.append(row);
        if (prefix != null && !prefix.isEmpty()) {
            sb.append(prefix);
        }
    }

    public String toCamelCase(String text, PropertyList propertyList, String suffix, String prefix) {
        String[] dashboard = text.replaceAll(" +", " ").split(EOF);
        StringBuilder sb = new StringBuilder();
        for (String row : dashboard) {
            Character c = row.trim().charAt(0);
            String firstChar = c.toString().toLowerCase();

            String[] words = row.split(" +");
            StringBuilder localSb = new StringBuilder(firstChar);

            if (words.length > 0 && words[0].length() > 0) {
                localSb.append(words[0].substring(1));

                for (int i = 1; i < words.length; i++) {
                    String word = words[i];
                    char first = Character.toUpperCase(word.charAt(0));
                    localSb.append(first + word.substring(1));
                }
            }
            addPropertiesSuffixAndPrefix(propertyList, sb, suffix, localSb.toString(), prefix);

            sb.append("\n");
        }
        return sb.toString();
    }

}

//PropertyList
