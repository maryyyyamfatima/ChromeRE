package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6933kL1 {
    public static void a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]))));
            } catch (IllegalAccessException e) {
                b(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), reflectiveOperationException);
    }
}
