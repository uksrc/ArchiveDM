package org.uksrc.dm.archive;
/*
 * Created on 10/05/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import org.ivoa.vodml.testing.AutoRoundTripWithValidationTest;

/**
 * This will run a XML and JSON round trip test on the model inst
 */
public class ArchiveModelTest extends AutoRoundTripWithValidationTest<ArchiveModel> {
    @Override
    public ArchiveModel createModel() {
        // create the model instance here.
        ArchiveModel retval = new ArchiveModel();

        Another another = new Another("test");
        retval.addContent(another);
        return retval;
    }

    @Override
    public void testModel(ArchiveModel myarchive) {
        //this could do specialized testing on the model instance
    }
}
