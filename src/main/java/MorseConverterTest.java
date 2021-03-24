import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MorseConverterTest {

    @Test
    public void ifTranslated()
    {
        String test = "1234567890";
        String morse = ". ___ ___ ___ ___. . ___ ___ ___. . . ___ ___. . . . ___. . . . .___ . . . .___ ___ . . .___ ___ ___ . .___ ___ ___ ___ .___ ___ ___ ___ ___";
        MorseConverter converterTest = new MorseConverter(test);
        converterTest.translateToMorse();
        Assert.assertEquals(morse, converterTest.getTranslated());
    }

    @Test
    public void ifNumbers()
    {
        MorseConverter converterTest = new MorseConverter("1234");
        converterTest.translateToMorse();
        Assert.assertEquals(false, converterTest.getKomunikat());
    }

    @Test
    public void ifLetterFounded()
    {
        MorseConverter converterTest = new MorseConverter("1234abc");
        converterTest.translateToMorse();
        Assert.assertEquals(true, converterTest.getKomunikat());
    }

    @Test
    public void ifIndexReturned() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MorseConverter converterTest = new MorseConverter("");
        Method findIndexMethod = MorseConverter.class.getDeclaredMethod("findIndex", char.class);
        findIndexMethod.setAccessible(true);
        int returnValue = (int) findIndexMethod.invoke(converterTest, '9');
        Assert.assertEquals(8, returnValue);
    }

    @Test
    public void ifNotInNumbersIndex() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MorseConverter converterTest = new MorseConverter("");
        Method findIndexMethod = MorseConverter.class.getDeclaredMethod("findIndex", char.class);
        findIndexMethod.setAccessible(true);
        int returnValue = (int) findIndexMethod.invoke(converterTest, 'a');
        Assert.assertEquals(-1, returnValue);
    }
}
