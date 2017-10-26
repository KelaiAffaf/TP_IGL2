import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SEFTA on 25/10/2017.
 */
public class VectorHelperTest {
    @Test
    public void getVector() throws Exception {

    }

    @Test
    public void max_Min() throws Exception {

    }

    @Test
    public void formule() throws Exception {

    }

    @Test
    public void sortV() throws Exception {
        VectorHelper test = new VectorHelper();
        int [] finalResult = {5,19,24,51};
        assertArrayEquals(finalResult,test.sortV());
    }

    @Test
    public void sommeVectors() throws Exception {

    }

    @Test
    public void inversingV() throws Exception {
        VectorHelper test = new VectorHelper();
        int [] FinalResult = {1,2,3,4};
        assertArrayEquals(FinalResult,test.InversingV());
    }

}