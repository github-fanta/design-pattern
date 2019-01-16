package pattern0301factorypatterndemo.caculatorfactorymethod.factory;

import pattern0301factorypatterndemo.caculatorfactorymethod.production.AdditionOperation;
import pattern0301factorypatterndemo.caculatorfactorymethod.production.Operation;

public class AddOperationFactory extends OperationFactory {
    @Override
    public Operation getOperation() {
        return new AdditionOperation();
    }
}
