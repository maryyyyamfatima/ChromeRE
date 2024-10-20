package defpackage;

import android.graphics.Rect;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xh0 */
/* loaded from: classes.dex */
public final class C3025Xh0 {
    public static final HashMap c = new HashMap();
    public InterfaceC3331Zq1 a;
    public int b;

    public static synchronized C3025Xh0 f(InterfaceC3331Zq1 interfaceC3331Zq1, int i) {
        synchronized (C3025Xh0.class) {
            C3025Xh0 c3025Xh0 = new C3025Xh0();
            C7849n00 context = interfaceC3331Zq1.getContext();
            if (i >= interfaceC3331Zq1.V0().size()) {
                return null;
            }
            WZ wz = (WZ) interfaceC3331Zq1.V0().get(i);
            if (interfaceC3331Zq1.d0() != null) {
            }
            a(context, A10.c(wz));
            c3025Xh0.a = interfaceC3331Zq1;
            c3025Xh0.b = i;
            interfaceC3331Zq1.Y(c3025Xh0);
            return c3025Xh0;
        }
    }

    public final C11703yE1 g() {
        C7849n00 context = this.a.getContext();
        ComponentTree componentTree = context == null ? null : context.l;
        if (componentTree == null) {
            return null;
        }
        return componentTree.getLithoView();
    }

    public final List c() {
        int i = this.b;
        if (!(i == 0)) {
            C3025Xh0 f = f(this.a, i - 1);
            if (f != null) {
                return Collections.singletonList(f);
            }
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int L = this.a.L();
        for (int i2 = 0; i2 < L; i2++) {
            C3025Xh0 f2 = f(this.a.a(i2), Math.max(0, r4.V0().size() - 1));
            if (f2 != null) {
                arrayList.add(f2);
            }
        }
        InterfaceC3331Zq1 g = this.a.g();
        if (g != null && g.isInitialized()) {
            int L2 = g.L();
            for (int i3 = 0; i3 < L2; i3++) {
                C3025Xh0 f3 = f(g.a(i3), Math.max(0, r5.V0().size() - 1));
                if (f3 != null) {
                    arrayList.add(f3);
                }
            }
        }
        return arrayList;
    }

    public final String e() {
        BY by = ((WZ) this.a.V0().get(this.b)).t;
        if (by == null || (by.a & 2) == 0) {
            return null;
        }
        return by.k;
    }

    public final WZ d() {
        return (WZ) this.a.V0().get(this.b);
    }

    public static String a(C7849n00 c7849n00, String str) {
        return System.identityHashCode(c7849n00.l) + str;
    }

    public static int i(InterfaceC3331Zq1 interfaceC3331Zq1) {
        if (interfaceC3331Zq1 == null) {
            return 0;
        }
        int B1 = interfaceC3331Zq1.B1();
        InterfaceC3331Zq1 parent = interfaceC3331Zq1.getParent();
        if (parent == null) {
            parent = interfaceC3331Zq1.k();
        }
        return i(parent) + B1;
    }

    public static int j(InterfaceC3331Zq1 interfaceC3331Zq1) {
        if (interfaceC3331Zq1 == null) {
            return 0;
        }
        int X1 = interfaceC3331Zq1.X1();
        InterfaceC3331Zq1 parent = interfaceC3331Zq1.getParent();
        if (parent == null) {
            parent = interfaceC3331Zq1.k();
        }
        return j(parent) + X1;
    }

    public final Rect b() {
        if (this.b == 0 && this.a.getParent() == null) {
            return new Rect(0, 0, this.a.getWidth(), this.a.getHeight());
        }
        int i = i(this.a);
        int j = j(this.a);
        return new Rect(i, j, this.a.getWidth() + i, this.a.getHeight() + j);
    }

    public static C3025Xh0 h(ComponentTree componentTree) {
        C0772Fy1 c0772Fy1 = componentTree == null ? null : componentTree.V;
        InterfaceC3331Zq1 interfaceC3331Zq1 = c0772Fy1 == null ? null : c0772Fy1.r;
        if (interfaceC3331Zq1 == null || interfaceC3331Zq1 == C7849n00.p) {
            return null;
        }
        return f(interfaceC3331Zq1, Math.max(0, interfaceC3331Zq1.V0().size() - 1));
    }
}
