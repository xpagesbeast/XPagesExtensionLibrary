/*
 * � Copyright IBM Corp. 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package com.ibm.xsp.extlib.renderkit.html_extended.oneuiv302.picker;

import javax.faces.context.FacesContext;

import com.ibm.commons.util.StringUtil;
import com.ibm.xsp.component.UIViewRootEx;
import com.ibm.xsp.extlib.component.picker.AbstractPicker;
import com.ibm.xsp.extlib.component.picker.data.IPickerData;
import com.ibm.xsp.extlib.renderkit.html_extended.oneui.picker.OneUINamePickerRenderer;
import com.ibm.xsp.extlib.renderkit.html_extended.oneuiv302.OneUIv302Resources;
import com.ibm.xsp.extlib.resources.ExtLibResources;

public class OneUIv302NamePickerRenderer extends OneUINamePickerRenderer {
	
	 @Override
	    protected String encodeDojoType(String dojoType) {
	        // Transform the basic controls into OneUI ones
	        if (StringUtil.equals(dojoType, "extlib.dijit.PickerName")) { // $NON-NLS-1$
	            return "extlib.dijit.OneUIv302PickerName"; // $NON-NLS-1$
	        }
	        return super.encodeDojoType(dojoType);
	    }

	    @Override
	    protected void encodeExtraResources(FacesContext context, AbstractPicker picker, IPickerData data,
	            UIViewRootEx rootEx, String dojoType) {
	        if (StringUtil.equals(dojoType, "extlib.dijit.OneUIv302PickerName")) { // $NON-NLS-1$
	            ExtLibResources.addEncodeResource(rootEx, OneUIv302Resources.oneUIv302PickerName);
	        }
	        super.encodeExtraResources(context, picker, data, rootEx, dojoType);
	    }

}
