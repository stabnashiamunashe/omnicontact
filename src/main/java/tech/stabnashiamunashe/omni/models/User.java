package tech.stabnashiamunashe.omni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
@AllArgsConstructor
public class User {
    @Id
    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private String address;

}
