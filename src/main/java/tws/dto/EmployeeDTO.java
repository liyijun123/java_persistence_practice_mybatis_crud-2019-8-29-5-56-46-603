package tws.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
    private String id;
    private String name;
    private String age;
    private String dsc = name+age;

    public EmployeeDTO() {

    }

    public EmployeeDTO(String id, String name, String age,String dsc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dsc = dsc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public String getdsc() {
        return dsc;
    }

    public void setdsc(String dsc) {
        this.dsc = dsc;
    }
}
