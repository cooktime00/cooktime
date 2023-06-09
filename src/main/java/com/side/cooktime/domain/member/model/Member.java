package com.side.cooktime.domain.member.model;

import com.side.cooktime.domain.model.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "member")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
public abstract class Member extends BaseEntity {

    @Embedded
    protected Email email;
    @Embedded
    protected Password password;
    @Embedded
    protected Name name;

    protected Member(final String email, final String password, final String firstName, final String lastName) {
        super();
        this.email = new Email(email);
        this.password = new Password(password);
        this.name = new Name(firstName, lastName);
    }

    protected Member() {
        ;
    }
}
