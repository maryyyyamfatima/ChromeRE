package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jY2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6655jY2 extends DK2 {
    public Xd4 a;
    public final ViewPager2 g;
    public final RecyclerView h;
    public final LinearLayoutManager i;
    public int j;
    public int k;
    public final C6313iY2 l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    public C6655jY2(ViewPager2 viewPager2) {
        this.g = viewPager2;
        C4630de4 c4630de4 = viewPager2.o;
        this.h = c4630de4;
        this.i = (LinearLayoutManager) c4630de4.s;
        this.l = new C6313iY2();
        u();
    }

    public final void u() {
        this.j = 0;
        this.k = 0;
        C6313iY2 c6313iY2 = this.l;
        c6313iY2.a = -1;
        c6313iY2.b = 0.0f;
        c6313iY2.c = 0;
        this.m = -1;
        this.n = -1;
        this.o = false;
        this.p = false;
        this.r = false;
        this.q = false;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        Xd4 xd4;
        Xd4 xd42;
        int i2 = this.j;
        boolean z = true;
        if (!(i2 == 1 && this.k == 1) && i == 1) {
            this.r = false;
            this.j = 1;
            int i3 = this.n;
            if (i3 != -1) {
                this.m = i3;
                this.n = -1;
            } else if (this.m == -1) {
                this.m = this.i.R0();
            }
            t(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.p) {
                t(2);
                this.o = true;
                return;
            }
            return;
        }
        boolean z2 = i2 == 1 || i2 == 4;
        C6313iY2 c6313iY2 = this.l;
        if (z2 && i == 0) {
            v();
            if (!this.p) {
                int i4 = c6313iY2.a;
                if (i4 != -1 && (xd42 = this.a) != null) {
                    xd42.b(0.0f, i4, 0);
                }
            } else if (c6313iY2.c == 0) {
                int i5 = this.m;
                int i6 = c6313iY2.a;
                if (i5 != i6 && (xd4 = this.a) != null) {
                    xd4.c(i6);
                }
            } else {
                z = false;
            }
            if (z) {
                t(0);
                u();
            }
        }
        if (this.j == 2 && i == 0 && this.q) {
            v();
            if (c6313iY2.c == 0) {
                int i7 = this.n;
                int i8 = c6313iY2.a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    Xd4 xd43 = this.a;
                    if (xd43 != null) {
                        xd43.c(i8);
                    }
                }
                t(0);
                u();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:            if ((r7 < 0) == (r5.g.l.D() == 1)) goto L17;     */
    @Override // defpackage.DK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.p = r6
            r5.v()
            boolean r0 = r5.o
            r1 = -1
            iY2 r2 = r5.l
            r3 = 0
            if (r0 == 0) goto L46
            r5.o = r3
            if (r8 > 0) goto L2b
            if (r8 != 0) goto L29
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.g
            Wd4 r8 = r8.l
            int r8 = r8.D()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L29
            goto L2b
        L29:
            r7 = r3
            goto L2c
        L2b:
            r7 = r6
        L2c:
            if (r7 == 0) goto L36
            int r7 = r2.c
            if (r7 == 0) goto L36
            int r7 = r2.a
            int r7 = r7 + r6
            goto L38
        L36:
            int r7 = r2.a
        L38:
            r5.n = r7
            int r8 = r5.m
            if (r8 == r7) goto L56
            Xd4 r8 = r5.a
            if (r8 == 0) goto L56
            r8.c(r7)
            goto L56
        L46:
            int r7 = r5.j
            if (r7 != 0) goto L56
            int r7 = r2.a
            if (r7 != r1) goto L4f
            r7 = r3
        L4f:
            Xd4 r8 = r5.a
            if (r8 == 0) goto L56
            r8.c(r7)
        L56:
            int r7 = r2.a
            if (r7 != r1) goto L5b
            r7 = r3
        L5b:
            float r8 = r2.b
            int r0 = r2.c
            Xd4 r4 = r5.a
            if (r4 == 0) goto L66
            r4.b(r8, r7, r0)
        L66:
            int r7 = r2.a
            int r8 = r5.n
            if (r7 == r8) goto L6e
            if (r8 != r1) goto L7c
        L6e:
            int r7 = r2.c
            if (r7 != 0) goto L7c
            int r7 = r5.k
            if (r7 == r6) goto L7c
            r5.t(r3)
            r5.u()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6655jY2.s(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011e, code lost:            if (r5[r1 - 1][1] >= r6) goto L66;     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6655jY2.v():void");
    }

    public final void t(int i) {
        if ((this.j == 3 && this.k == 0) || this.k == i) {
            return;
        }
        this.k = i;
        Xd4 xd4 = this.a;
        if (xd4 != null) {
            xd4.a(i);
        }
    }
}
