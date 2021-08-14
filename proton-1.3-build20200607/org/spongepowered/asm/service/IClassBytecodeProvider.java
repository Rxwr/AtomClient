package org.spongepowered.asm.service;

import org.spongepowered.asm.lib.tree.ClassNode;

public interface IClassBytecodeProvider {
   byte[] getClassBytes(String var1, String var2);

   byte[] getClassBytes(String var1, boolean var2);

   ClassNode getClassNode(String var1);
}
