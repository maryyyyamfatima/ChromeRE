package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zY */
/* loaded from: classes.dex */
public final class C12144zY implements InterfaceC0382Cy1, InterfaceC6871k90, SC0 {
    public EnumC12267zs4 A;
    public C2575Tv0 B;
    public C2575Tv0 C;
    public C2575Tv0 D;
    public ArrayList E;
    public C2575Tv0 F;
    public C2575Tv0 G;
    public C2575Tv0 H;
    public boolean I;

    /* renamed from: J */
    public boolean f11553J;
    public int a;
    public int g;
    public float h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public float s;
    public float t;
    public float u;
    public int v;
    public float w;
    public float x;
    public EnumC9866ss4 y;
    public EnumC8151ns4 z;

    @Override // defpackage.SC0
    public final boolean a(Object obj) {
        C12144zY c12144zY = (C12144zY) obj;
        return this == c12144zY || (c12144zY != null && this.a == c12144zY.a && this.g == c12144zY.g && Float.compare(c12144zY.h, this.h) == 0 && this.i == c12144zY.i && Float.compare(c12144zY.j, this.j) == 0 && this.k == c12144zY.k && Float.compare(c12144zY.l, this.l) == 0 && this.m == c12144zY.m && Float.compare(c12144zY.n, this.n) == 0 && this.o == c12144zY.o && Float.compare(c12144zY.p, this.p) == 0 && this.q == c12144zY.q && Float.compare(c12144zY.r, this.r) == 0 && Float.compare(c12144zY.s, this.s) == 0 && Float.compare(c12144zY.t, this.t) == 0 && Float.compare(c12144zY.u, this.u) == 0 && this.v == c12144zY.v && Float.compare(c12144zY.w, this.w) == 0 && Float.compare(c12144zY.x, this.x) == 0 && this.I == c12144zY.I && this.f11553J == c12144zY.f11553J && this.y == c12144zY.y && this.z == c12144zY.z && this.A == c12144zY.A && EY.c(this.B, c12144zY.B) && EY.c(this.C, c12144zY.C) && EY.c(this.D, c12144zY.D) && EY.c(this.F, c12144zY.F) && EY.c(this.G, c12144zY.G) && EY.c(this.H, c12144zY.H) && EY.b(this.E, c12144zY.E));
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void F0(int i) {
        this.a |= 1;
        this.g = i;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void Q(float f) {
        this.a |= 2;
        this.h = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void V1(int i) {
        this.a |= 4;
        this.i = i;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void f1(int i) {
        this.a |= 16;
        this.k = i;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void i1(float f) {
        this.a |= 8;
        this.j = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void g0(float f) {
        this.a |= 32;
        this.l = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void d(int i) {
        this.a |= 64;
        this.m = i;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void A0(float f) {
        this.a |= 128;
        this.n = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void O(int i) {
        this.a |= 256;
        this.o = i;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void z0(int i) {
        this.a |= 1024;
        this.q = i;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void O1(float f) {
        this.a |= 512;
        this.p = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void J1(float f) {
        this.a |= 2048;
        this.r = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void j1(EnumC9866ss4 enumC9866ss4) {
        this.a |= 4096;
        this.y = enumC9866ss4;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void e0(EnumC8151ns4 enumC8151ns4) {
        this.a |= 8192;
        this.z = enumC8151ns4;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void u1(float f) {
        this.a |= 16384;
        this.s = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void s1(float f) {
        this.a |= 32768;
        this.t = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void y1(float f) {
        this.a |= 65536;
        this.u = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void M0(int i) {
        this.a |= 131072;
        this.v = i;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void X(float f) {
        this.a |= 262144;
        this.w = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void R(float f) {
        this.a |= 524288;
        this.x = f;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void J0(EnumC12267zs4 enumC12267zs4) {
        this.a |= 1048576;
        this.A = enumC12267zs4;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void I1(EnumC10209ts4 enumC10209ts4, int i) {
        this.a |= 2097152;
        if (this.B == null) {
            this.B = new C2575Tv0();
        }
        this.B.f(enumC10209ts4, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void S0(EnumC10209ts4 enumC10209ts4, float f) {
        this.a |= 4194304;
        if (this.H == null) {
            this.H = new C2575Tv0();
        }
        this.H.f(enumC10209ts4, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void a1(EnumC10209ts4 enumC10209ts4, int i) {
        this.a |= 8388608;
        if (this.F == null) {
            this.F = new C2575Tv0();
        }
        this.F.f(enumC10209ts4, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void c1(EnumC10209ts4 enumC10209ts4, float f) {
        this.a |= 16777216;
        if (this.G == null) {
            this.G = new C2575Tv0();
        }
        this.G.f(enumC10209ts4, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void w1(EnumC10209ts4 enumC10209ts4, int i) {
        this.a |= 33554432;
        if (this.C == null) {
            this.C = new C2575Tv0();
        }
        this.C.f(enumC10209ts4, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void y0(EnumC10209ts4 enumC10209ts4, float f) {
        this.a |= 67108864;
        if (this.D == null) {
            this.D = new C2575Tv0();
        }
        this.D.f(enumC10209ts4, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void K(EnumC10209ts4 enumC10209ts4) {
        this.a |= 134217728;
        if (this.E == null) {
            this.E = new ArrayList(2);
        }
        this.E.add(enumC10209ts4);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void L0(boolean z) {
        this.a |= 268435456;
        this.I = z;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void E1(boolean z) {
        this.a |= 536870912;
        this.f11553J = z;
    }

    @Override // defpackage.InterfaceC6871k90
    public final void U(InterfaceC3331Zq1 interfaceC3331Zq1) {
        if ((this.a & 1) != 0) {
            interfaceC3331Zq1.F0(this.g);
        }
        if ((this.a & 2) != 0) {
            interfaceC3331Zq1.Q(this.h);
        }
        if ((this.a & 4) != 0) {
            interfaceC3331Zq1.V1(this.i);
        }
        if ((this.a & 8) != 0) {
            interfaceC3331Zq1.i1(this.j);
        }
        if ((this.a & 16) != 0) {
            interfaceC3331Zq1.f1(this.k);
        }
        if ((this.a & 32) != 0) {
            interfaceC3331Zq1.g0(this.l);
        }
        if ((this.a & 64) != 0) {
            interfaceC3331Zq1.d(this.m);
        }
        if ((this.a & 128) != 0) {
            interfaceC3331Zq1.A0(this.n);
        }
        if ((this.a & 256) != 0) {
            interfaceC3331Zq1.O(this.o);
        }
        if ((this.a & 512) != 0) {
            interfaceC3331Zq1.O1(this.p);
        }
        if ((this.a & 1024) != 0) {
            interfaceC3331Zq1.z0(this.q);
        }
        if ((this.a & 2048) != 0) {
            interfaceC3331Zq1.J1(this.r);
        }
        if ((this.a & 4096) != 0) {
            interfaceC3331Zq1.j1(this.y);
        }
        if ((this.a & 8192) != 0) {
            interfaceC3331Zq1.e0(this.z);
        }
        if ((this.a & 16384) != 0) {
            interfaceC3331Zq1.u1(this.s);
        }
        if ((this.a & 32768) != 0) {
            interfaceC3331Zq1.s1(this.t);
        }
        if ((this.a & 65536) != 0) {
            interfaceC3331Zq1.y1(this.u);
        }
        if ((this.a & 131072) != 0) {
            interfaceC3331Zq1.M0(this.v);
        }
        if ((this.a & 262144) != 0) {
            interfaceC3331Zq1.X(this.w);
        }
        if ((this.a & 524288) != 0) {
            interfaceC3331Zq1.R(this.x);
        }
        if ((this.a & 1048576) != 0) {
            interfaceC3331Zq1.J0(this.A);
        }
        if ((this.a & 2097152) != 0) {
            for (int i = 0; i < C2575Tv0.i; i++) {
                float d = this.B.d(i);
                if (!AbstractC9523rs4.a(d)) {
                    interfaceC3331Zq1.I1(EnumC10209ts4.a(i), (int) d);
                }
            }
        }
        if ((this.a & 4194304) != 0) {
            for (int i2 = 0; i2 < C2575Tv0.i; i2++) {
                float d2 = this.H.d(i2);
                if (!AbstractC9523rs4.a(d2)) {
                    interfaceC3331Zq1.S0(EnumC10209ts4.a(i2), d2);
                }
            }
        }
        if ((this.a & 8388608) != 0) {
            for (int i3 = 0; i3 < C2575Tv0.i; i3++) {
                float d3 = this.F.d(i3);
                if (!AbstractC9523rs4.a(d3)) {
                    interfaceC3331Zq1.a1(EnumC10209ts4.a(i3), (int) d3);
                }
            }
        }
        if ((this.a & 16777216) != 0) {
            for (int i4 = 0; i4 < C2575Tv0.i; i4++) {
                float d4 = this.G.d(i4);
                if (!AbstractC9523rs4.a(d4)) {
                    interfaceC3331Zq1.c1(EnumC10209ts4.a(i4), d4);
                }
            }
        }
        if ((this.a & 33554432) != 0) {
            for (int i5 = 0; i5 < C2575Tv0.i; i5++) {
                float d5 = this.C.d(i5);
                if (!AbstractC9523rs4.a(d5)) {
                    interfaceC3331Zq1.w1(EnumC10209ts4.a(i5), (int) d5);
                }
            }
        }
        if ((this.a & 67108864) != 0) {
            for (int i6 = 0; i6 < C2575Tv0.i; i6++) {
                float d6 = this.D.d(i6);
                if (!AbstractC9523rs4.a(d6)) {
                    interfaceC3331Zq1.y0(EnumC10209ts4.a(i6), d6);
                }
            }
        }
        if ((this.a & 134217728) != 0) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                interfaceC3331Zq1.K((EnumC10209ts4) it.next());
            }
        }
        if ((this.a & 268435456) != 0) {
            interfaceC3331Zq1.L0(this.I);
        }
        if ((this.a & 536870912) != 0) {
            interfaceC3331Zq1.E1(this.f11553J);
        }
    }
}
