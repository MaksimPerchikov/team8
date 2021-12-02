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
public class TypeProjectFirstCell {

        @Id
        @GeneratedValue
        private Integer id;

        private String typeProjectFirstCell;

        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }

    public TypeProjectFirstCell(Integer id) {
        this.id = id;
    }

    public String getTypeProjectFirstCell() {
        return typeProjectFirstCell;
    }

    public void setTypeProjectFirstCell(String typeProjectFirstCell) {
        this.typeProjectFirstCell = typeProjectFirstCell;
    }
}

