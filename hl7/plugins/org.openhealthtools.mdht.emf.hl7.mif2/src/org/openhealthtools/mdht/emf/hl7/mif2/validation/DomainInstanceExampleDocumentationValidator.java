/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue;
import org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleDocumentation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DomainInstanceExampleDocumentationValidator {
	boolean validate();

	boolean validateDefinition(CascadableAnnotation value);

	boolean validateRationale(CascadableAnnotation value);

	boolean validateRequirements(ContextAnnotation value);

	boolean validateDesignComments(EList<DesignComment> value);

	boolean validateStabilityRemarks(EList<ContextAnnotation> value);

	boolean validateWalkthrough(ContextAnnotation value);

	boolean validateOpenIssue(EList<OpenIssue> value);

	boolean validateOtherAnnotation(EList<OtherAnnotation> value);
}
