package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

/**
 * Created by Shogun on 2016-06-16.
 */
public class MyMockClass implements SequenceSearcher {
    public SearchResult search(int i, int[] ints) {
        SearchResult searchResult = new SearchResult() {

            public boolean isFound() {
                return true;
            }

            public int getPosition() {
                return 5;
            }
        };
        return searchResult;
    }
}
