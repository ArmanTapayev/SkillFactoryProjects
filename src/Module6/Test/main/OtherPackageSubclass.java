package Module6.Test.main;

import Module6.Test.test.BaseClass;

public class OtherPackageSubclass extends BaseClass {
    public OtherPackageSubclass(){
        //this.defaultValue = 10;
        this.prtectedValue = 10;

        BaseClass a = new BaseClass();
        //a.prtectedValue = 10;
    }
}
