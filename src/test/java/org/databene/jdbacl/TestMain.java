package org.databene.jdbacl;

import org.databene.commons.ConnectFailedException;
import org.databene.commons.ImportFailedException;
import org.junit.Rule;
import org.junit.Test;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class TestMain {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void testMain1() throws ConnectFailedException, ImportFailedException
    {
        exit.expectSystemExit();
        System.out.println("Testing Main Help");
        String[] args = {"-h"};
        Main.main(args);
    }

    @Test
    public void testMain2() throws ConnectFailedException, ImportFailedException
    {
        System.out.println("Testing Main Real File");
        String[] args = {"postgres"};
        Main.main(args);
    }

    @Test(expected = RuntimeException.class)
    public void testMain3() throws ConnectFailedException, ImportFailedException
    {
        System.out.println("Testing Main Bad File");
        String[] args = {"mysql"};
        Main.main(args);
    }
}
