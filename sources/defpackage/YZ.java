package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.litho.ComponentHost;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YZ extends AbstractC7590mF0 {
    public static final Rect r = new Rect(0, 0, 1, 1);
    public final View o;
    public C3975bk0 p;
    public final XZ q;

    @Override // defpackage.AbstractC7590mF0
    public final boolean r(int i, int i2) {
        return false;
    }

    public YZ(View view, C3975bk0 c3975bk0, boolean z, int i) {
        super(view);
        this.o = view;
        this.p = c3975bk0;
        this.q = new XZ(this);
        view.setFocusable(z);
        WeakHashMap weakHashMap = Ec4.a;
        view.setImportantForAccessibility(i);
    }

    @Override // defpackage.AbstractC7590mF0, defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        CharSequence charSequence;
        String str;
        C6206iD0 c6206iD0;
        C11122wZ1 D = D(this.o);
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 == null || (c6206iD0 = c3975bk0.D) == null) {
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            if (D != null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                WZ wz = D.d.b.j.i;
                wz.getClass();
                wz.I(view, accessibilityNodeInfoCompat);
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
            }
        } else {
            LK3.a();
            if (AbstractC4830eD0.i == null) {
                AbstractC4830eD0.i = new C4278cd2();
            }
            C4278cd2 c4278cd2 = AbstractC4830eD0.i;
            c4278cd2.a = view;
            c4278cd2.b = accessibilityNodeInfoCompat;
            c4278cd2.c = this.q;
            c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.i);
            C4278cd2 c4278cd22 = AbstractC4830eD0.i;
            c4278cd22.a = null;
            c4278cd22.b = null;
            c4278cd22.c = null;
        }
        C3975bk0 c3975bk02 = this.p;
        if (c3975bk02 != null && (str = c3975bk02.y) != null) {
            accessibilityNodeInfoCompat.m(str);
        }
        C3975bk0 c3975bk03 = this.p;
        if (c3975bk03 != null && (charSequence = c3975bk03.z) != null) {
            accessibilityNodeInfoCompat.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
            if (this.p.y == null) {
                accessibilityNodeInfoCompat.m("");
            }
        }
        C3975bk0 c3975bk04 = this.p;
        if (c3975bk04 == null || (i = c3975bk04.M) == 0) {
            return;
        }
        boolean z = i == 1;
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfoCompat.a.setHeading(z);
        } else {
            accessibilityNodeInfoCompat.k(2, z);
        }
    }

    @Override // defpackage.AbstractC7590mF0
    public final void o(ArrayList arrayList) {
        C11122wZ1 D = D(this.o);
        if (D == null) {
            return;
        }
        WZ wz = D.d.b.j.i;
        wz.getClass();
        int l = wz.l();
        for (int i = 0; i < l; i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC7590mF0
    public final void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        View view = this.o;
        C11122wZ1 D = D(view);
        Rect rect = r;
        if (D == null) {
            Log.e("ComponentAccessibility", "No accessible mount item found for view: ".concat(String.valueOf(view)));
            accessibilityNodeInfoCompat.o("");
            accessibilityNodeInfoCompat.l(rect);
            return;
        }
        Rect bounds = ((Drawable) D.a).getBounds();
        WZ wz = D.d.b.j.i;
        wz.getClass();
        accessibilityNodeInfoCompat.m(wz.getClass().getName());
        if (i >= wz.l()) {
            Log.e("ComponentAccessibility", "Received unrecognized virtual view id: " + i);
            accessibilityNodeInfoCompat.o("");
            accessibilityNodeInfoCompat.l(rect);
            return;
        }
        wz.J(accessibilityNodeInfoCompat, i, bounds.left, bounds.top);
    }

    @Override // defpackage.AbstractC7590mF0
    public final int n(float f, float f2) {
        C11122wZ1 D = D(this.o);
        if (D == null) {
            return Integer.MIN_VALUE;
        }
        WZ wz = D.d.b.j.i;
        wz.getClass();
        if (wz.l() == 0) {
            return Integer.MIN_VALUE;
        }
        Rect bounds = ((Drawable) D.a).getBounds();
        int k = wz.k(((int) f) - bounds.left, ((int) f2) - bounds.top);
        if (k >= 0) {
            return k;
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.AbstractC7590mF0
    public final void s(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription("");
    }

    @Override // defpackage.AbstractC7590mF0, defpackage.O0
    public final C8541p1 b(View view) {
        C11122wZ1 D = D(this.o);
        if (D == null) {
            return null;
        }
        WZ wz = D.d.b.j.i;
        wz.getClass();
        if (wz instanceof TG3) {
            return super.b(view);
        }
        return null;
    }

    public static C11122wZ1 D(View view) {
        if (!(view instanceof ComponentHost)) {
            return null;
        }
        ComponentHost componentHost = (ComponentHost) view;
        for (int i = 0; i < componentHost.e(); i++) {
            C11122wZ1 d = componentHost.d(i);
            if (d != null && d.d.b.j.d()) {
                return d;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC7590mF0, defpackage.O0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C6206iD0 c6206iD0;
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 != null && (c6206iD0 = c3975bk0.B) != null) {
            LK3.a();
            if (AbstractC4830eD0.h == null) {
                AbstractC4830eD0.h = new C3935bd2();
            }
            C3935bd2 c3935bd2 = AbstractC4830eD0.h;
            c3935bd2.a = view;
            c3935bd2.getClass();
            c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.h);
            AbstractC4830eD0.h.getClass();
            AbstractC4830eD0.h.getClass();
            AbstractC4830eD0.h.getClass();
            return;
        }
        super.c(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final void h(View view, int i) {
        C6206iD0 c6206iD0;
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 == null || (c6206iD0 = c3975bk0.G) == null) {
            super.h(view, i);
            return;
        }
        LK3.a();
        if (AbstractC4830eD0.m == null) {
            AbstractC4830eD0.m = new C11300x33();
        }
        C11300x33 c11300x33 = AbstractC4830eD0.m;
        c11300x33.a = view;
        c11300x33.getClass();
        c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.m);
        AbstractC4830eD0.m.getClass();
        AbstractC4830eD0.m.getClass();
        AbstractC4830eD0.m.getClass();
    }

    @Override // defpackage.O0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C6206iD0 c6206iD0;
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 == null || (c6206iD0 = c3975bk0.H) == null) {
            super.i(view, accessibilityEvent);
            return;
        }
        LK3.a();
        if (AbstractC4830eD0.n == null) {
            AbstractC4830eD0.n = new C11643y33();
        }
        C11643y33 c11643y33 = AbstractC4830eD0.n;
        c11643y33.a = view;
        c11643y33.getClass();
        c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.n);
        AbstractC4830eD0.n.getClass();
        AbstractC4830eD0.n.getClass();
        AbstractC4830eD0.n.getClass();
    }

    @Override // defpackage.O0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C6206iD0 c6206iD0;
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 != null && (c6206iD0 = c3975bk0.A) != null) {
            LK3.a();
            if (AbstractC4830eD0.g == null) {
                AbstractC4830eD0.g = new C0336Cp0();
            }
            C0336Cp0 c0336Cp0 = AbstractC4830eD0.g;
            c0336Cp0.a = view;
            c0336Cp0.getClass();
            Object c = c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.g);
            AbstractC4830eD0.g.getClass();
            AbstractC4830eD0.g.getClass();
            AbstractC4830eD0.g.getClass();
            return c != null && ((Boolean) c).booleanValue();
        }
        return super.a(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C6206iD0 c6206iD0;
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 != null && (c6206iD0 = c3975bk0.C) != null) {
            LK3.a();
            if (AbstractC4830eD0.j == null) {
                AbstractC4830eD0.j = new C5653gd2();
            }
            C5653gd2 c5653gd2 = AbstractC4830eD0.j;
            c5653gd2.a = view;
            c5653gd2.getClass();
            c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.j);
            AbstractC4830eD0.j.getClass();
            AbstractC4830eD0.j.getClass();
            AbstractC4830eD0.j.getClass();
            return;
        }
        super.e(view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C6206iD0 c6206iD0;
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 != null && (c6206iD0 = c3975bk0.E) != null) {
            LK3.a();
            if (AbstractC4830eD0.k == null) {
                AbstractC4830eD0.k = new C6341id2();
            }
            AbstractC4830eD0.k.getClass();
            C6341id2 c6341id2 = AbstractC4830eD0.k;
            c6341id2.a = view;
            c6341id2.getClass();
            Object c = c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.k);
            AbstractC4830eD0.k.getClass();
            AbstractC4830eD0.k.getClass();
            AbstractC4830eD0.k.getClass();
            AbstractC4830eD0.k.getClass();
            return c != null && ((Boolean) c).booleanValue();
        }
        return super.f(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        C6206iD0 c6206iD0;
        C3975bk0 c3975bk0 = this.p;
        if (c3975bk0 != null && (c6206iD0 = c3975bk0.F) != null) {
            LK3.a();
            if (AbstractC4830eD0.l == null) {
                AbstractC4830eD0.l = new C9515rr2();
            }
            C9515rr2 c9515rr2 = AbstractC4830eD0.l;
            c9515rr2.a = view;
            c9515rr2.getClass();
            AbstractC4830eD0.l.getClass();
            Object c = c6206iD0.a.b().c(c6206iD0, AbstractC4830eD0.l);
            AbstractC4830eD0.l.getClass();
            AbstractC4830eD0.l.getClass();
            AbstractC4830eD0.l.getClass();
            AbstractC4830eD0.l.getClass();
            return c != null && ((Boolean) c).booleanValue();
        }
        return super.g(view, i, bundle);
    }
}
