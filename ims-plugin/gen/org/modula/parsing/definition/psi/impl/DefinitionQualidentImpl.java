// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.definition.psi.*;

public class DefinitionQualidentImpl extends ASTWrapperPsiElement implements DefinitionQualident {

  public DefinitionQualidentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitQualident(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionBasicType getBasicType() {
    return findChildByClass(DefinitionBasicType.class);
  }

  @Override
  @NotNull
  public List<DefinitionIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionIdent.class);
  }

  @Override
  @Nullable
  public DefinitionStonyBrookType getStonyBrookType() {
    return findChildByClass(DefinitionStonyBrookType.class);
  }

}
