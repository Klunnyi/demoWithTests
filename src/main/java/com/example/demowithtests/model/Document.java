package com.example.demowithtests.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "documents")
public final class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Builder.Default
    private String uuid = UUID.randomUUID().toString();

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime expireDate;

    @Builder.Default
    private Boolean isHandled = Boolean.FALSE;

    @Column(nullable = false)
    private String number;

    @ToString.Exclude
    @OneToOne(mappedBy = "document")
    private Employee employee;

    @JsonIgnore
    @OneToMany(targetEntity = History.class, mappedBy = "document")
    private List<History> history;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private Image image;*/

    public Document(String uuid, LocalDateTime expireDate, Boolean isHandled, String number) {
        this.uuid = uuid;
        this.expireDate = expireDate;
        this.isHandled = isHandled;
        this.number = number;
    }
}
