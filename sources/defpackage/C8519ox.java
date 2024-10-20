package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ox, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8519ox implements OD1 {
    public final OD1 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public C8519ox(OD1 od1) {
        this.a = od1;
    }

    public final void e() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        OD1 od1 = this.a;
        if (i == 1) {
            od1.c(this.c, this.d);
        } else if (i == 2) {
            od1.d(this.c, this.d);
        } else if (i == 3) {
            od1.a(this.e, this.c, this.d);
        }
        this.e = null;
        this.b = 0;
    }

    @Override // defpackage.OD1
    public final void c(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.OD1
    public final void d(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    @Override // defpackage.OD1
    public final void b(int i, int i2) {
        e();
        this.a.b(i, i2);
    }

    @Override // defpackage.OD1
    public final void a(Object obj, int i, int i2) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.e == obj) {
                this.c = Math.min(i, i4);
                this.d = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }
}
