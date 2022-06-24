package dev.abarmin.poc.merge;


import dev.abarmin.poc.merge.model.ApplicationPatchDTO;
import dev.abarmin.poc.merge.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
    @Autowired
    private PersonUpdater updater;

    public void update(ApplicationPatchDTO patch) {
        Person sourceObject = patch.getPerson();
        Person targetObject = null; // from db

        final Person updated = updater.update(sourceObject, targetObject);

        // updated; back to db

        // source obj
        // update
        // target
    }
}
