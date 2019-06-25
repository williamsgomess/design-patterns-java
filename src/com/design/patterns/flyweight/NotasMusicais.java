package com.design.patterns.flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {
	
	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static List<Class<? extends Nota>> clazzs;
	
	static {
		clazzs = Arrays.asList(
				Do.class, DoSustenido.class, Re.class, Mi.class, Fa.class,
				Sol.class, La.class, Si.class);
//		notas.put("do", new Do());
//		notas.put("do sustenido", new DoSustenido());
//		notas.put("re", new Re());
//		notas.put("mi", new Mi());
//		notas.put("fa", new Fa());
//		notas.put("sol", new Sol());
//		notas.put("la", new La());
//		notas.put("si", new Si());
	}
	
	public Nota pega(String nome) {
//		return notas.get(nome);
		try {
			if (!notas.containsKey(nome)) {
				for (Class<? extends Nota> clazz : clazzs) {
					if (clazz.getSimpleName().toLowerCase().equals(nome)) {
						notas.put(nome, (Nota) clazz.newInstance());
						break;
					}
				}
			}
			return notas.get(nome);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
