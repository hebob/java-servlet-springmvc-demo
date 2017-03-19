package info.hebob.service;

import info.hebob.model.Thing;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henkka on 19.3.2017.
 */
@Service
public class ThingServiceImpl implements ThingService {

    private List<Thing> things = new LinkedList<Thing>();

    public void addThing(Thing thing) {
        things.add(thing);
    }

    public List<Thing> getThings() {
        return things;
    }
}
