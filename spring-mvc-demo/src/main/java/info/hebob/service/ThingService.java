package info.hebob.service;

import info.hebob.model.Thing;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henkka on 19.3.2017.
 */
public interface ThingService {
    public void addThing(Thing thing);

    public List<Thing> getThings();
}
