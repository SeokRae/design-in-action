package kr.seok.tinyurl.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "TB_URL")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class URL {
    @Id
    @Column(name = "Hash", unique = true)
    private String id;

    @Column(name = "OriginalURL")
    private String originalUrl;

    @Column(name = "CreationDate")
    private LocalDateTime createdAt;

    @Column(name = "ExpirationDate")
    private LocalDateTime expirationAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private User userId;

}
