package defpackage;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3975bk0 implements SC0 {
    public C6206iD0 A;
    public C6206iD0 B;
    public C6206iD0 C;
    public C6206iD0 D;
    public C6206iD0 E;
    public C6206iD0 F;
    public C6206iD0 G;
    public C6206iD0 H;
    public int N;
    public CharSequence a;
    public Object g;
    public String h;
    public SparseArray i;
    public float j;
    public ViewOutlineProvider k;
    public boolean l;
    public C6206iD0 s;
    public C6206iD0 t;
    public C6206iD0 u;
    public C6206iD0 v;
    public C6206iD0 w;
    public C6206iD0 x;
    public String y;
    public CharSequence z;
    public boolean m = true;
    public float n = 1.0f;
    public float o = 1.0f;
    public float p = 0.0f;
    public float q = 0.0f;
    public float r = 0.0f;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f11493J = 0;
    public int K = 0;
    public int L = 0;
    public int M = 0;

    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.SC0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3975bk0.a(java.lang.Object):boolean");
    }

    public final boolean c() {
        return (this.s == null && this.u == null && this.v == null && this.w == null && this.x == null) ? false : true;
    }

    public final boolean d() {
        return (this.B == null && this.D == null && this.C == null && this.E == null && this.F == null && this.A == null && this.G == null && this.H == null && this.y == null && this.z == null) ? false : true;
    }

    public final void b(C3975bk0 c3975bk0) {
        if ((this.N & 8) != 0) {
            C6206iD0 c6206iD0 = this.s;
            c3975bk0.N |= 8;
            c3975bk0.s = c6206iD0;
        }
        if ((this.N & 16) != 0) {
            C6206iD0 c6206iD02 = this.u;
            c3975bk0.N |= 16;
            c3975bk0.u = c6206iD02;
        }
        if ((this.N & 131072) != 0) {
            C6206iD0 c6206iD03 = this.t;
            c3975bk0.N = 131072 | c3975bk0.N;
            c3975bk0.t = c6206iD03;
        }
        if ((this.N & 32) != 0) {
            C6206iD0 c6206iD04 = this.v;
            c3975bk0.N |= 32;
            c3975bk0.v = c6206iD04;
        }
        if ((this.N & 134217728) != 0) {
            C6206iD0 c6206iD05 = this.w;
            c3975bk0.N = 134217728 | c3975bk0.N;
            c3975bk0.w = c6206iD05;
        }
        if ((this.N & 262144) != 0) {
            C6206iD0 c6206iD06 = this.x;
            c3975bk0.N = 262144 | c3975bk0.N;
            c3975bk0.x = c6206iD06;
        }
        if ((this.N & 4194304) != 0) {
            String str = this.y;
            c3975bk0.N = 4194304 | c3975bk0.N;
            c3975bk0.y = str;
        }
        if ((this.N & 16777216) != 0) {
            CharSequence charSequence = this.z;
            c3975bk0.N = 16777216 | c3975bk0.N;
            c3975bk0.z = charSequence;
        }
        if ((this.N & 64) != 0) {
            C6206iD0 c6206iD07 = this.A;
            c3975bk0.N |= 64;
            c3975bk0.A = c6206iD07;
        }
        if ((this.N & 128) != 0) {
            C6206iD0 c6206iD08 = this.B;
            c3975bk0.N |= 128;
            c3975bk0.B = c6206iD08;
        }
        if ((this.N & 256) != 0) {
            C6206iD0 c6206iD09 = this.D;
            c3975bk0.N |= 256;
            c3975bk0.D = c6206iD09;
        }
        if ((this.N & 512) != 0) {
            C6206iD0 c6206iD010 = this.C;
            c3975bk0.N |= 512;
            c3975bk0.C = c6206iD010;
        }
        if ((this.N & 1024) != 0) {
            C6206iD0 c6206iD011 = this.E;
            c3975bk0.N |= 1024;
            c3975bk0.E = c6206iD011;
        }
        if ((this.N & 2048) != 0) {
            C6206iD0 c6206iD012 = this.F;
            c3975bk0.N |= 2048;
            c3975bk0.F = c6206iD012;
        }
        if ((this.N & 4096) != 0) {
            C6206iD0 c6206iD013 = this.G;
            c3975bk0.N |= 4096;
            c3975bk0.G = c6206iD013;
        }
        if ((this.N & 8192) != 0) {
            C6206iD0 c6206iD014 = this.H;
            c3975bk0.N |= 8192;
            c3975bk0.H = c6206iD014;
        }
        if ((this.N & 1) != 0) {
            CharSequence charSequence2 = this.a;
            c3975bk0.N |= 1;
            c3975bk0.a = charSequence2;
        }
        if ((this.N & 16384) != 0) {
            float f = this.j;
            c3975bk0.N |= 16384;
            c3975bk0.j = f;
        }
        if ((this.N & 32768) != 0) {
            ViewOutlineProvider viewOutlineProvider = this.k;
            c3975bk0.N = 32768 | c3975bk0.N;
            c3975bk0.k = viewOutlineProvider;
        }
        if ((this.N & 65536) != 0) {
            boolean z = this.l;
            c3975bk0.N = 65536 | c3975bk0.N;
            c3975bk0.l = z;
        }
        if ((this.N & 8388608) != 0) {
            boolean z2 = this.m;
            c3975bk0.N = 8388608 | c3975bk0.N;
            c3975bk0.m = z2;
        }
        Object obj = this.g;
        if (obj != null) {
            c3975bk0.N |= 2;
            c3975bk0.g = obj;
        }
        SparseArray sparseArray = this.i;
        if (sparseArray != null) {
            c3975bk0.N |= 4;
            c3975bk0.i = sparseArray;
        }
        String str2 = this.h;
        if (str2 != null) {
            c3975bk0.h = str2;
        }
        int i = this.I;
        if (i != 0) {
            if (i == 1) {
                c3975bk0.I = 1;
            } else {
                c3975bk0.I = 2;
            }
        }
        int i2 = this.f11493J;
        if (i2 != 0) {
            if (i2 == 1) {
                c3975bk0.f11493J = 1;
            } else {
                c3975bk0.f11493J = 2;
            }
        }
        int i3 = this.K;
        if (i3 != 0) {
            if (i3 == 1) {
                c3975bk0.K = 1;
            } else {
                c3975bk0.K = 2;
            }
        }
        int i4 = this.L;
        if (i4 != 0) {
            if (i4 == 1) {
                c3975bk0.L = 1;
            } else {
                c3975bk0.L = 2;
            }
        }
        int i5 = this.M;
        if (i5 != 0) {
            if (i5 == 1) {
                c3975bk0.M = 1;
            } else {
                c3975bk0.M = 2;
            }
        }
        if ((this.N & 524288) != 0) {
            float f2 = this.n;
            c3975bk0.n = f2;
            if (f2 == 1.0f) {
                c3975bk0.N &= -524289;
            } else {
                c3975bk0.N |= 524288;
            }
        }
        if ((this.N & 1048576) != 0) {
            float f3 = this.o;
            c3975bk0.o = f3;
            if (f3 == 1.0f) {
                c3975bk0.N &= -1048577;
            } else {
                c3975bk0.N |= 1048576;
            }
        }
        if ((this.N & 2097152) != 0) {
            float f4 = this.p;
            c3975bk0.p = f4;
            if (f4 == 0.0f) {
                c3975bk0.N &= -2097153;
            } else {
                c3975bk0.N |= 2097152;
            }
        }
        if ((this.N & 33554432) != 0) {
            c3975bk0.q = this.q;
            c3975bk0.N |= 33554432;
        }
        if ((this.N & 67108864) != 0) {
            c3975bk0.r = this.r;
            c3975bk0.N |= 67108864;
        }
    }
}
