package twins.logic;


import java.util.List;
import twins.boundaries.OperationBoundary;



public interface OperationsServiceExtended extends OperationsService{
	public List<OperationBoundary> getAllOperations(String adminSpace, String adminEmail,int size, int page);

}
