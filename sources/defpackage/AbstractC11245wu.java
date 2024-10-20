package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11245wu implements InterfaceC8927q80, R90, Serializable {
    public final InterfaceC8927q80 a;

    public abstract Object g(Object obj);

    public void h() {
    }

    public AbstractC11245wu(InterfaceC8927q80 interfaceC8927q80) {
        this.a = interfaceC8927q80;
    }

    @Override // defpackage.InterfaceC8927q80
    public final void d(Object obj) {
        InterfaceC8927q80 interfaceC8927q80 = this;
        while (true) {
            AbstractC11245wu abstractC11245wu = (AbstractC11245wu) interfaceC8927q80;
            InterfaceC8927q80 interfaceC8927q802 = abstractC11245wu.a;
            AbstractC0087Ar1.b(interfaceC8927q802);
            try {
                obj = abstractC11245wu.g(obj);
                if (obj == Q90.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = SP2.a(th);
            }
            abstractC11245wu.h();
            if (!(interfaceC8927q802 instanceof AbstractC11245wu)) {
                interfaceC8927q802.d(obj);
                return;
            }
            interfaceC8927q80 = interfaceC8927q802;
        }
    }

    public InterfaceC8927q80 e(Object obj, InterfaceC8927q80 interfaceC8927q80) {
        AbstractC0087Ar1.e(interfaceC8927q80, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object f = f();
        if (f == null) {
            f = getClass().getName();
        }
        sb.append(f);
        return sb.toString();
    }

    @Override // defpackage.R90
    public final R90 b() {
        InterfaceC8927q80 interfaceC8927q80 = this.a;
        if (interfaceC8927q80 instanceof R90) {
            return (R90) interfaceC8927q80;
        }
        return null;
    }

    public final StackTraceElement f() {
        int i;
        String str;
        InterfaceC5681gi0 interfaceC5681gi0 = (InterfaceC5681gi0) getClass().getAnnotation(InterfaceC5681gi0.class);
        String str2 = null;
        if (interfaceC5681gi0 == null) {
            return null;
        }
        int v = interfaceC5681gi0.v();
        if (v <= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            int i2 = i >= 0 ? interfaceC5681gi0.l()[i] : -1;
            EY1 ey1 = FY1.b;
            EY1 ey12 = FY1.a;
            if (ey1 == null) {
                try {
                    EY1 ey13 = new EY1(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    FY1.b = ey13;
                    ey1 = ey13;
                } catch (Exception unused2) {
                    FY1.b = ey12;
                    ey1 = ey12;
                }
            }
            if (ey1 != ey12) {
                Method method = ey1.a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = ey1.b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = ey1.c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = interfaceC5681gi0.c();
            } else {
                str = str2 + '/' + interfaceC5681gi0.c();
            }
            return new StackTraceElement(str, interfaceC5681gi0.m(), interfaceC5681gi0.f(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }
}
