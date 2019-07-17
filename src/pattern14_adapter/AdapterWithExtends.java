package pattern14_adapter;

/**
 * 方式一：通过继承方式实现适配器
 * 提供给用户20V的电压
 */
public class AdapterWithExtends extends OldComponent{
    public int use20V() {
        return super.use220V() - 200;
    }
}
