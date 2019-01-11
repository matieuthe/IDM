/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.csvmanl.formatting2;

import com.google.inject.Inject;
import csvManager.Instruction;
import csvManager.Program;
import csvManager.Show;
import csvManager.Where;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.csvmanl.services.CsvManGrammarAccess;

@SuppressWarnings("all")
public class CsvManFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CsvManGrammarAccess _csvManGrammarAccess;
  
  protected void _format(final Program program, @Extension final IFormattableDocument document) {
    EList<Instruction> _instruction = program.getInstruction();
    for (final Instruction instruction : _instruction) {
      document.<Instruction>format(instruction);
    }
  }
  
  protected void _format(final Show show, @Extension final IFormattableDocument document) {
    document.<Where>format(show.getWhere());
  }
  
  public void format(final Object show, final IFormattableDocument document) {
    if (show instanceof XtextResource) {
      _format((XtextResource)show, document);
      return;
    } else if (show instanceof Show) {
      _format((Show)show, document);
      return;
    } else if (show instanceof Program) {
      _format((Program)show, document);
      return;
    } else if (show instanceof EObject) {
      _format((EObject)show, document);
      return;
    } else if (show == null) {
      _format((Void)null, document);
      return;
    } else if (show != null) {
      _format(show, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(show, document).toString());
    }
  }
}
