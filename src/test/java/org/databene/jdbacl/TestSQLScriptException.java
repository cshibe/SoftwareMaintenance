package org.databene.jdbacl;

import org.junit.Assert;
import org.junit.Test;

public class TestSQLScriptException {


    @Test
    public void testSQLScriptException()
    {
        SQLScriptException sqlScriptException = new SQLScriptException(1);
        Assert.assertTrue(sqlScriptException.getLineNo() == 1);
    }

    @Test
    public void testSQLScriptException1()
    {
        Throwable throwable = new Throwable("Throwing this!!");
        SQLScriptException sqlScriptException = new SQLScriptException(throwable,1);
        Assert.assertTrue(sqlScriptException.getMessage().equals("Error in execution of script line 1: Throwing this!!"));
    }
}
