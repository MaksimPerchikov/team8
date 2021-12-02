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
public class TypeProjectSecondCell {

    @Id
    @GeneratedValue
    private Integer id;

    private String typeProjectSecondCell;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeProjectSecondCell() {
        return typeProjectSecondCell;
    }

    public void setTypeProjectSecondCell(String typeProjectSecondCell) {
        this.typeProjectSecondCell = typeProjectSecondCell;
    }
}