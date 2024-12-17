package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Map")
@Table(name = "Map")
public class MapEntity {
    @Column(name = "Map_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Row_length")
    private int rowLength;

    @Column(name = "Size")
    private int size;

    @Column(name = "Max-player-count")
    private int maxPlayerCount;

    @OneToMany(mappedBy = "Map", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BoardItem> boardItems;

    @OneToMany(mappedBy = "Map", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GameEntity> games = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRowLength() {
        return rowLength;
    }

    public void setRowLength(int rowLength) {
        this.rowLength = rowLength;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxPlayerCount() {
        return maxPlayerCount;
    }

    public void setMaxPlayerCount(int maxPlayerCount) {
        this.maxPlayerCount = maxPlayerCount;
    }

    public List<BoardItem> getBoardItems() {
        return boardItems;
    }

    public void setBoardItems(List<BoardItem> boardItems) {
        this.boardItems = boardItems;
    }

    public List<GameEntity> getGames() {
        return games;
    }

    public void addGame(GameEntity game) {
        this.games.add(game);
    }
}
