package Puzzles.GoogleTechDev;

import org.junit.Assert;
import org.junit.Test;

public class DecodeStringsTest
{
    private DecodeStrings decodeStrings = new DecodeStrings();

    @Test
    public void testBasicInput()
    {
        String input = "3[ab]";
        String expected = "ababab";

        Assert.assertEquals(expected, decodeStrings.decodeString(input));
    }


    @Test
    public void testComplexInput()
    {
        String input = "2[a12[c2[de]]b]";
        String expected = "acdedecdedecdedecdedecdedecdedecdedecdedecdedecdedecdedecdedebacdedecdedecdedecdedecdedecdedecdedecdedecdedecdedecdedecdedeb";
        Assert.assertEquals(expected, decodeStrings.decodeString(input));
    }
}
