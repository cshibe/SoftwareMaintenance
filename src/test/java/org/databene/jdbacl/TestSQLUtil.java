package org.databene.jdbacl;

import org.databene.jdbacl.dialect.PostgreSQLDialect;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBTable;
import org.junit.Assert;
import org.junit.Test;

public class TestSQLUtil {


    @Test
    public void testRenderWhereClause()
    {
        String[] columnNames = {"Hello", "This"};
        String one = "one";
        String two = "two";
        Object[] values = {one, two};
        PostgreSQLDialect postgreSQLDialect = new PostgreSQLDialect();

        String renderWhereClause = SQLUtil.renderWhereClause(columnNames,values, postgreSQLDialect);
        Assert.assertTrue("Hello = 'one' AND This = 'two'".equals(renderWhereClause));
    }

    @Test
    public void testRenderColumn()
    {
        DBTable table = new DBTable("Table");
        DBDataType type = DBDataType.getInstance("ARRAY");
        DBColumn column = new DBColumn("Name", table, type);
        String renderColumn = SQLUtil.renderColumn(column);
        Assert.assertTrue("Name ARRAY NULL".equals(renderColumn));
    }


}
