package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.view.Display;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Op0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1895Op0 {
    public static final InterfaceC1765Np0[] m = new InterfaceC1765Np0[0];
    public final int b;
    public float d;
    public int e;
    public int f;
    public int g;
    public float h;
    public Display.Mode i;
    public List j;
    public boolean k;
    public boolean l;
    public final WeakHashMap a = new WeakHashMap();
    public Point c = new Point();

    public float a() {
        return 1.0f;
    }

    public static AbstractC1895Op0 b(Context context) {
        Display a = DisplayAndroidManager.a(context);
        DisplayAndroidManager b = DisplayAndroidManager.b();
        b.getClass();
        int displayId = a.getDisplayId();
        SparseArray sparseArray = b.c;
        AbstractC1895Op0 abstractC1895Op0 = (AbstractC1895Op0) sparseArray.get(displayId);
        if (abstractC1895Op0 != null) {
            return abstractC1895Op0;
        }
        int displayId2 = a.getDisplayId();
        C5067eu2 c5067eu2 = new C5067eu2(a);
        sparseArray.put(displayId2, c5067eu2);
        c5067eu2.g(a);
        return c5067eu2;
    }

    public AbstractC1895Op0(int i) {
        this.b = i;
    }

    public final InterfaceC1765Np0[] c() {
        return (InterfaceC1765Np0[]) this.a.keySet().toArray(m);
    }

    public final void d(Point point, Float f, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Float f2, Display.Mode mode, List list) {
        List list2;
        boolean z = true;
        boolean z2 = (point == null || this.c.equals(point)) ? false : true;
        boolean z3 = (f == null || this.d == f.floatValue()) ? false : true;
        boolean z4 = (num == null || this.e == num.intValue()) ? false : true;
        boolean z5 = (num2 == null || this.f == num2.intValue()) ? false : true;
        boolean z6 = (num3 == null || this.g == num3.intValue()) ? false : true;
        boolean z7 = (bool == null || this.k == bool.booleanValue()) ? false : true;
        boolean z8 = (bool2 == null || this.l == bool2.booleanValue()) ? false : true;
        boolean z9 = (f2 == null || this.h == f2.floatValue()) ? false : true;
        boolean z10 = list != null && ((list2 = this.j) == null || list2.equals(list));
        boolean z11 = (mode == null || mode.equals(this.i)) ? false : true;
        if (!z2 && !z3 && !z4 && !z5 && !z6 && !z7 && !z8 && !z9 && !z10 && !z11) {
            z = false;
        }
        if (z) {
            if (z2) {
                this.c = point;
            }
            if (z3) {
                this.d = f.floatValue();
            }
            if (z4) {
                this.e = num.intValue();
            }
            if (z5) {
                this.f = num2.intValue();
            }
            if (z6) {
                this.g = num3.intValue();
            }
            if (z7) {
                this.k = bool.booleanValue();
            }
            if (z8) {
                this.l = bool2.booleanValue();
            }
            if (z9) {
                this.h = f2.floatValue();
            }
            if (z10) {
                this.j = list;
            }
            if (z11) {
                this.i = mode;
            }
            DisplayAndroidManager.b().c(this);
            if (z6) {
                for (InterfaceC1765Np0 interfaceC1765Np0 : c()) {
                    interfaceC1765Np0.m(this.g);
                }
            }
            if (z3) {
                for (InterfaceC1765Np0 interfaceC1765Np02 : c()) {
                    interfaceC1765Np02.l(this.d);
                }
            }
            if (z9) {
                for (InterfaceC1765Np0 interfaceC1765Np03 : c()) {
                    interfaceC1765Np03.p(this.h);
                }
            }
            if (z10) {
                for (InterfaceC1765Np0 interfaceC1765Np04 : c()) {
                    interfaceC1765Np04.n();
                }
            }
            if (z11) {
                for (InterfaceC1765Np0 interfaceC1765Np05 : c()) {
                    interfaceC1765Np05.c();
                }
            }
        }
    }
}
