/*******************************************************************************
 * Copyright (c) 2011, 2012 Cristiano Gavião - Lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cristiano Gavião - initial API and implementation
 *******************************************************************************/
package org.lunifera.metamodel.dsl.component.template.library.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.lunifera.metamodel.dsl.component.template.library.ui.internal.ComponentTemplateLibraryDslActivator;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one
 * (componentTemplateLibrary).
 */

public class LuniferaNewComponentLibraryWizardPage extends
		WizardNewFileCreationPage {

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public LuniferaNewComponentLibraryWizardPage(IStructuredSelection selection) {
		super("Lunifera", selection);
		setTitle("Component Template Library File");
		setFileName("new_component_template_library_model");
		setFileExtension("componentTemplateLibrary");
		setDescription("This wizard creates a new file with *.componentTemplateLibrary extension that can be opened by a multi-page editor.");
	}
	
	@Override
	protected InputStream getInitialContents() {
		try {
			return ComponentTemplateLibraryDslActivator.getInstance().getBundle()
					.getEntry("/resources/initialmodel.componentTemplateLibrary").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}