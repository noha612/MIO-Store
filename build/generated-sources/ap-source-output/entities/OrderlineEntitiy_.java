package entities;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "EclipseLink-2.5.2.v20140319-rNA", date = "2020-06-17T11:23:13")
@StaticMetamodel(OrderlineEntitiy.class)
public class OrderlineEntitiy_ {

    public static volatile SingularAttribute<OrderlineEntitiy, Integer> quantity;
    public static volatile SingularAttribute<OrderlineEntitiy, BigInteger> price;
    public static volatile SingularAttribute<OrderlineEntitiy, Integer> id;
    public static volatile SingularAttribute<OrderlineEntitiy, Integer> onSiteOrderOrderID;

}
