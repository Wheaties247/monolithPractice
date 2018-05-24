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
        //these are the params that need to match int the JSON object being sent in requests
        //exe. this.{param}
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String songTitle;

    @Column(name = "LENGTH")
    private Long songLength;

}