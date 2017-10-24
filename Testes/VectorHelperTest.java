import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SEFTA on 24/10/2017.
 */
public class VectorHelperTest {
    @Test
    public void sortV() throws Exception {
        int [] finalResult = {1,2,3,5,6};
        VectorHelper test = new VectorHelper();
        assertArrayEquals(finalResult,test.sortV());

    }

}