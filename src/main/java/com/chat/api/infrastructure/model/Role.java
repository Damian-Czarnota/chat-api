package com.chat.api.infrastructure.model;

import com.chat.api.infrastructure.enums.RoleName;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Enumerated(EnumType.STRING)
    private RoleName roleName;

    public Role(RoleName roleName){
        this.roleName = roleName;
    }
}
