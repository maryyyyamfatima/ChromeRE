package defpackage;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Au4 {
    public static Object a(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(e(obj.getClass(), str, cls2).invoke(obj, serializable));
        } catch (Exception e) {
            throw new Cu4(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static Object b(Object obj, String str, Class cls, ArrayList arrayList, File file, Class cls2, ArrayList arrayList2) {
        try {
            return Object[].class.cast(e(obj.getClass(), str, cls, File.class, cls2).invoke(obj, arrayList, file, arrayList2));
        } catch (Exception e) {
            throw new Cu4(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static C11936yu4 c(Object obj, String str, Class cls) {
        return new C11936yu4(obj, f(obj, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static Object d(Class cls, String str) {
        try {
            return Boolean.class.cast(e(cls, "isDexOptNeeded", String.class).invoke(null, str));
        } catch (Exception e) {
            throw new Cu4(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e);
        }
    }

    public static Method e(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new Cu4(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static Field f(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new Cu4(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }
}
