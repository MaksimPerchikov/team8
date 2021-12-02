package ru.hrhappiness.entitys;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TypeProjectThirdCell {
    @Id
    @GeneratedValue
    private Integer id;

    private String typeProjectThirdCell;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeProjectThirdCell() {
        return typeProjectThirdCell;
    }

    public void setTypeProjectThirdCell(String typeProjectThirdCell) {
        this.typeProjectThirdCell = typeProjectThirdCell;
    }
}
