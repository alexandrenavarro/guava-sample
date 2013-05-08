
/**
 * <p>Msg. </p>
 *
 * @author anavarro - May 8, 2013
 *
 */
public final class Msg {
    
    private int msgId;
    private String name;
    
    
    /**
     * Constructor.
     *
     * @param aMsgId
     * @param aName
     */
    public Msg(int aMsgId, String aName) {
        super();
        this.msgId = aMsgId;
        this.name = aName;
    }
    
    
    
    
    /**
     * getMsgId.
     *
     * @return
     */
    public int getMsgId() {
        return this.msgId;
    }




    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.msgId;
        return result;
    }
    
    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Msg other = (Msg) obj;
        if (this.msgId != other.msgId)
            return false;
        return true;
    }


    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Msg [msgId=" + this.msgId + ", name=" + this.name + "]";
    }
    
    
    
    
    
    

}
