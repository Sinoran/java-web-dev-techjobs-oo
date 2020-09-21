package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job;

    @Before
    public void createJob() {
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        Job test_one = new Job();
        Job test_two = new Job();
        assertNotEquals(test_one.getId(), 2);
        assertNotEquals(test_two.getId(), 2);
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(test_job.getName(), "Product tester");
        assertEquals(test_job.getEmployer().getValue(), "ACME");
        assertEquals(test_job.getLocation().getValue(), "Desert");
        assertEquals(test_job.getPositionType().getValue(), "Quality control");
        assertEquals(test_job.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job test_two = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(test_job, test_two);
    }
}
