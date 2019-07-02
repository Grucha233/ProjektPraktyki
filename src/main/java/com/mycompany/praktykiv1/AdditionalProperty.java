package com.mycompany.praktykiv1;

/**
 *
 * @author Grucha
 */
public class AdditionalProperty {

    private String key;
    private Boolean active;
    private String value;

    public AdditionalProperty(String key, Boolean active, String value) {
        this.key = key;
        this.active = active;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Boolean getActive() {
        return active;
    }

    public String getValue() {
        return value;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AdditionalProperty{" + "key=" + key + ", active=" + active + ", value=" + value + '}';
    }
    
    

}
