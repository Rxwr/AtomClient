package org.spongepowered.asm.service;

import java.net.URL;

public interface IClassProvider {
   URL[] getClassPath();

   Class<?> findClass(String var1);

   Class<?> findClass(String var1, boolean var2);

   Class<?> findAgentClass(String var1, boolean var2);
}
