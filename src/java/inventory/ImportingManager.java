package inventory;

public class ImportingManager {

	private ImportingRecordDAO dao;
	private ImportingRecord record;

	public void create() {
		// TODO - implement ImportingManager.create
		throw new UnsupportedOperationException();
	}

	public void importing() {
		// TODO - implement ImportingManager.importing
		throw new UnsupportedOperationException();
	}

	public ImportingRecordDAO getDao() {
		return this.dao;
	}

	/**
	 * 
	 * @param dao
	 */
	public void setDao(ImportingRecordDAO dao) {
		this.dao = dao;
	}

	public ImportingRecord getRecord() {
		return this.record;
	}

	/**
	 * 
	 * @param record
	 */
	public void setRecord(ImportingRecord record) {
		this.record = record;
	}

	public ImportingManager() {
		// TODO - implement ImportingManager.ImportingManager
		throw new UnsupportedOperationException();
	}

}