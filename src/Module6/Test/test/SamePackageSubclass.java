package Module6.Test.test;

public class SamePackageSubclass extends BaseClass {
    public SamePackageSubclass(){
        this.defaultValue = 3;
        this.prtectedValue =3;
        BaseClass a = new BaseClass();
        a.defaultValue = 3;
        a.prtectedValue = 3;
    }
}
