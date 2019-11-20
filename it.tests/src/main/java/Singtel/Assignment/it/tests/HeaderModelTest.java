/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package Singtel.Assignment.it.tests;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.concurrent.Callable;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.junit.annotations.SlingAnnotationsTestRunner;
import org.apache.sling.junit.annotations.TestReference;
import org.apache.sling.settings.SlingSettingsService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import com.adobe.aem.transaction.core.fdinternal.util.Assert;
import Singtel.Assignment.core.models.HeaderModel;


/** 
 *  Test case which uses OSGi services injection
 *  
 *  <p>It relies on the <tt>ResourceResolverFactory</tt> to create test resources
 *  and then adapt them to the class under test - <tt>HelloWorldModel</tt>.</p>
 */

public class HeaderModelTest {

    private HeaderModel model;
   
   
    @BeforeEach
    void setup(){
        model = new HeaderModel();
    }

    @Test
    void getTitle() {
        Assert.assertEquals("Page Path",model.getPagePath());
    }
	

        
    
    
    
      
}
