package pattern14_adapter;

/**
 * 通过聚合来使用
 */
public class AdapterWithDelegation {
    private OldComponent oldComponent;
    public AdapterWithDelegation(OldComponent oldComponent){
        this.oldComponent = oldComponent;
    }
    public int use20V(){
        return oldComponent.use220V() - 200;
    }
}
