// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.modula.psi.*;

public class ModulaProgramModuleImpl extends ASTWrapperPsiElement implements ModulaProgramModule {

  public ModulaProgramModuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitProgramModule(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaBlock getBlock() {
    return findNotNullChildByClass(ModulaBlock.class);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

  @Override
  @NotNull
  public ModulaImportClause getImportClause() {
    return findNotNullChildByClass(ModulaImportClause.class);
  }

  @Override
  @NotNull
  public ModulaProgramHeader getProgramHeader() {
    return findNotNullChildByClass(ModulaProgramHeader.class);
  }

}