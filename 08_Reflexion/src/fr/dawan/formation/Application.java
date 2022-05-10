package fr.dawan.formation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.List;

/*
 * La reflexion est la possibilit� pour une classe ou un objet 
 * de s'examiner. 
 * Elle permet au code Java d'�tudier un objet (plus pr�cisement 
 * la classe de l'objet). 
 * Nous pouvons trouver les constructeurs, les m�thodes, et les 
 * attributs d'une classe ainsi que leur valeurs/ 
 * Nous pouvons charger la valeur des attributs, invoquer dynamiquement
 * des m�thodes, et construire de nouveaux objets
 * 
 * La reflexion est la capacit� d'un langage � inspecter et � appeler 
 * dynamiquement des classes, des m�thodes, des attributs... au moment 
 * de l'execution
 */
public class Application {

	public static void main(String[] args) {
		
		
		//1-R�cuperation de l'objet Class 
		// avec .class
		Class<String> c1 = String.class;
		
		/*
		 * 2-avec getClass
		 * La m�thode getClass()  d�finit dans la classe Object 
		 * renvoie une instance de la classe Class 
		 */
		String str = "Hello";
		Class<? extends String> c2 = str.getClass();
		
		/*
		 * 3- Avec Class.forName
		 * le m�thode statique forName() de la classe Class 
		 * permet de charger dynamiquement une classe dont 
		 * le nom est fourni en param�tre
		 */
		try {
			Class<?> c3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Nom de la classe 
		System.out.println(c1.getName());
		
		//Nom de la classe m�re 
		System.out.println(c1.getSuperclass().getName());
		
		//Obtenir tous les attributs de la classe 
		System.out.println("\n___Attributs___");
		Field[] attr = c1.getDeclaredFields();
		for (Field field : attr) {
			System.out.println(field.getName());
		}
		
		//Obtenir toutes les m�thodes de la classe 
		System.out.println("\n___M�thodes___");
		Method[] methodes =  c1.getDeclaredMethods();
		for (Method method : methodes) {
			
			//Nom de la m�thode
			System.out.print(method.getName() + "\t");
			
			//Nom du type de retour de la m�thode 
			System.out.print(method.getReturnType().getName()+ "<==>");
			
			//Nom de l'accessibilit� de la m�thode (public, private, protected)
			int modifieur = method.getModifiers();
			if(Modifier.isPublic(modifieur)) {
				System.out.println("public");
			} else if(Modifier.isPrivate(modifieur)) {
				System.out.println("private");
			} else if(Modifier.isProtected(modifieur)) {
				System.out.println("protected");
			}
			
			//Obtenir les param�tres de la m�thodes 
			Parameter[] params = method.getParameters();
			for (Parameter param : params) {
				//Nom et nom du type des param�tres de la m�thode 
				System.out.println("\t" + param.getName() + " " + 
				param.getType().getName());
			}
			
			//Ontenir tous les constructeurs de la classe 
			Constructor[] constructs =   c1.getConstructors();
			for (Constructor construct : constructs) {
				System.out.println(construct);
			}
			 
		}
		
		/*
		 * La methode newInstance() de la classe Class permet de cr�er 
		 * une instance de la classe represent�e par cet Class Objet--- 
		 * et d'invoquer SON CONSTRUCTEUR PAR DEFAUT
		 */
		//Instanciation dynamique
		System.out.println("\n\nIntanciation dynamique avec newInstance");
		
			String strDefault;
			try {
				strDefault = c1.newInstance();
				System.out.println(strDefault);
				
				
				//Avec le constructeur qui a une chaine de caract�re 
				//pour param�tre 
				
				//Instanciation statique => equivalent
				//String str11 = new String("azery");
				Constructor<String> constructeur;
				constructeur = c1.getConstructor(new Class[] {String.class});
				String strString = constructeur.newInstance(new Object[] {"azerty"});
				System.out.println(strString);
				
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
			//Invocation dynamique d'une m�thode 
			try {
				//Equivalent instanciation statique
//				String str22 = new String("Azerty123");
//				str22 = str22.toUpperCase();
//				str22.substring(6);
//				String.valueOf(false);
//				
				String strMeth = c1.getConstructor(new Class[] {String.class})
						.newInstance(new Object[] {"Azerty123"});
				//Methode sans param�tre 
				Method mSp = c1.getMethod("toUpperCase", new Class[] {});
				
				//Methode avec param�tre 
				Method  mAp = c1.getMethod("substring", new Class[] {int.class});
				System.out.println(mAp.invoke(strMeth, new Object[] {6}));

				//Method static 
				Method mSta = c1.getMethod("valueOf", new Class[] {boolean.class});
				System.out.println(mSta.invoke(strMeth, new Object[] {false}));
				
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
