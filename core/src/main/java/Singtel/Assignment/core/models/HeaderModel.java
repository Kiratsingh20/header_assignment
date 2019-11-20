package Singtel.Assignment.core.models;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.day.cq.wcm.api.Page;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {
		
		/** The pagePath. */
		@Inject
		private Resource pagePath; 

		/**
		 * @return the PagePath
		 */
		public Page getPagePath() {
			return pagePath.adaptTo(Page.class);
		}		
	}


