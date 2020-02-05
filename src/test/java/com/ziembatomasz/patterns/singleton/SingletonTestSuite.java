package com.ziembatomasz.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTestSuite {
    @Test
    public void testGetFileName(){
        //Given
        SingletonFile.getInstance().open("Documents");
        //When
        String fileName = SingletonFile.getInstance().getFileName();
        //Then
        Assert.assertEquals("Documents", fileName);
    }
}
