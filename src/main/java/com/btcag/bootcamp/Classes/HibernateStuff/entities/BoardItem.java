package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import com.btcag.bootcamp.Classes.HibernateStuff.Enums.BoardItemType;
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
    private MapEntity board;

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

    public MapEntity getMap() {
        return board;
    }

    public void setMap(MapEntity board) {
        this.board = board;
    }
}
