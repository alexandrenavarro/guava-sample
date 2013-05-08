import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;


/**
 * <p>Main. </p>
 *
 * @author anavarro - May 8, 2013
 *
 */
public class Main {

    /**
     * main.
     *
     * @param args
     */
    public static void main(String[] args) {
        
        final List<Msg> msgList = Lists.newArrayList(new Msg(1, "1"), new Msg(2, "2"), new Msg(1, "3"), new Msg(4, "4"), new Msg(2, "5"));
        System.out.println("msgList=" + msgList);
        
        final Map<Integer,Msg> map = Maps.newHashMap();
        for (final Msg msg : msgList) {
            map.put(msg.getMsgId(), msg);
        }
        
        System.out.println("msgSet=" + map.values());
        
        final Set<Msg> msgList2 = Sets.newHashSet();
        msgList2.addAll(msgList);
        
        System.out.println("msgList2=" + msgList2);
        
        
        
    }
}
