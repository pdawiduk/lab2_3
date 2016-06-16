import edu.iis.mto.similarity.MyMockClass;
import edu.iis.mto.similarity.SimilarityFinder;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shogun on 2016-06-16.
 */
public class SImilarityFinderTest {
    int [] seq1 = {0,3,2,1,4};
    int [] seq2 = {0,3,4,1,4};
    @Test
    public void calculateJackardSimilarityTestWithEmptySeqences(){

        int[] empty1={};
        int[] empty2={};

        MyMockClass sequenceSearcher = new MyMockClass();
        SimilarityFinder similarityFinder = new SimilarityFinder(sequenceSearcher);
        assertThat(similarityFinder.calculateJackardSimilarity(empty1,empty2),is(1.0d));

    }
}
