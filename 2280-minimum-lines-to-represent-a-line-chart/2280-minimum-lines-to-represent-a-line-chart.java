import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;


class Solution {
    public int minimumLines(int[][] stockPrices) {
        if (stockPrices.length == 1) { 
            return 0;
        }
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0])); 
        List<BigDecimal> diff = new ArrayList<>();
        
        for (int i = 1; i < stockPrices.length; i++) {
            BigDecimal price = new BigDecimal(stockPrices[i][1]-stockPrices[i-1][1]);
            BigDecimal time = new BigDecimal(stockPrices[i][0]-stockPrices[i-1][0]);
            BigDecimal gain = price.divide(time, MathContext.DECIMAL128);
            diff.add(gain);   
            
        }
 
        int lines = 1; 
        for (int i = 1; i < diff.size(); i++) {
            if (diff.get(i).compareTo(diff.get(i-1)) == 0) {
                continue;
            } else {
                lines++;
            }
        }
        
        return lines;
    }
}