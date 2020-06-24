package entities;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-17T11:23:13")
@StaticMetamodel(PaymentEntitiy.class)
public class PaymentEntitiy_ { 

    public static volatile SingularAttribute<PaymentEntitiy, BigInteger> amount;
    public static volatile SingularAttribute<PaymentEntitiy, String> method;
    public static volatile SingularAttribute<PaymentEntitiy, Integer> id;

}