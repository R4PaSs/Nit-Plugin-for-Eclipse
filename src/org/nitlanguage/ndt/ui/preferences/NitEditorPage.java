package org.nitlanguage.ndt.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.nitlanguage.ndt.core.plugin.NitActivator;

/**
 * Plug-in preferences page - define editor related parameters.
 * @author nathan.heu
 */
public class NitEditorPage extends FieldEditorPreferencePage implements
    IWorkbenchPreferencePage {
	public static final String DESC_EDITOR_PREF_PAGE = "Nit editor preferences";
			
	/**
	 * Create the editor preference page.
	 */
	public NitEditorPage() {
		super(GRID);
	}

  public void createFieldEditors() {
  }

  @Override
  public void init(IWorkbench workbench) {
    setPreferenceStore(NitActivator.getDefault().getPreferenceStore());
    setDescription(DESC_EDITOR_PREF_PAGE);
  }
} 