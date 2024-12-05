package com.btcag.bootcamp.Classes.Services.entities;

import com.btcag.bootcamp.Classes.Services.Enums.BoardItemType;
import jakarta.persistence.*;

@Entity(name = "BoardItem")
@Table(name = "BoardItem")
public class BoardItem {
    @Column(name = "BoardItem_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Type")
    private BoardItemType type;

    @Column(name = "Index")
    private int index;

    @ManyToOne
    @JoinColumn(name = "Board_id", nullable = false)
    private Board board;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BoardItemType getType() {
        return type;
    }

    public void setType(BoardItemType type) {
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Board getMap() {
        return board;
    }

    public void setMap(Board board) {
        this.board = board;
    }
}
