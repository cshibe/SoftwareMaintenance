package org.databene.jdbacl;

import org.databene.jdbacl.dialect.PostgreSQLDialect;
import org.junit.Test;
import org.junit.Assert;

public class TestColumnInfo {

    @Test
    public void testColumnInfo()
    {
        String columnName = "name";
        int sqlType = 1;
        PostgreSQLDialect clazz = new PostgreSQLDialect();

        ColumnInfo columnInfo = new ColumnInfo(columnName, sqlType, clazz.getClass());
        Assert.assertEquals(columnInfo.toString(), "name: " + clazz.getClass().toString());

    }
}
