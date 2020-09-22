package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job;
    Job testEmpty;

    @Before
    public void createJob() {
        testEmpty = new Job();
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

    @Test
    public void toStringTest() {
        assertTrue(test_job.toString().startsWith("\n") && test_job.toString().endsWith("\n"));
    }

    @Test
    public void setLabelAndData() {
        assertEquals("\n" + "ID: " + test_job.getId() + "\n" +
                "Name: " + test_job.getName() + "\n" +
                "Employer: " + test_job.getEmployer() + "\n" +
                "Location: " + test_job.getLocation() + "\n" +
                "Position Type: " + test_job.getPositionType() + "\n" +
                "Core Competency: " + test_job.getCoreCompetency() + "\n", test_job.toString());

    }

    @Test
    public void testForEmptyNameField() {
        String jobTest = testEmpty.toString();

        assertTrue(jobTest.contains("Name: Data not available."));
    }

    @Test
    public void testForEmptyEmployerField() {
        assertTrue(testEmpty.toString().contains("Employer: Data not available."));
    }

    @Test
    public void testForEmptyLocationField() {
        String jobTest = testEmpty.toString();

        assertTrue(jobTest.contains("Location: Data not available."));
    }

    @Test
    public void testForEmptyPositionTypeField() {
        String jobTest = testEmpty.toString();

        assertTrue(jobTest.contains("Position Type: Data not available."));
    }

    @Test
    public void testForEmptyCoreCompetencyField() {
        String jobTest = testEmpty.toString();

        assertTrue(jobTest.contains("Core Competency: Data not available."));
    }

    @Test
    public void testJobOnly() {
        String jobTest = testEmpty.toString();


    }

}
