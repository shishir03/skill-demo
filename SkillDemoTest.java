import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkillDemoTest {
    @Test
    public void testAdd() {
        SkillDemo s = new SkillDemo();
        assertEquals(7, s.add(3, 4));
    }
}
