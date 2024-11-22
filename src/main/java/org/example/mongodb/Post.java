package org.example.mongodb;

import java.awt.Color;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "post")
@NoArgsConstructor
@Getter
public class Post {

    @Id
    private String id;
    private String title;

    @CreatedDate
    private LocalDateTime createAt;

    @Builder
    public Post(String id, String title) {
        this.id = id;
        this.title = title;
    }
}