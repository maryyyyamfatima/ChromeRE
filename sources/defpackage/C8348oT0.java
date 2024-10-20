package defpackage;

import androidx.fragment.app.c;
import androidx.fragment.app.h;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oT0 */
/* loaded from: classes.dex */
public final class C8348oT0 {
    public static final C1439Lb3 b = new C1439Lb3();
    public final /* synthetic */ h a;

    public static Class b(ClassLoader classLoader, String str) {
        C1439Lb3 c1439Lb3 = b;
        C1439Lb3 c1439Lb32 = (C1439Lb3) c1439Lb3.get(classLoader);
        if (c1439Lb32 == null) {
            c1439Lb32 = new C1439Lb3();
            c1439Lb3.put(classLoader, c1439Lb32);
        }
        Class cls = (Class) c1439Lb32.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1439Lb32.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new OS0(AbstractC4199cO1.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new OS0(AbstractC4199cO1.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public C8348oT0(h hVar) {
        this.a = hVar;
    }

    public final c a(String str) {
        return c.V(this.a.u.g, str, null);
    }
}
