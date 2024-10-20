package defpackage;

import J.N;
import android.content.Context;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uY1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10431uY1 {
    public final String a;
    public final Class b;
    public final String c;
    public Object d;
    public C12146zY1 e;
    public boolean f;

    public C10431uY1(String str, Class cls, String str2) {
        this.a = str;
        this.b = cls;
        this.c = str2;
    }

    public final InterfaceC2271Rm1 c() {
        if (this.e == null) {
            C9692sN3 c9692sN3 = new C9692sN3();
            try {
                this.e = new C12146zY1(this.c);
                c9692sN3.close();
            } catch (Throwable th) {
                try {
                    c9692sN3.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        return this.e;
    }

    public static Object f(String str, String str2) {
        Context context = V60.a;
        if (BundleUtils.d(context, str)) {
            context = BundleUtils.a(context, str);
        }
        try {
            C7432ln3 c = C7432ln3.c();
            try {
                Object newInstance = context.getClassLoader().loadClass(str2).newInstance();
                c.close();
                return newInstance;
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean g() {
        C9692sN3 c9692sN3 = new C9692sN3();
        try {
            boolean d = c().d(this.a);
            c9692sN3.close();
            return d;
        } catch (Throwable th) {
            try {
                c9692sN3.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d(InterfaceC2401Sm1 interfaceC2401Sm1) {
        C9692sN3 c9692sN3 = new C9692sN3();
        try {
            c().b(this.a, interfaceC2401Sm1);
            c9692sN3.close();
        } catch (Throwable th) {
            try {
                c9692sN3.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void e() {
        C9692sN3 c9692sN3 = new C9692sN3();
        try {
            c().c(this.a);
            c9692sN3.close();
        } catch (Throwable th) {
            try {
                c9692sN3.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final Object b() {
        Class cls = this.b;
        String str = this.a;
        C9692sN3 c9692sN3 = new C9692sN3();
        try {
            Object obj = this.d;
            if (obj != null) {
                return obj;
            }
            if (h(str).a()) {
                a();
            }
            Object f = f(str, this.c);
            try {
                Object cast = cls.cast(f);
                this.d = cast;
                c9692sN3.close();
                return cast;
            } catch (ClassCastException e) {
                ClassLoader classLoader = cls.getClassLoader();
                ClassLoader classLoader2 = f.getClass().getClassLoader();
                throw new RuntimeException("Failure casting " + str + " module class, interface ClassLoader: " + classLoader + " (parent " + classLoader.getParent() + "), impl ClassLoader: " + classLoader2 + " (parent " + classLoader2.getParent() + "), equal: " + classLoader.equals(classLoader2) + " (parents equal: " + classLoader.getParent().equals(classLoader2.getParent()) + ")", e);
            }
        } finally {
            try {
                c9692sN3.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        String str = this.a;
        InterfaceC11803yY1 h = h(str);
        String[] c = h.c();
        String[] b = h.b();
        if (c.length > 0 || b.length > 0) {
            N.M_3lILbP(str, c, b);
        }
        this.f = true;
    }

    public static InterfaceC11803yY1 h(String str) {
        if (!BundleUtils.c()) {
            return new C10088tY1();
        }
        return (InterfaceC11803yY1) f(str, "org.chromium.components.module_installer.builder.ModuleDescriptor_" + str);
    }
}
