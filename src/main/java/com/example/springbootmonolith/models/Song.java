package com.example.springbootmonolith.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "SONGS")
public class Song {

    public Song(String songTitle, Long songLength) {
        this.songTitle = songTitle;
        this.songLength = songLength;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String songTitle;

    @Column(name = "LENGTH")
    private Long songLength;

}