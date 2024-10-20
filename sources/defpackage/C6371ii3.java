package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ii3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6371ii3 extends M74 implements C52 {
    public final C5684gi3 e;
    public long f = Long.MIN_VALUE;

    public C6371ii3(C6028hi3 c6028hi3) {
        C5684gi3 c5684gi3 = new C5684gi3();
        this.e = c5684gi3;
        if (c6028hi3 != null) {
            c5684gi3.a = c6028hi3;
        }
    }

    @Override // defpackage.M74
    public final float b(long j) {
        double d;
        C5340fi3 c5340fi3;
        C5340fi3 c5340fi32;
        C5340fi3 c5340fi33;
        boolean z;
        C6371ii3 c6371ii3 = this;
        long j2 = j;
        long j3 = c6371ii3.f;
        C5684gi3 c5684gi3 = c6371ii3.e;
        if (j3 == Long.MIN_VALUE) {
            c6371ii3.f = j2;
            float f = c6371ii3.c("initial").c;
            float f2 = c6371ii3.c("end").c;
            c5684gi3.getClass();
            C5340fi3 c5340fi34 = c5684gi3.b;
            c5340fi34.a = f;
            Iterator it = c5684gi3.h.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            double d2 = c5340fi34.a;
            c5684gi3.e = d2;
            c5684gi3.d.a = d2;
            c5340fi34.b = 0.0d;
            c5684gi3.b(f2);
            return f;
        }
        float f3 = c6371ii3.c("end").c;
        c5684gi3.b(f3);
        if (a()) {
            return f3;
        }
        double d3 = (j2 - c6371ii3.f) / 1.0E9d;
        boolean a = c5684gi3.a();
        C5340fi3 c5340fi35 = c5684gi3.b;
        if (a && c5684gi3.f) {
            c5340fi33 = c5340fi35;
        } else {
            if (d3 > 0.064d) {
                d3 = 0.064d;
            }
            c5684gi3.g += d3;
            C6028hi3 c6028hi3 = c5684gi3.a;
            double d4 = c6028hi3.b;
            double d5 = c5340fi35.a;
            double d6 = c5340fi35.b;
            C5340fi3 c5340fi36 = c5684gi3.d;
            double d7 = c5340fi36.a;
            double d8 = d6;
            double d9 = d5;
            double d10 = c5340fi36.b;
            double d11 = d7;
            while (true) {
                d = c5684gi3.g;
                c5340fi3 = c5340fi35;
                c5340fi32 = c5684gi3.c;
                if (d < 0.001d) {
                    break;
                }
                double d12 = d - 0.001d;
                c5684gi3.g = d12;
                if (d12 < 0.001d) {
                    c5340fi32.a = d9;
                    c5340fi32.b = d8;
                }
                double d13 = c5684gi3.e;
                double d14 = c6028hi3.a;
                double d15 = ((d13 - d11) * d4) - (d14 * d8);
                double d16 = (d15 * 0.001d * 0.5d) + d8;
                double d17 = ((d13 - (((d8 * 0.001d) * 0.5d) + d9)) * d4) - (d14 * d16);
                double d18 = (d17 * 0.001d * 0.5d) + d8;
                double d19 = ((d13 - (((d16 * 0.001d) * 0.5d) + d9)) * d4) - (d14 * d18);
                double d20 = (d18 * 0.001d) + d9;
                double d21 = (d19 * 0.001d) + d8;
                d9 = ((((d16 + d18) * 2.0d) + d8 + d21) * 0.16666666666666666d * 0.001d) + d9;
                d8 = ((((d17 + d19) * 2.0d) + d15 + (((d13 - d20) * d4) - (d14 * d21))) * 0.16666666666666666d * 0.001d) + d8;
                c5340fi35 = c5340fi3;
                d11 = d20;
                d10 = d21;
            }
            c5340fi36.a = d11;
            c5340fi36.b = d10;
            c5340fi33 = c5340fi3;
            c5340fi33.a = d9;
            c5340fi33.b = d8;
            if (d > 0.0d) {
                double d22 = d / 0.001d;
                double d23 = 1.0d - d22;
                c5340fi33.a = (c5340fi32.a * d23) + (d9 * d22);
                c5340fi33.b = (c5340fi32.b * d23) + (d8 * d22);
            }
            if (c5684gi3.a()) {
                if (d4 > 0.0d) {
                    c5340fi33.a = c5684gi3.e;
                } else {
                    c5684gi3.e = c5340fi33.a;
                }
                if (0.0d != c5340fi33.b) {
                    c5340fi33.b = 0.0d;
                }
                z = true;
            } else {
                z = a;
            }
            boolean z2 = false;
            if (c5684gi3.f) {
                c5684gi3.f = false;
                z2 = true;
            }
            if (z) {
                c5684gi3.f = true;
            }
            Iterator it2 = c5684gi3.h.iterator();
            if (it2.hasNext()) {
                X5.a(it2.next());
                if (z2) {
                    throw null;
                }
                throw null;
            }
            c6371ii3 = this;
            j2 = j;
        }
        c6371ii3.f = j2;
        return (float) c5340fi33.a;
    }

    @Override // defpackage.C52
    public final boolean a() {
        return this.e.a();
    }
}
