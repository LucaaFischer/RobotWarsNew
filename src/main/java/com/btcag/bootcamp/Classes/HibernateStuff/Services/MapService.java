package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.HibernateStuff.Enums.Maps;
import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IMapServices;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.MapEntity;
import com.btcag.bootcamp.Classes.Map.Model.Map;

public class MapService implements IMapServices {
    Maps map;

    @Override
    public void setMap(Maps map) {
        this.map = map;
    }

    @Override
    public Maps getMap(int mapID) {
        return map;
    }
}
