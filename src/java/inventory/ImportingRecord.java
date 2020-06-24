package inventory;

import employee.ImportingStaff;
import java.util.Date;
import product.Product;

public class ImportingRecord {

	private int ID;
	private Date date;
	private Supplier supplier;
	private Product product;
	private ImportingStaff importingStaff;

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	/**
	 * 
	 * @param supplier
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public ImportingStaff getImportingStaff() {
		return this.importingStaff;
	}

	/**
	 * 
	 * @param importingStaff
	 */
	public void setImportingStaff(ImportingStaff importingStaff) {
		this.importingStaff = importingStaff;
	}

	public Product getProduct() {
		return this.product;
	}

	/**
	 * 
	 * @param product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	public ImportingRecord() {
		// TODO - implement ImportingRecord.ImportingRecord
		throw new UnsupportedOperationException();
	}

}