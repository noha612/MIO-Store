package entities;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "EclipseLink-2.5.2.v20140319-rNA", date = "2020-06-17T11:23:13")
@StaticMetamodel(VoucherEntitiy.class)
public class VoucherEntitiy_ {

    public static volatile SingularAttribute<VoucherEntitiy, Double> discountPercent;
    public static volatile SingularAttribute<VoucherEntitiy, String> name;
    public static volatile SingularAttribute<VoucherEntitiy, BigInteger> discountAmount;
    public static volatile SingularAttribute<VoucherEntitiy, String> description;
    public static volatile SingularAttribute<VoucherEntitiy, Integer> id;

}
