package cn.bzk;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import cn.bzk.coreB.coreB;
import cn.bzk.coreA.coreA;

public class TestAll{
    static coreA corea;
    static coreB coreb;
    @Before
    public void setUp() throws Exception{
        corea = new coreA();
        coreb = new coreB();
    }

    @Test
    public void testTotal()
    {
        assertEquals(2,corea.addA(1,1));
        assertEquals(2,coreb.addB(1,1));
    }
}
