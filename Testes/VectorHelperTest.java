import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SEFTA on 25/10/2017.
 */
public class VectorHelperTest {
    @Test
    public void formule() throws Exception {
        VectorHelper test = new VectorHelper();
        int [] finalResult = {12,9,6,3};
        assertArrayEquals(finalResult,test.formule());
    }

    @Test
    public void sortV() throws Exception {
        VectorHelper test = new VectorHelper();
        int [] finalResult = {1,2,3,4};
        assertArrayEquals(finalResult,test.sortV());
    }

    @Test
    public void inversingV() throws Exception {
        VectorHelper test = new VectorHelper();
        int [] finalResult = {1,2,3,4};
        assertArrayEquals(finalResult,test.InversingV());
    }

}