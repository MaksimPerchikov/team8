package ru.hrhappiness.entitys;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TypeProject {

        @Id
        @GeneratedValue
        private Long id;

        private String typeProject;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTypeProject() {
            return typeProject;
        }

        public void setTypeProject(String typeProject) {
            this.typeProject = typeProject;
        }
}

