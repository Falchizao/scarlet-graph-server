package io.scarletgraph.api.domain.social;

import io.scarletgraph.api.domain.User;
import io.scarletgraph.api.generic.IModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tb_post")
public class Post extends IModel {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tb_user_id", referencedColumnName = "id")
    @Getter
    @Setter
    private User user;

    @Column(columnDefinition = "TEXT")
    @Getter
    @Setter
    private String content;

    @Column(name = "createdDate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Getter
    @Setter
    private Date createdDate;
}
