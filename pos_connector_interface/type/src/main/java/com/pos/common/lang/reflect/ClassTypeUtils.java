package com.pos.common.lang.reflect;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTypeUtils {

    /**
     * Get the underlying class for a type, or null if the type is a variable
     * type.
     *
     * @param type the type
     * @return the underlying class
     */
    public static Class<?> getTypeClass(Type type) {

        if (type instanceof Class) {
            return (Class) type;
        } else if (type instanceof ParameterizedType) {
            return getTypeClass(((ParameterizedType) type).getRawType());
        } else if (type instanceof GenericArrayType) {
            Type componentType = ((GenericArrayType) type).getGenericComponentType();
            Class<?> componentClass = getTypeClass(componentType);
            if (componentClass != null) {
                return Array.newInstance(componentClass, 0).getClass();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * Get the actual type arguments a child class has used to extend a generic
     * base class.
     *
     * @param baseClass  the base class
     * @param childClass the child class
     * @return a list of the raw classes for the actual type arguments.
     */
    public static <T> List<Class<?>> getTypeArguments(Class<T> baseClass, Class<? extends T> childClass) {

        Map<Type, Type> resolvedTypes = new HashMap<>();

        Type type = childClass;

        // start walking up the inheritance hierarchy until we hit baseClass
        while (!getTypeClass(type).equals(baseClass)) {

            if (type instanceof Class) {
                // there is no useful information for us in raw types, so just keep going.
                type = ((Class) type).getGenericSuperclass();
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> rawType = (Class) parameterizedType.getRawType();

                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                TypeVariable<?>[] typeParameters = rawType.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    resolvedTypes.put(typeParameters[i], actualTypeArguments[i]);
                }

                if (!rawType.equals(baseClass)) {
                    type = rawType.getGenericSuperclass();
                }
            }
        }

        // finally, for each actual type argument provided to baseClass, determine (if possible)
        // the raw class for that type argument.
        Type[] actualTypeArguments;
        if (type instanceof Class) {
            actualTypeArguments = ((Class) type).getTypeParameters();
        } else {
            actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        }
        List<Class<?>> typeArgumentsAsClasses = new ArrayList<Class<?>>();
        // resolve types by chasing down type variables.
        for (Type baseType : actualTypeArguments) {
            while (resolvedTypes.containsKey(baseType)) {
                baseType = resolvedTypes.get(baseType);
            }
            typeArgumentsAsClasses.add(getTypeClass(baseType));
        }
        return typeArgumentsAsClasses;
    }

    /**
     * Retrieves a map Name/Method with all the methods of the specified class.
     *
     * @param methodPrefix The prefix for the searched method.
     * @param clazz        The class to obtain the methods.
     * @param map          The map to fill or null if new creation required.
     * @return the Name/Method map.
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    public static Map<String, Method> getClassMethods(String methodPrefix, Class<?> clazz, Map<String, Method> map) throws IllegalAccessException,
            IllegalArgumentException,
            InvocationTargetException {

        Method[] methods = clazz.getMethods();

        if (map == null) {
            map = new HashMap<>();
        }

        for (Method m : methods) {

            if (m.getName().startsWith(methodPrefix)) {
                map.put(m.getName().substring(methodPrefix.length()).toLowerCase(), m);
            }
        }

        return map;
    }
}

