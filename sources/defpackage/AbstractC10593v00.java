package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.litho.ComponentTree;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v00 */
/* loaded from: classes.dex */
public abstract class AbstractC10593v00 implements InterfaceC4487dD0 {
    public static final C12046zE1 g;
    public static final HashMap h;
    public static final AtomicInteger i;
    public final int a;

    public void D() {
    }

    public void E() {
    }

    public void F(C7849n00 c7849n00) {
    }

    public void H(C7849n00 c7849n00, Object obj) {
    }

    public void I(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void J(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2, int i3, int i4) {
    }

    public void K(C7849n00 c7849n00) {
    }

    public void L(Object obj) {
    }

    public void M(C7849n00 c7849n00, Object obj) {
    }

    public int N() {
        return 3;
    }

    public void O(C5277fX3 c5277fX3) {
    }

    public boolean Q() {
        return false;
    }

    public void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
    }

    public boolean e() {
        return this instanceof F91;
    }

    public void f(C7849n00 c7849n00) {
    }

    public void h(String str) {
    }

    public void j(String str) {
    }

    public int k(int i2, int i3) {
        return Integer.MIN_VALUE;
    }

    public int l() {
        return 0;
    }

    public int m() {
        return 1;
    }

    public C5277fX3 n(C5277fX3 c5277fX3) {
        return c5277fX3;
    }

    public boolean o() {
        return this instanceof SJ2;
    }

    public boolean p() {
        return this instanceof VI2;
    }

    public boolean q() {
        return this instanceof SJ2;
    }

    public boolean r() {
        return this instanceof F91;
    }

    public boolean s() {
        return this instanceof C0616Et0;
    }

    public void w(C7849n00 c7849n00) {
    }

    public void x(C7849n00 c7849n00, Object obj) {
    }

    public void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
    }

    static {
        boolean z = B10.a;
        g = new C12046zE1();
        h = new HashMap();
        i = new AtomicInteger();
    }

    public AbstractC10593v00() {
        int intValue;
        Class<?> cls = getClass();
        HashMap hashMap = h;
        synchronized (hashMap) {
            if (!hashMap.containsKey(cls)) {
                hashMap.put(cls, Integer.valueOf(i.incrementAndGet()));
            }
            intValue = ((Integer) hashMap.get(cls)).intValue();
        }
        this.a = intValue;
    }

    public final Object g(Context context) {
        return B(context);
    }

    @Override // defpackage.InterfaceC4487dD0
    public final Object c(C6206iD0 c6206iD0, Object obj) {
        if (c6206iD0.g == -1048037474) {
            return i(c6206iD0, obj);
        }
        try {
            return i(c6206iD0, obj);
        } catch (Exception e) {
            Object[] objArr = c6206iD0.h;
            if (objArr != null) {
                Object obj2 = objArr[0];
                if (obj2 instanceof C7849n00) {
                    throw A10.e((C7849n00) obj2, e);
                }
            }
            throw e;
        }
    }

    public Object i(C6206iD0 c6206iD0, Object obj) {
        if (c6206iD0.g != -1048037474) {
            return null;
        }
        ((WZ) this).x.d((UC0) obj);
        return null;
    }

    public final boolean R(C7849n00 c7849n00, WZ wz, C7849n00 c7849n002, WZ wz2) {
        if (s()) {
            return S(wz, wz2);
        }
        return true;
    }

    public static C6206iD0 u(Class cls, String str, C7849n00 c7849n00, int i2, Object[] objArr) {
        WZ wz;
        if (c7849n00 == null || (wz = c7849n00.f) == null) {
            E10.a(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
            return C8225o52.i;
        }
        if (cls != wz.getClass()) {
            E10.a(2, AbstractC4809e90.a("ComponentLifecycle:WrongContextForEventHandler:", c7849n00.f.c0()), String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a ComponentContext from its Component.", str, c7849n00.f.c0()));
        }
        C6206iD0 j = c7849n00.j(i2, objArr);
        ComponentTree componentTree = c7849n00.l;
        if (componentTree != null) {
            WZ wz2 = c7849n00.f;
            AtomicInteger atomicInteger = WZ.B;
            wz2.getClass();
            componentTree.b0.c(wz2.n, j);
        }
        return j;
    }

    public void d(C7849n00 c7849n00, Object obj) {
        c7849n00.e = "bind";
        try {
            try {
                x(c7849n00, obj);
            } catch (Exception e) {
                try {
                    UC0 uc0 = new UC0();
                    uc0.a = e;
                    A10.b(c7849n00, uc0);
                } catch (Exception e2) {
                    throw A10.e(c7849n00, e2);
                }
            }
        } finally {
            c7849n00.e = null;
        }
    }

    public void t(C7849n00 c7849n00, Object obj) {
        c7849n00.e = "mount";
        try {
            try {
                H(c7849n00, obj);
            } catch (Exception e) {
                try {
                    UC0 uc0 = new UC0();
                    uc0.a = e;
                    A10.b(c7849n00, uc0);
                } catch (Exception e2) {
                    throw A10.e(c7849n00, e2);
                }
            }
        } finally {
            c7849n00.e = null;
        }
    }

    public WZ z(C7849n00 c7849n00) {
        return C4929eX.w0(c7849n00).i;
    }

    public C4929eX A(C7849n00 c7849n00, int i2) {
        return C4929eX.w0(c7849n00).i;
    }

    public Object B(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    public InterfaceC9750sZ1 C() {
        return new C3631ak0(N());
    }

    public void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i2, int i3, C8753pe3 c8753pe3) {
        throw new IllegalStateException("You must override onMeasure() if you return true in canMeasure(), ComponentLifecycle is: ".concat(String.valueOf(this)));
    }

    public static PD0 v(C7849n00 c7849n00, String str, int i2) {
        return new PD0(c7849n00.f == null ? "" : c7849n00.c(), i2, str);
    }

    public InterfaceC3331Zq1 P(C7849n00 c7849n00) {
        return AbstractC3106Xx1.b(c7849n00, (WZ) this, false, false);
    }

    public boolean S(WZ wz, WZ wz2) {
        boolean d;
        AbstractC6726jk3 abstractC6726jk3 = wz == null ? null : wz.z;
        AbstractC6726jk3 abstractC6726jk32 = wz2.z;
        if (!wz.a(wz2)) {
            return true;
        }
        if (abstractC6726jk3 == null && abstractC6726jk32 == null) {
            d = true;
        } else {
            d = ((abstractC6726jk3 != null || abstractC6726jk32 == null) && (abstractC6726jk3 == null || abstractC6726jk32 != null)) ? A10.d(abstractC6726jk3, abstractC6726jk32) : false;
        }
        return !d;
    }
}
