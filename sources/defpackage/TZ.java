package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TZ implements Cloneable {
    public C10730vP2 a;
    public C7849n00 g;
    public WZ h;

    public abstract WZ d();

    public abstract TZ k();

    public abstract void r(WZ wz);

    public final void m(C7849n00 c7849n00, int i, int i2, WZ wz) {
        this.a = c7849n00.h;
        this.h = wz;
        this.g = c7849n00;
        WZ wz2 = c7849n00.f;
        if (wz2 != null) {
            AtomicInteger atomicInteger = WZ.B;
            wz.m = wz2.n;
        }
        if (i != 0 || i2 != 0) {
            BY by = (BY) wz.b0();
            by.n = i;
            by.o = i2;
            wz.getClass();
            c7849n00.n = i;
            c7849n00.m = i2;
            wz.F(c7849n00);
            c7849n00.n = 0;
            c7849n00.m = 0;
        }
        this.h.y = c7849n00.a;
    }

    public final Object clone() {
        try {
            TZ tz = (TZ) super.clone();
            WZ k0 = this.h.k0();
            tz.h = k0;
            tz.r(k0);
            return tz;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public final void a(float f) {
        BY by = (BY) this.h.b0();
        C3975bk0 U1 = by.U1();
        U1.o = f;
        if (f == 1.0f) {
            U1.N &= -1048577;
        } else {
            U1.N |= 1048576;
        }
        if (f == 1.0f) {
            by.a = (byte) (by.a & (-9));
        } else {
            by.a = (byte) (by.a | 8);
        }
        k();
    }

    public void b(float f) {
        ((BY) this.h.b0()).R(f);
        k();
    }

    public final void c(Drawable drawable) {
        BY by = (BY) this.h.b0();
        by.a = (byte) (by.a | 1);
        by.j = drawable;
        k();
    }

    public final void f(C6206iD0 c6206iD0) {
        C3975bk0 U1 = ((BY) this.h.b0()).U1();
        U1.N |= 8;
        U1.s = c6206iD0;
        k();
    }

    public void g(boolean z) {
        C3975bk0 U1 = ((BY) this.h.b0()).U1();
        U1.N |= 8388608;
        U1.m = z;
        k();
    }

    public void h(String str) {
        C3975bk0 U1 = ((BY) this.h.b0()).U1();
        U1.N |= 1;
        U1.a = str;
        k();
    }

    public final TZ i(float f) {
        ((BY) this.h.b0()).y1(f);
        return k();
    }

    public final void j(boolean z) {
        C3975bk0 U1 = ((BY) this.h.b0()).U1();
        if (z) {
            U1.I = 1;
        } else {
            U1.I = 2;
        }
        k();
    }

    public final void l(int i) {
        AY e = ((BY) this.h.b0()).e();
        e.a |= 1;
        e.j = i;
        k();
    }

    public final void n(String str) {
        if (str == null) {
            WZ wz = this.g.f;
            E10.a(2, "Component:NullKeySet", "Setting a null key from " + (wz != null ? wz.c0() : "unknown component") + " which is usually a mistake! If it is not, explicitly set the String 'null'");
            str = "null";
        }
        WZ wz2 = this.h;
        wz2.p = true;
        wz2.o = str;
        k();
    }

    public final TZ o(EnumC10209ts4 enumC10209ts4, int i) {
        ((BY) this.h.b0()).w1(enumC10209ts4, i);
        return k();
    }

    public final TZ p(EnumC10209ts4 enumC10209ts4, int i) {
        ((BY) this.h.b0()).I1(enumC10209ts4, i);
        return k();
    }

    public final TZ q(EnumC12267zs4 enumC12267zs4) {
        ((BY) this.h.b0()).J0(enumC12267zs4);
        return k();
    }

    public final void s(EnumC10209ts4 enumC10209ts4, float f) {
        int a = this.a.a(f);
        AY e = ((BY) this.h.b0()).e();
        e.a |= 256;
        if (e.k == null) {
            e.k = new C2575Tv0();
        }
        e.k.f(enumC10209ts4, a);
        k();
    }

    public final void t(JV3 jv3) {
        AY e = ((BY) this.h.b0()).e();
        e.a |= 131072;
        e.n = jv3;
        k();
    }

    public final void u(String str) {
        C3975bk0 U1 = ((BY) this.h.b0()).U1();
        U1.N |= 2;
        U1.g = str;
        k();
    }

    public final void v(C6206iD0 c6206iD0) {
        AY e = ((BY) this.h.b0()).e();
        e.a |= 8;
        e.g = c6206iD0;
        k();
    }

    public static void e(int i, BitSet bitSet, String[] strArr) {
        if (bitSet != null) {
            if (bitSet.nextClearBit(0) < i) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    if (!bitSet.get(i2)) {
                        arrayList.add(strArr[i2]);
                    }
                }
                throw new IllegalStateException(AbstractC4809e90.a("The following props are not marked as optional and were not supplied: ", Arrays.toString(arrayList.toArray())));
            }
        }
    }
}
