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
package org.lunifera.metamodel.dsl.software.composition.ui.wizards;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.lunifera.metamodel.dsl.software.composition.ui.internal.CompositeModelDslActivator;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (compositeModel).
 */

public class LuniferaNewCompositionModelWizardPage extends WizardNewFileCreationPage {

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public LuniferaNewCompositionModelWizardPage(IStructuredSelection selection) {
		super("Lunifera", selection);
		setTitle("Component Composition Model File");
		setFileName("new_composition_model");
		setFileExtension("compositeModel");
		setDescription("This wizard creates a new file with *.compositionModel extension that can be opened by a multi-page editor.");
	}
	
	@Override
	protected InputStream getInitialContents() {
		try {
			return CompositeModelDslActivator.getInstance().getBundle()
					.getEntry("/resources/initialmodel.compositionModel").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}