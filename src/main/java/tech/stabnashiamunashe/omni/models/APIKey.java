package tech.stabnashiamunashe.omni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class APIKey {

    @Id
    private Long id;

    private String keyHash;

    private Instant createdAt;
    private Instant expires;

}
