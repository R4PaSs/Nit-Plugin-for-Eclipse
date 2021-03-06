package org.nitlanguage.ndt.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.nitlanguage.ndt.core.plugin.NitActivator;
import org.nitlanguage.ndt.ui.UiMsg;

/**
 * The wizard for nit installation
 * @author nathan.heu
 */
public class NitInstallationWizard extends Wizard implements IWorkbenchWizard {
	/**
	 * The new project to create and attach NitNature to
	 */
	IProject project;

	/**
	 * The page for nit installation
	 */
	protected NitInstallationPageOne pageOne;

	/**
	 * The default constructor
	 */
	public NitInstallationWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle(UiMsg.TITLE_NIT_INSTALLATION_WIZARD_PAGE);
	}

	@Override
	public void addPages() {
		pageOne = new NitInstallationPageOne();
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		pageOne.save();
		return NitActivator.getDefault().getNitInstallation().save();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}
}
