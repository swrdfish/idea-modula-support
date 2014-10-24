// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionCaseStatement extends PsiElement {

  @Nullable
  DefinitionStatementSequence getStatementSequence();

  @NotNull
  List<DefinitionCaseStatements> getCaseStatementsList();

  @NotNull
  DefinitionExpression getExpression();

}
