package base.java;

import me.jiangyu.website.util.DateUtil;
import org.junit.Test;

/**
 * Created by jiangyukun on 2015/1/29.
 */
public class DateUtilTest {
    @Test
    public void testGetCurrentDateTimeString() {
        String dateString = DateUtil.getCurrentDateTimeString();
        System.out.println(dateString);
    }
}
