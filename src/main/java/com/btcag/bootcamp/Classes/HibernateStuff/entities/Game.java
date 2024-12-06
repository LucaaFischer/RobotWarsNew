package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Game")
@Table(name = "Game")
public class Game {
    @Column(name = "Game_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Map_id", nullable = false)
    private Board board;

    @Column(name = "Moves")
    @OneToMany(mappedBy = "Game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Move> moves = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void addMove(Move move) {
        this.moves.add(move);
        move.setGame(this);
    }
}
