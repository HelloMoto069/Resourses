package andhook.lib.xposed;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class ClassUtils {
    public static final String INNER_CLASS_SEPARATOR = String.valueOf(INNER_CLASS_SEPARATOR_CHAR);
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final String PACKAGE_SEPARATOR = String.valueOf(PACKAGE_SEPARATOR_CHAR);
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    private static final boolean SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5 = true;
    private static final HashMap<String, String> abbreviationMap = new HashMap<>();
    private static final HashMap<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<>();
    private static final HashMap<String, String> reverseAbbreviationMap = new HashMap<>();
    private static final HashMap<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap<>();

    static final class StringUtils {
        static final String EMPTY = "";

        StringUtils() {
        }

        public static String deleteWhitespace(String str) {
            if (str == null || str.isEmpty()) {
                return str;
            }
            int sz = str.length();
            char[] chs = new char[sz];
            int count = 0;
            for (int i = 0; i < sz; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    chs[count] = str.charAt(i);
                    count++;
                }
            }
            if (count == sz) {
                return str;
            }
            return new String(chs, 0, count);
        }
    }

    static final class ArrayUtils {
        static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];

        ArrayUtils() {
        }

        public static boolean isSameLength(Object[] array1, Object[] array2) {
            if (array1 == null && array2 != null && array2.length > 0) {
                return false;
            }
            if (array2 == null && array1 != null && array1.length > 0) {
                return false;
            }
            if (array1 == null || array2 == null || array1.length == array2.length) {
                return ClassUtils.SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
            }
            return false;
        }
    }

    static {
        primitiveWrapperMap.put(Boolean.TYPE, Boolean.class);
        primitiveWrapperMap.put(Byte.TYPE, Byte.class);
        primitiveWrapperMap.put(Character.TYPE, Character.class);
        primitiveWrapperMap.put(Short.TYPE, Short.class);
        primitiveWrapperMap.put(Integer.TYPE, Integer.class);
        primitiveWrapperMap.put(Long.TYPE, Long.class);
        primitiveWrapperMap.put(Double.TYPE, Double.class);
        primitiveWrapperMap.put(Float.TYPE, Float.class);
        primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
        for (Class<?> primitiveClass : primitiveWrapperMap.keySet()) {
            Class<?> wrapperClass = primitiveWrapperMap.get(primitiveClass);
            if (!primitiveClass.equals(wrapperClass)) {
                wrapperPrimitiveMap.put(wrapperClass, primitiveClass);
            }
        }
        addAbbreviation("int", "I");
        addAbbreviation("boolean", "Z");
        addAbbreviation("float", "F");
        addAbbreviation("long", "J");
        addAbbreviation("short", "S");
        addAbbreviation("byte", "B");
        addAbbreviation("double", "D");
        addAbbreviation("char", "C");
    }

    private static void addAbbreviation(String primitive, String abbreviation) {
        abbreviationMap.put(primitive, abbreviation);
        reverseAbbreviationMap.put(abbreviation, primitive);
    }

    public static String getShortClassName(Object object, String valueIfNull) {
        if (object == null) {
            return valueIfNull;
        }
        return getShortClassName(object.getClass());
    }

    public static String getShortClassName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getShortClassName(cls.getName());
    }

    public static String getShortClassName(String className) {
        if (className == null || className.length() == 0) {
            return "";
        }
        StringBuilder arrayPrefix = new StringBuilder();
        int i = 0;
        if (className.startsWith("[")) {
            while (className.charAt(0) == '[') {
                className = className.substring(1);
                arrayPrefix.append("[]");
            }
            if (className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';') {
                className = className.substring(1, className.length() - 1);
            }
        }
        if (reverseAbbreviationMap.containsKey(className)) {
            className = reverseAbbreviationMap.get(className);
        }
        int lastDotIdx = className.lastIndexOf(46);
        if (lastDotIdx != -1) {
            i = lastDotIdx + 1;
        }
        int innerIdx = className.indexOf(36, i);
        String out = className.substring(lastDotIdx + 1);
        if (innerIdx != -1) {
            out = out.replace(INNER_CLASS_SEPARATOR_CHAR, PACKAGE_SEPARATOR_CHAR);
        }
        return out + arrayPrefix;
    }

    public static String getSimpleName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return cls.getSimpleName();
    }

    public static String getSimpleName(Object object, String valueIfNull) {
        if (object == null) {
            return valueIfNull;
        }
        return getSimpleName(object.getClass());
    }

    public static String getPackageName(Object object, String valueIfNull) {
        if (object == null) {
            return valueIfNull;
        }
        return getPackageName(object.getClass());
    }

    public static String getPackageName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getPackageName(cls.getName());
    }

    public static String getPackageName(String className) {
        if (className == null || className.length() == 0) {
            return "";
        }
        while (className.charAt(0) == '[') {
            className = className.substring(1);
        }
        if (className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';') {
            className = className.substring(1);
        }
        int i = className.lastIndexOf(46);
        if (i == -1) {
            return "";
        }
        return className.substring(0, i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<java.lang.Class<?>> getAllSuperclasses(java.lang.Class<?> r2) {
        /*
            if (r2 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r2.getSuperclass()
        L_0x000d:
            if (r1 == 0) goto L_0x0017
            r0.add(r1)
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x000d
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: andhook.lib.xposed.ClassUtils.getAllSuperclasses(java.lang.Class):java.util.ArrayList");
    }

    public static ArrayList<Class<?>> getAllInterfaces(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet<Class<?>> interfacesFound = new LinkedHashSet<>();
        getAllInterfaces(cls, interfacesFound);
        return new ArrayList<>(interfacesFound);
    }

    private static void getAllInterfaces(Class<?> cls, HashSet<Class<?>> interfacesFound) {
        Class<? super Object> cls2;
        while (cls2 != null) {
            for (Class<?> i : cls2.getInterfaces()) {
                if (interfacesFound.add(i)) {
                    getAllInterfaces(i, interfacesFound);
                }
            }
            Class<? super Object> superclass = cls2.getSuperclass();
            cls2 = cls;
            cls2 = superclass;
        }
    }

    public static ArrayList<Class<?>> convertClassNamesToClasses(List<String> classNames) {
        if (classNames == null) {
            return null;
        }
        ArrayList<Class<?>> classes = new ArrayList<>(classNames.size());
        for (String className : classNames) {
            try {
                classes.add(Class.forName(className));
            } catch (Exception e) {
                classes.add((Object) null);
            }
        }
        return classes;
    }

    public static List<String> convertClassesToClassNames(List<Class<?>> classes) {
        if (classes == null) {
            return null;
        }
        ArrayList<String> classNames = new ArrayList<>(classes.size());
        for (Class<?> cls : classes) {
            if (cls == null) {
                classNames.add((Object) null);
            } else {
                classNames.add(cls.getName());
            }
        }
        return classNames;
    }

    public static boolean isAssignable(Class<?>[] classArray, Class<?>... toClassArray) {
        return isAssignable(classArray, toClassArray, (boolean) SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5);
    }

    public static boolean isAssignable(Class<?>[] classArray, Class<?>[] toClassArray, boolean autoboxing) {
        if (!ArrayUtils.isSameLength(classArray, toClassArray)) {
            return false;
        }
        if (classArray == null) {
            classArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        if (toClassArray == null) {
            toClassArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        for (int i = 0; i < classArray.length; i++) {
            if (!isAssignable(classArray[i], toClassArray[i], autoboxing)) {
                return false;
            }
        }
        return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
    }

    public static boolean isPrimitiveOrWrapper(Class<?> type) {
        if (type == null) {
            return false;
        }
        if (type.isPrimitive() || isPrimitiveWrapper(type)) {
            return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
        }
        return false;
    }

    public static boolean isPrimitiveWrapper(Class<?> type) {
        return wrapperPrimitiveMap.containsKey(type);
    }

    public static boolean isAssignable(Class<?> cls, Class<?> toClass) {
        return isAssignable(cls, toClass, (boolean) SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5);
    }

    public static boolean isAssignable(Class<?> cls, Class<?> toClass, boolean autoboxing) {
        if (toClass == null) {
            return false;
        }
        if (cls == null) {
            return toClass.isPrimitive() ^ SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
        }
        if (autoboxing) {
            if (cls.isPrimitive() && !toClass.isPrimitive() && (cls = primitiveToWrapper(cls)) == null) {
                return false;
            }
            if (toClass.isPrimitive() && !cls.isPrimitive() && (cls = wrapperToPrimitive(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(toClass)) {
            return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
        }
        if (!cls.isPrimitive()) {
            return toClass.isAssignableFrom(cls);
        }
        if (!toClass.isPrimitive()) {
            return false;
        }
        if (Integer.TYPE.equals(cls)) {
            if (Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
            }
            return false;
        } else if (Long.TYPE.equals(cls)) {
            if (Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
            }
            return false;
        } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
            return false;
        } else {
            if (Float.TYPE.equals(cls)) {
                return Double.TYPE.equals(toClass);
            }
            if (Character.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                    return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
                }
                return false;
            } else if (Short.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                    return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
                }
                return false;
            } else if (!Byte.TYPE.equals(cls)) {
                return false;
            } else {
                if (Short.TYPE.equals(toClass) || Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                    return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
                }
                return false;
            }
        }
    }

    public static Class<?> primitiveToWrapper(Class<?> cls) {
        Class<?> convertedClass = cls;
        if (cls == null || !cls.isPrimitive()) {
            return convertedClass;
        }
        return primitiveWrapperMap.get(cls);
    }

    public static Class<?>[] primitivesToWrappers(Class<?>... classes) {
        if (classes == null) {
            return null;
        }
        if (classes.length == 0) {
            return classes;
        }
        Class<?>[] convertedClasses = new Class[classes.length];
        for (int i = 0; i < classes.length; i++) {
            convertedClasses[i] = primitiveToWrapper(classes[i]);
        }
        return convertedClasses;
    }

    public static Class<?> wrapperToPrimitive(Class<?> cls) {
        return wrapperPrimitiveMap.get(cls);
    }

    public static Class<?>[] wrappersToPrimitives(Class<?>... classes) {
        if (classes == null) {
            return null;
        }
        if (classes.length == 0) {
            return classes;
        }
        Class<?>[] convertedClasses = new Class[classes.length];
        for (int i = 0; i < classes.length; i++) {
            convertedClasses[i] = wrapperToPrimitive(classes[i]);
        }
        return convertedClasses;
    }

    public static boolean isInnerClass(Class<?> cls) {
        if (cls == null || cls.getEnclosingClass() == null) {
            return false;
        }
        return SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5;
    }

    public static Class<?> getClass(ClassLoader classLoader, String className, boolean initialize) throws ClassNotFoundException {
        try {
            if (!abbreviationMap.containsKey(className)) {
                return Class.forName(toCanonicalName(className), initialize, classLoader);
            }
            return Class.forName("[" + abbreviationMap.get(className), initialize, classLoader).getComponentType();
        } catch (ClassNotFoundException ex) {
            int lastDotIndex = className.lastIndexOf(46);
            if (lastDotIndex != -1) {
                try {
                    return getClass(classLoader, className.substring(0, lastDotIndex) + INNER_CLASS_SEPARATOR_CHAR + className.substring(lastDotIndex + 1), initialize);
                } catch (ClassNotFoundException e) {
                    throw ex;
                }
            }
            throw ex;
        }
    }

    public static Class<?> getClass(ClassLoader classLoader, String className) throws ClassNotFoundException {
        return getClass(classLoader, className, SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5);
    }

    public static Class<?> getClass(String className) throws ClassNotFoundException {
        return getClass(className, (boolean) SystemUtils_isJavaVersionAtLeast_JavaVersion_JAVA_1_5);
    }

    public static Class<?> getClass(String className, boolean initialize) throws ClassNotFoundException {
        ClassLoader contextCL = Thread.currentThread().getContextClassLoader();
        return getClass(contextCL == null ? ClassUtils.class.getClassLoader() : contextCL, className, initialize);
    }

    public static Method getPublicMethod(Class<?> cls, String methodName, Class<?>... parameterTypes) throws SecurityException, NoSuchMethodException {
        Method declaredMethod = cls.getMethod(methodName, parameterTypes);
        if (Modifier.isPublic(declaredMethod.getDeclaringClass().getModifiers())) {
            return declaredMethod;
        }
        ArrayList<Class<?>> candidateClasses = new ArrayList<>();
        candidateClasses.addAll(getAllInterfaces(cls));
        candidateClasses.addAll(getAllSuperclasses(cls));
        Iterator<Class<?>> it = candidateClasses.iterator();
        while (it.hasNext()) {
            Class<?> candidateClass = it.next();
            if (Modifier.isPublic(candidateClass.getModifiers())) {
                try {
                    Method candidateMethod = candidateClass.getMethod(methodName, parameterTypes);
                    if (Modifier.isPublic(candidateMethod.getDeclaringClass().getModifiers())) {
                        return candidateMethod;
                    }
                } catch (NoSuchMethodException e) {
                }
            }
        }
        throw new NoSuchMethodException("Can't find a public method for " + methodName + " " + parameterTypes.toString());
    }

    private static String toCanonicalName(String className) {
        String className2 = StringUtils.deleteWhitespace(className);
        if (className2 == null) {
            throw new NullPointerException("className must not be null.");
        } else if (!className2.endsWith("[]")) {
            return className2;
        } else {
            StringBuilder classNameBuffer = new StringBuilder();
            while (className2.endsWith("[]")) {
                className2 = className2.substring(0, className2.length() - 2);
                classNameBuffer.append("[");
            }
            String abbreviation = abbreviationMap.get(className2);
            if (abbreviation != null) {
                classNameBuffer.append(abbreviation);
            } else {
                classNameBuffer.append("L");
                classNameBuffer.append(className2);
                classNameBuffer.append(";");
            }
            return classNameBuffer.toString();
        }
    }

    public static Class<?>[] toClass(Object... array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        Class<?>[] classes = new Class[array.length];
        for (int i = 0; i < array.length; i++) {
            classes[i] = array[i] == null ? null : array[i].getClass();
        }
        return classes;
    }

    public static String getShortCanonicalName(Object object, String valueIfNull) {
        if (object == null) {
            return valueIfNull;
        }
        return getShortCanonicalName(object.getClass().getName());
    }

    public static String getShortCanonicalName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getShortCanonicalName(cls.getName());
    }

    public static String getShortCanonicalName(String canonicalName) {
        return getShortClassName(getCanonicalName(canonicalName));
    }

    public static String getPackageCanonicalName(Object object, String valueIfNull) {
        if (object == null) {
            return valueIfNull;
        }
        return getPackageCanonicalName(object.getClass().getName());
    }

    public static String getPackageCanonicalName(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return getPackageCanonicalName(cls.getName());
    }

    public static String getPackageCanonicalName(String canonicalName) {
        return getPackageName(getCanonicalName(canonicalName));
    }

    private static String getCanonicalName(String className) {
        int i;
        String className2 = StringUtils.deleteWhitespace(className);
        if (className2 == null) {
            return null;
        }
        String className3 = className2;
        int dim = 0;
        while (className3.startsWith("[")) {
            dim++;
            className3 = className3.substring(1);
        }
        if (dim < 1) {
            return className3;
        }
        if (className3.startsWith("L")) {
            if (className3.endsWith(";")) {
                i = className3.length() - 1;
            } else {
                i = className3.length();
            }
            className3 = className3.substring(1, i);
        } else if (className3.length() > 0) {
            className3 = reverseAbbreviationMap.get(className3.substring(0, 1));
        }
        StringBuilder canonicalClassNameBuffer = new StringBuilder(className3);
        for (int i2 = 0; i2 < dim; i2++) {
            canonicalClassNameBuffer.append("[]");
        }
        return canonicalClassNameBuffer.toString();
    }
}
