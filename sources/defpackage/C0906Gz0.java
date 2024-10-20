package defpackage;

import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906Gz0 {
    public int a = 1;
    public final UW1 b;
    public UW1 c;
    public UW1 d;
    public int e;
    public int f;

    public C0906Gz0(UW1 uw1) {
        this.b = uw1;
        this.c = uw1;
    }

    public final int a(int i) {
        SparseArray sparseArray = this.c.a;
        UW1 uw1 = sparseArray == null ? null : (UW1) sparseArray.get(i);
        int i2 = 1;
        if (this.a == 2) {
            if (uw1 != null) {
                this.c = uw1;
                this.f++;
            } else {
                if (i == 65038) {
                    b();
                } else {
                    if (!(i == 65039)) {
                        UW1 uw12 = this.c;
                        if (uw12.b != null) {
                            if (this.f == 1) {
                                if (c()) {
                                    this.d = this.c;
                                    b();
                                } else {
                                    b();
                                }
                            } else {
                                this.d = uw12;
                                b();
                            }
                            i2 = 3;
                        } else {
                            b();
                        }
                    }
                }
            }
            i2 = 2;
        } else if (uw1 == null) {
            b();
        } else {
            this.a = 2;
            this.c = uw1;
            this.f = 1;
            i2 = 2;
        }
        this.e = i;
        return i2;
    }

    public final void b() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean c() {
        FW1 c = this.c.b.c();
        int a = c.a(6);
        if ((a == 0 || c.b.get(a + c.a) == 0) ? false : true) {
            return true;
        }
        return this.e == 65039;
    }
}
