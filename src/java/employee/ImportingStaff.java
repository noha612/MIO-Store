package employee;

import inventory.ImportingRecord;
import java.util.*;

public class ImportingStaff extends Employee {

    Collection<ImportingRecord> importingRecords;
    private String productType;

    public String getProductType() {
        return this.productType;
    }

    /**
     *
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public ImportingStaff() {
        // TODO - implement ImportingStaff.ImportingStaff
        throw new UnsupportedOperationException();
    }

}
