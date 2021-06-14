package com.gma.assistance.gma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "authority", nullable = false)
    private String authority;

    @Column(name = "operator_id", nullable = false)
    private Integer operatorId;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id + '\'' +
                "authority=" + authority + '\'' +
                "operatorId=" + operatorId + '\'' +
                '}';
    }
}
