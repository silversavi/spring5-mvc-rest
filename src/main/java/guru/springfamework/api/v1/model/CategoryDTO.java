package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
}
