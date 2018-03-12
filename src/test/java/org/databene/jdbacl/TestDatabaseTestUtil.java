package org.databene.jdbacl;

import org.junit.Assert;
import org.junit.Test;

public class TestDatabaseTestUtil {

    @Test
    public void testDatabaseTestUtil()
    {
        JDBCConnectData data = DatabaseTestUtil.getConnectData("postgres");
        Assert.assertTrue(data == null);
    }

}
