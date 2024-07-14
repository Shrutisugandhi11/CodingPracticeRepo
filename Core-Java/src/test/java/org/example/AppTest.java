package org.example;


import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class AppTest {
    @Test
    void queenTest() {
        Queen queen=new Queen();
        List<List<String>> res=queen.nQueen(4);
        assertEquals(2,res.size());
    }
}
