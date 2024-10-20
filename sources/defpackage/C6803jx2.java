package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jx2 */
/* loaded from: classes.dex */
public final class C6803jx2 implements InterfaceC2147Qn2, InterfaceC9536rv, InterfaceC9532ru1 {
    public final String b;
    public final JJ1 c;
    public final int d;
    public final boolean e;
    public final C4552dQ0 f;
    public final AbstractC11251wv g;
    public final C4552dQ0 h;
    public final C4552dQ0 i;
    public final C4552dQ0 j;
    public final C4552dQ0 k;
    public final C4552dQ0 l;
    public boolean n;
    public final Path a = new Path();
    public final H20 m = new H20();

    public C6803jx2(JJ1 jj1, AbstractC11937yv abstractC11937yv, C7491lx2 c7491lx2) {
        this.c = jj1;
        this.b = c7491lx2.a;
        int i = c7491lx2.b;
        this.d = i;
        this.e = c7491lx2.j;
        AbstractC11251wv a = c7491lx2.c.a();
        this.f = (C4552dQ0) a;
        AbstractC11251wv a2 = c7491lx2.d.a();
        this.g = a2;
        AbstractC11251wv a3 = c7491lx2.e.a();
        this.h = (C4552dQ0) a3;
        AbstractC11251wv a4 = c7491lx2.g.a();
        this.j = (C4552dQ0) a4;
        AbstractC11251wv a5 = c7491lx2.i.a();
        this.l = (C4552dQ0) a5;
        if (i == 1) {
            this.i = (C4552dQ0) c7491lx2.f.a();
            this.k = (C4552dQ0) c7491lx2.h.a();
        } else {
            this.i = null;
            this.k = null;
        }
        abstractC11937yv.e(a);
        abstractC11937yv.e(a2);
        abstractC11937yv.e(a3);
        abstractC11937yv.e(a4);
        abstractC11937yv.e(a5);
        if (i == 1) {
            abstractC11937yv.e(this.i);
            abstractC11937yv.e(this.k);
        }
        a.a(this);
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        if (i == 1) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        this.n = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.Z40
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            Z40 z40 = (Z40) arrayList.get(i);
            if (z40 instanceof C6651jX3) {
                C6651jX3 c6651jX3 = (C6651jX3) z40;
                if (c6651jX3.c == 1) {
                    this.m.a.add(c6651jX3);
                    c6651jX3.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC2147Qn2
    public final Path h() {
        float f;
        float cos;
        float f2;
        double d;
        float f3;
        C6803jx2 c6803jx2;
        Path path;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        Path path2;
        float f9;
        float f10;
        float f11;
        int i;
        AbstractC11251wv abstractC11251wv;
        double d2;
        double d3;
        float f12;
        double d4;
        boolean z = this.n;
        Path path3 = this.a;
        if (z) {
            return path3;
        }
        path3.reset();
        if (this.e) {
            this.n = true;
            return path3;
        }
        int b = AbstractC2373Sg3.b(this.d);
        AbstractC11251wv abstractC11251wv2 = this.g;
        C4552dQ0 c4552dQ0 = this.l;
        C4552dQ0 c4552dQ02 = this.j;
        C4552dQ0 c4552dQ03 = this.h;
        C4552dQ0 c4552dQ04 = this.f;
        if (b != 0) {
            if (b != 1) {
                c6803jx2 = this;
            } else {
                int floor = (int) Math.floor(((Float) c4552dQ04.f()).floatValue());
                double radians = Math.toRadians((c4552dQ03 != null ? ((Float) c4552dQ03.f()).floatValue() : 0.0d) - 90.0d);
                double d5 = floor;
                float floatValue = ((Float) c4552dQ0.f()).floatValue() / 100.0f;
                float floatValue2 = ((Float) c4552dQ02.f()).floatValue();
                double d6 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d6);
                float sin = (float) (Math.sin(radians) * d6);
                path3.moveTo(cos2, sin);
                double d7 = (float) (6.283185307179586d / d5);
                double d8 = radians + d7;
                double ceil = Math.ceil(d5);
                int i2 = 0;
                double d9 = d7;
                while (i2 < ceil) {
                    float cos3 = (float) (Math.cos(d8) * d6);
                    float sin2 = (float) (Math.sin(d8) * d6);
                    if (floatValue != 0.0f) {
                        double d10 = d6;
                        i = i2;
                        double atan2 = (float) (Math.atan2(sin, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        abstractC11251wv = abstractC11251wv2;
                        d2 = d8;
                        double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                        float f13 = floatValue2 * floatValue * 0.25f;
                        d3 = d9;
                        f12 = sin2;
                        d4 = d10;
                        path3.cubicTo(cos2 - (cos4 * f13), sin - (sin3 * f13), (((float) Math.cos(atan22)) * f13) + cos3, (f13 * ((float) Math.sin(atan22))) + sin2, cos3, f12);
                    } else {
                        i = i2;
                        abstractC11251wv = abstractC11251wv2;
                        d2 = d8;
                        d3 = d9;
                        f12 = sin2;
                        d4 = d6;
                        path3.lineTo(cos3, f12);
                    }
                    double d11 = d2 + d3;
                    sin = f12;
                    d6 = d4;
                    d9 = d3;
                    abstractC11251wv2 = abstractC11251wv;
                    d8 = d11;
                    cos2 = cos3;
                    i2 = i + 1;
                }
                PointF pointF = (PointF) abstractC11251wv2.f();
                path3.offset(pointF.x, pointF.y);
                path3.close();
                c6803jx2 = this;
            }
            path = path3;
        } else {
            AbstractC11251wv abstractC11251wv3 = abstractC11251wv2;
            float floatValue3 = ((Float) c4552dQ04.f()).floatValue();
            double radians2 = Math.toRadians((c4552dQ03 != null ? ((Float) c4552dQ03.f()).floatValue() : 0.0d) - 90.0d);
            double d12 = floatValue3;
            float f14 = (float) (6.283185307179586d / d12);
            float f15 = f14 / 2.0f;
            float f16 = floatValue3 - ((int) floatValue3);
            if (f16 != 0.0f) {
                radians2 += (1.0f - f16) * f15;
            }
            float floatValue4 = ((Float) c4552dQ02.f()).floatValue();
            float floatValue5 = ((Float) this.i.f()).floatValue();
            C4552dQ0 c4552dQ05 = this.k;
            float floatValue6 = c4552dQ05 != null ? ((Float) c4552dQ05.f()).floatValue() / 100.0f : 0.0f;
            float floatValue7 = c4552dQ0 != null ? ((Float) c4552dQ0.f()).floatValue() / 100.0f : 0.0f;
            if (f16 != 0.0f) {
                float a = AbstractC2277Rn2.a(floatValue4, floatValue5, f16, floatValue5);
                double d13 = a;
                f = floatValue5;
                cos = (float) (Math.cos(radians2) * d13);
                float sin4 = (float) (d13 * Math.sin(radians2));
                path3.moveTo(cos, sin4);
                f2 = sin4;
                d = radians2 + ((f14 * f16) / 2.0f);
                f3 = a;
            } else {
                f = floatValue5;
                double d14 = floatValue4;
                cos = (float) (Math.cos(radians2) * d14);
                float sin5 = (float) (d14 * Math.sin(radians2));
                path3.moveTo(cos, sin5);
                f2 = sin5;
                d = radians2 + f15;
                f3 = 0.0f;
            }
            double ceil2 = Math.ceil(d12) * 2.0d;
            int i3 = 0;
            double d15 = d;
            boolean z2 = false;
            while (true) {
                double d16 = i3;
                if (d16 >= ceil2) {
                    break;
                }
                float f17 = z2 ? floatValue4 : f;
                if (f3 == 0.0f || d16 != ceil2 - 2.0d) {
                    f4 = f3;
                    f5 = f15;
                } else {
                    f4 = f3;
                    f5 = (f14 * f16) / 2.0f;
                }
                if (f3 == 0.0f || d16 != ceil2 - 1.0d) {
                    f6 = f14;
                    f7 = f15;
                } else {
                    f6 = f14;
                    f7 = f15;
                    f17 = f4;
                }
                double d17 = f17;
                AbstractC11251wv abstractC11251wv4 = abstractC11251wv3;
                float cos5 = (float) (Math.cos(d15) * d17);
                float sin6 = (float) (d17 * Math.sin(d15));
                if (floatValue6 == 0.0f && floatValue7 == 0.0f) {
                    path3.lineTo(cos5, sin6);
                    path2 = path3;
                    f11 = f5;
                    f8 = sin6;
                    f9 = f;
                    f10 = floatValue4;
                } else {
                    float f18 = floatValue4;
                    float f19 = f2;
                    double atan23 = (float) (Math.atan2(f2, cos) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    float f20 = f5;
                    f8 = sin6;
                    path2 = path3;
                    double atan24 = (float) (Math.atan2(sin6, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin8 = (float) Math.sin(atan24);
                    float f21 = z2 ? floatValue6 : floatValue7;
                    float f22 = z2 ? floatValue7 : floatValue6;
                    float f23 = (z2 ? f : f18) * f21 * 0.47829f;
                    float f24 = cos6 * f23;
                    float f25 = f23 * sin7;
                    float f26 = (z2 ? f18 : f) * f22 * 0.47829f;
                    float f27 = cos7 * f26;
                    float f28 = f26 * sin8;
                    if (f16 != 0.0f) {
                        if (i3 == 0) {
                            f24 *= f16;
                            f25 *= f16;
                        } else if (d16 == ceil2 - 1.0d) {
                            f27 *= f16;
                            f28 *= f16;
                        }
                    }
                    f9 = f;
                    f10 = f18;
                    path2.cubicTo(cos - f24, f19 - f25, cos5 + f27, f8 + f28, cos5, f8);
                    f11 = f20;
                }
                d15 += f11;
                z2 = !z2;
                i3++;
                cos = cos5;
                f = f9;
                floatValue4 = f10;
                f3 = f4;
                f14 = f6;
                f15 = f7;
                abstractC11251wv3 = abstractC11251wv4;
                f2 = f8;
                path3 = path2;
            }
            c6803jx2 = this;
            PointF pointF2 = (PointF) abstractC11251wv3.f();
            path = path3;
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        c6803jx2.m.a(path);
        c6803jx2.n = true;
        return path;
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void c(C8847pu1 c8847pu1, int i, ArrayList arrayList, C8847pu1 c8847pu12) {
        CX1.d(c8847pu1, i, arrayList, c8847pu12, this);
    }

    @Override // defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        C4552dQ0 c4552dQ0;
        C4552dQ0 c4552dQ02;
        if (obj == NJ1.u) {
            this.f.k(tj1);
            return;
        }
        if (obj == NJ1.v) {
            this.h.k(tj1);
            return;
        }
        if (obj == NJ1.l) {
            this.g.k(tj1);
            return;
        }
        if (obj == NJ1.w && (c4552dQ02 = this.i) != null) {
            c4552dQ02.k(tj1);
            return;
        }
        if (obj == NJ1.x) {
            this.j.k(tj1);
            return;
        }
        if (obj == NJ1.y && (c4552dQ0 = this.k) != null) {
            c4552dQ0.k(tj1);
        } else if (obj == NJ1.z) {
            this.l.k(tj1);
        }
    }
}
