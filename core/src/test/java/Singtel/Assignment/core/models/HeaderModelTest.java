package Singtel.Assignment.core.models;



import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import junitx.util.PrivateAccessor;


public class HeaderModelTest {

	 private HeaderModel model;     
   
    @BeforeEach
    public void setup(){
        model = new HeaderModel();        
    }

    @Test    
    public void getTitle() throws NoSuchFieldException {    
    	PrivateAccessor.setField(model, "pagePath", Mockito.mock(Resource.class));
    	assertNull(model.getPagePath());
    }
      
}
