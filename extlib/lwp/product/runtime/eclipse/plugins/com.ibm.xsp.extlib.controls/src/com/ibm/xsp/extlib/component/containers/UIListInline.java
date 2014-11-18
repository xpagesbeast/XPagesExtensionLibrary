/*
 * � Copyright IBM Corp. 2010
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

package com.ibm.xsp.extlib.component.containers;

import com.ibm.xsp.extlib.stylekit.StyleKitExtLibDefault;


/**
 * Inline List of controls.
 */
public class UIListInline extends UIList {
	
    public static final String COMPONENT_TYPE = "com.ibm.xsp.extlib.containers.ListInline"; //$NON-NLS-1$
	public static final String RENDERER_TYPE = "com.ibm.xsp.extlib.containers.OneUIInlineList"; //$NON-NLS-1$
	
	public UIListInline() {
		setRendererType(RENDERER_TYPE);
	}
	
	@Override
	public String getStyleKitFamily() {
		return StyleKitExtLibDefault.CONTAINER_LIST_INLINE;
	}
	
}