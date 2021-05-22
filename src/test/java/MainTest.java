
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.AtLeast;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;

public class MainTest {

    @Test
    void addTest() {
        Main main = new Main();
        assertEquals(5, main.add(3, 2));
    }

    @Test
    void doSomethingTest() {
        ConsolePrinter consolePrinterMock = Mockito.mock(ConsolePrinter.class);
        //dla metod void
        doCallRealMethod().when(consolePrinterMock).print("x");
        //dla metod które coś zwracają
        //Mockito.when(consolePrinterMock.print(Mockito.anyString())).thenCallRealMethod()
        new Main().doSomething(consolePrinterMock);
        System.out.println();
        doCallRealMethod().when(consolePrinterMock).print(anyString(), eq("x"));
        new Main().doSomething(consolePrinterMock);

        verify(consolePrinterMock, new AtLeast(3)).print(anyString());
    }
}
