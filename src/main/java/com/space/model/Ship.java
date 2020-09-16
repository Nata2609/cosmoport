package com.space.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@DynamicUpdate
@Table(name = "ship")
public class Ship {

    //  ID корабля
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   //Название корабля (до 50 знаков включительно)
    @Column
    private String name;

    //Планета пребывания (до 50 знаков включительно)
    @Column
    private String planet;

    //Тип корабля
    @Column
    @Enumerated(EnumType.STRING)
    private ShipType shipType;

    //Дата выпуска. Диапазон значений года 2800..3019 включительно
    @Column
    private Date prodDate;

    //Использованный / новый
    @Column
    private Boolean isUsed;

    //Максимальная скорость корабля. Диапазон значений 0,01..0,99 включительно.
    // Используй математическое округление до сотых.
    @Column
    private Double speed;

    //Количество членов экипажа. Диапазон значений 1..9999 включительно.
    @Column
    private Integer crewSize;

    //Рейтинг корабля. Используй математическое округление до сотых.
    @Column
    private Double rating;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlanet() {
        return planet;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public Boolean isUsed() {
        return isUsed;
    }

    public Double getSpeed() {
        return speed;
    }

    public Integer getCrewSize() {
        return crewSize;
    }

    public Double getRating() {
        return rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
