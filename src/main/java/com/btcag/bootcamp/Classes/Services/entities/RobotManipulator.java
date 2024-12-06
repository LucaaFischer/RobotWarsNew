package com.btcag.bootcamp.Classes.Services.entities;

import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Services.Enums.Align;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "RobotManipulator")
@Table(name = "Robot-manipulator")
public class RobotManipulator {
    @Column(name = "Robot_manipulator_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Move_id", nullable = false)
    private Move move;

    @Column(name = "Align")
    @Enumerated(EnumType.STRING)
    private Align align;

    @ManyToOne
    @JoinColumn(name = "Robot_id", nullable = false)
    private Robot robot;

    @OneToMany(mappedBy = "RobotManipulator", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Items> items = new ArrayList<>();

    @Column(name = "HP_manipulator")
    private int hpManipulator;

    @Column(name = "AD_manipulator")
    private int adManipulator;

    @Column(name = "Range_manipulator")
    private int rangeManipulator;

    @Column(name = "movement_manipulator")
    private int movementManipulator;

    @Column(name = "current_map_array_index")
    private int currentMapArrayIndex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public int getHpManipulator() {
        return hpManipulator;
    }

    public void setHpManipulator(int hpManipulator) {
        this.hpManipulator = hpManipulator;
    }

    public int getAdManipulator() {
        return adManipulator;
    }

    public void setAdManipulator(int adManipulator) {
        this.adManipulator = adManipulator;
    }

    public int getRangeManipulator() {
        return rangeManipulator;
    }

    public void setRangeManipulator(int rangeManipulator) {
        this.rangeManipulator = rangeManipulator;
    }

    public int getMovementManipulator() {
        return movementManipulator;
    }

    public void setMovementManipulator(int movementManipulator) {
        this.movementManipulator = movementManipulator;
    }

    public int getCurrentMapArrayIndex() {
        return currentMapArrayIndex;
    }

    public void setCurrentMapArrayIndex(int currentMapArrayIndex) {
        this.currentMapArrayIndex = currentMapArrayIndex;
    }
}
