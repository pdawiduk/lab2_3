import edu.iis.mto.similarity.MyMockClass;
import edu.iis.mto.similarity.SimilarityFinder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shogun on 2016-06-16.
 */
public class SImilarityFinderTest {
    int[] seq1 = {0, 3, 2, 1, 4};
    int[] seq2 = {0, 3, 4, 1, 4};
    int[] otherSeq = {0, 3, 4, 3, 1, 5};

    static MyMockClass sequenceSearcher;
    static SimilarityFinder similarityFinder;

    @BeforeClass
    public static void setUp() {
        sequenceSearcher = new MyMockClass();
        similarityFinder = new SimilarityFinder(sequenceSearcher);
    }

    @Test
    public void calculateJackardSimilarityTestWithEmptySeqences() {

        int[] empty1 = {};
        int[] empty2 = {};
        assertThat(similarityFinder.calculateJackardSimilarity(empty1, empty2), is(1.0d));

    }

    @Test
    public void calculateJackardSimilarityTestWithNotEmptySeqences() {
        assertThat(similarityFinder.calculateJackardSimilarity(seq1, seq2), is(1.0d));
    }

    @Test
    public void calculateJackardSimilarityTestWithDiffrentSeqences() {
        assertThat(similarityFinder.calculateJackardSimilarity(seq1, otherSeq), lessThan(1.0d));
    }

    @Test
    public void calculateJackardSimilarityTestWithVeryBigSeqences() {
        int[] bigsequence = {2, 223, 2, 6, 4, 7, 9, 5, 9, 4};
        assertThat(similarityFinder.calculateJackardSimilarity(seq1, bigsequence), lessThan(1.0d));
    }


}
