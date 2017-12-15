package cc.xiaoerbi.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String sex;
}
