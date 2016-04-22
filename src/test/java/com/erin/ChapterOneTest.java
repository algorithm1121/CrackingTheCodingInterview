package com.erin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Peter on 2016-04-23.
 */
public class ChapterOneTest {


    private ChapterOne chapterOne;

    @Before
    public void setUp() {
        chapterOne = new ChapterOne();
    }

    @Test
    public void isUniqueCharacterTest() {

        String str1 = "a";
        //没有重复字母,返回结果应该为true
        Assert.assertTrue(chapterOne.isUniqueCharacter(str1));

        String str2 = "hello";
        //l 是重复的,返回结果应该为false
        Assert.assertTrue(!chapterOne.isUniqueCharacter(str2));
    }
}
