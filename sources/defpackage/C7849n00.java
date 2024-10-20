package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.Log;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7849n00 {
    public static final C8911q52 p = new C8911q52();
    public final Context a;
    public final String b;
    public final C5524gE1 c;
    public final C7070kk3 d;
    public String e;
    public WZ f;
    public final C6584jK1 g;
    public final C10730vP2 h;
    public int i;
    public int j;
    public C5277fX3 k;
    public ComponentTree l;
    public int m = 0;
    public int n = 0;
    public C1032Hy1 o;

    public C7849n00(Context context, String str, C5524gE1 c5524gE1, C5277fX3 c5277fX3) {
        C6584jK1 c6584jK1;
        if (c5524gE1 != null && str == null) {
            throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
        }
        this.a = context;
        Configuration configuration = context.getResources().getConfiguration();
        synchronized (C6584jK1.class) {
            C6584jK1 c6584jK12 = C6584jK1.b;
            if (c6584jK12 == null || !c6584jK12.a.equals(configuration)) {
                C6584jK1.b = new C6584jK1(new Configuration(configuration));
            }
            c6584jK1 = C6584jK1.b;
        }
        this.g = c6584jK1;
        this.h = new C10730vP2(this);
        this.k = c5277fX3;
        this.c = c5524gE1;
        this.b = str;
        this.d = null;
    }

    public C7849n00(C7849n00 c7849n00, C7070kk3 c7070kk3, C5277fX3 c5277fX3, C1032Hy1 c1032Hy1) {
        this.a = c7849n00.a;
        this.g = c7849n00.g;
        this.h = c7849n00.h;
        this.i = c7849n00.i;
        this.j = c7849n00.j;
        this.f = c7849n00.f;
        ComponentTree componentTree = c7849n00.l;
        this.l = componentTree;
        this.o = c1032Hy1;
        this.c = c7849n00.c;
        String str = c7849n00.b;
        if (str == null && componentTree != null) {
            str = componentTree.i();
        }
        this.b = str;
        this.d = c7070kk3 == null ? c7849n00.d : c7070kk3;
        this.k = c5277fX3 == null ? c7849n00.k : c5277fX3;
    }

    public static C7849n00 i(C7849n00 c7849n00) {
        return new C7849n00(c7849n00.a, c7849n00.d(), c7849n00.e(), c7849n00.h());
    }

    public final Resources f() {
        return this.a.getResources();
    }

    public String c() {
        boolean z = B10.a;
        WZ wz = this.f;
        if (wz == null) {
            throw new RuntimeException("getGlobalKey cannot be accessed from a ComponentContext without a scope");
        }
        AtomicInteger atomicInteger = WZ.B;
        return wz.n;
    }

    public final C6206iD0 b() {
        C6206iD0 c6206iD0;
        WZ wz = this.f;
        if (wz != null && (c6206iD0 = wz.x) != null) {
            return c6206iD0;
        }
        ComponentTree componentTree = this.l;
        if (componentTree == null) {
            return C11866yj0.i;
        }
        return componentTree.a0;
    }

    public void o(C6383ik3 c6383ik3, String str) {
        C0772Fy1 c0772Fy1;
        a();
        ComponentTree componentTree = this.l;
        if (componentTree == null) {
            return;
        }
        String c = c();
        C1032Hy1 c1032Hy1 = this.o;
        boolean z = (c1032Hy1 == null || (c0772Fy1 = c1032Hy1.a) == null) ? false : c0772Fy1.H;
        synchronized (componentTree) {
            if (componentTree.N == null) {
                return;
            }
            componentTree.X.g(c, c6383ik3, false);
            AbstractC10674vE1.b.addAndGet(1L);
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                Log.w("ComponentTree", "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
                synchronized (componentTree.n) {
                    L00 l00 = componentTree.o;
                    if (l00 != null) {
                        componentTree.A.c(l00);
                    }
                    componentTree.o = new L00(componentTree, str, z);
                    componentTree.A.a();
                    componentTree.A.b(componentTree.o, "");
                }
                return;
            }
            ThreadLocal threadLocal = ComponentTree.l0;
            WeakReference weakReference = (WeakReference) threadLocal.get();
            InterfaceC6554jE1 interfaceC6554jE1 = weakReference != null ? (InterfaceC6554jE1) weakReference.get() : null;
            if (interfaceC6554jE1 == null) {
                interfaceC6554jE1 = new HandlerC6212iE1(myLooper);
                threadLocal.set(new WeakReference(interfaceC6554jE1));
            }
            synchronized (componentTree.n) {
                L00 l002 = componentTree.o;
                if (l002 != null) {
                    interfaceC6554jE1.c(l002);
                }
                componentTree.o = new L00(componentTree, str, z);
                interfaceC6554jE1.a();
                interfaceC6554jE1.b(componentTree.o, "");
            }
        }
    }

    public void m(C6383ik3 c6383ik3, String str) {
        C0772Fy1 c0772Fy1;
        a();
        ComponentTree componentTree = this.l;
        if (componentTree == null) {
            return;
        }
        String c = c();
        C1032Hy1 c1032Hy1 = this.o;
        boolean z = (c1032Hy1 == null || (c0772Fy1 = c1032Hy1.a) == null) ? false : c0772Fy1.H;
        if (!componentTree.y) {
            throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
        }
        synchronized (componentTree) {
            if (componentTree.N == null) {
                return;
            }
            componentTree.X.g(c, c6383ik3, false);
            AbstractC10674vE1.c.addAndGet(1L);
            componentTree.w(str, true, z);
        }
    }

    public void n(C6383ik3 c6383ik3) {
        ComponentTree componentTree = this.l;
        if (componentTree == null) {
            return;
        }
        String c = c();
        synchronized (componentTree) {
            if (componentTree.N == null) {
                return;
            }
            componentTree.X.g(c, c6383ik3, true);
        }
    }

    public final void a() {
        if (this.e != null) {
            throw new IllegalStateException(AbstractC4199cO1.a("Updating the state of a component during ", this.e, " leads to unexpected behaviour, consider using lazy state updates."));
        }
    }

    public final TypedArray k(int[] iArr) {
        return this.a.obtainStyledAttributes(null, iArr, this.n, this.m);
    }

    public final String d() {
        String str;
        ComponentTree componentTree = this.l;
        return (componentTree == null || (str = componentTree.g0) == null) ? this.b : str;
    }

    public final C5524gE1 e() {
        C5524gE1 c5524gE1;
        ComponentTree componentTree = this.l;
        return (componentTree == null || (c5524gE1 = componentTree.h0) == null) ? this.c : c5524gE1;
    }

    public void l(C5277fX3 c5277fX3) {
        this.k = c5277fX3;
    }

    public C5277fX3 g() {
        return this.k;
    }

    public final C5277fX3 h() {
        C5277fX3 c5277fX3 = this.k;
        if (c5277fX3 == null) {
            return null;
        }
        C5277fX3 c5277fX32 = new C5277fX3();
        synchronized (c5277fX3.a) {
            c5277fX32.a.putAll(c5277fX3.a);
        }
        return c5277fX32;
    }

    public C6206iD0 j(int i, Object[] objArr) {
        WZ wz = this.f;
        if (wz != null) {
            return new C6206iD0(wz, i, objArr);
        }
        E10.a(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
        return C8225o52.i;
    }

    public final boolean p() {
        I00 i00;
        C1032Hy1 c1032Hy1 = this.o;
        if (c1032Hy1 == null || (i00 = c1032Hy1.c) == null) {
            return false;
        }
        return i00.n;
    }
}
