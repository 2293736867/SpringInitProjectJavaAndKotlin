package pers.init.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Short age;

    private static final long serialVersionUID = 1L;
}