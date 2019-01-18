package pattern03_factorypatterndemo.caculatorfactorymethod.factory;

import pattern03_factorypatterndemo.caculatorfactorymethod.production.AdditionOperation;
import pattern03_factorypatterndemo.caculatorfactorymethod.production.Operation;

public class AddOperationFactory extends OperationFactory {
    @Override
    public Operation getOperation() {
        return new AdditionOperation();
    }
}
