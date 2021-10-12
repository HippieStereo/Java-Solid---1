package eu.jlpc.lsp.after;

public class Employee extends BaseEmployee implements IManaged{

	public IEmployee manager = null;

	@Override
	public void assignManager(IEmployee manager) throws Exception{
		
		this.manager = manager;
		
	}

}
