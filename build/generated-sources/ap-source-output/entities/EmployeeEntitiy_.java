package entities;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "EclipseLink-2.5.2.v20140319-rNA", date = "2020-06-17T11:23:13")
@StaticMetamodel(EmployeeEntitiy.class)
public class EmployeeEntitiy_ {

    public static volatile SingularAttribute<EmployeeEntitiy, Integer> branchStoreID2;
    public static volatile SingularAttribute<EmployeeEntitiy, Integer> personID;
    public static volatile SingularAttribute<EmployeeEntitiy, String> position;
    public static volatile SingularAttribute<EmployeeEntitiy, BigInteger> salary;
    public static volatile SingularAttribute<EmployeeEntitiy, Date> startDate;
    public static volatile SingularAttribute<EmployeeEntitiy, Integer> branchStoreID;

}
