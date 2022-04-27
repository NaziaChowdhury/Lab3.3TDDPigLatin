import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    PigLatin ob = new PigLatin();
    @Test
    void translate(){
        assertEquals("appleway", ob.translate("apple") );
        assertEquals("elseway", ob.translate("else") );
        assertEquals("iconway", ob.translate("icon") );
        assertEquals("orangeway", ob.translate("orange") );
        assertEquals("unitway", ob.translate("unit") );
        assertEquals("ellohay", ob.translate("hello") );
        assertEquals("ortpay", ob.translate("port") );
        assertEquals("ortspay", ob.translate("sport") );
        assertEquals("ingspray", ob.translate("spring") );
        assertEquals("ELLOHay", ob.translate("HELLO"));
    }


}