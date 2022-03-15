package com.akashwissen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AreaTest 
{

    @Test
    public void checkArea()
    {
        Area a1 = new Area(10, 20);
        
        assertEquals(a1.area(10, 20), 200);

    }
}
