package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QB1 {
    public AbstractC0933He2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public QB1() {
        d();
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final void a() {
        int k;
        if (this.d) {
            k = this.a.g();
        } else {
            k = this.a.k();
        }
        this.c = k;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }

    public final void c(View view, int i) {
        AbstractC0933He2 abstractC0933He2 = this.a;
        int l = Integer.MIN_VALUE == abstractC0933He2.b ? 0 : abstractC0933He2.l() - abstractC0933He2.b;
        if (l >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int g = (this.a.g() - l) - this.a.b(view);
            this.c = this.a.g() - g;
            if (g > 0) {
                int c = this.c - this.a.c(view);
                int k = this.a.k();
                int min = c - (Math.min(this.a.e(view) - k, 0) + k);
                if (min < 0) {
                    this.c = Math.min(g, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int e = this.a.e(view);
        int k2 = e - this.a.k();
        this.c = e;
        if (k2 > 0) {
            int g2 = (this.a.g() - Math.min(0, (this.a.g() - l) - this.a.b(view))) - (this.a.c(view) + e);
            if (g2 < 0) {
                this.c -= Math.min(k2, -g2);
            }
        }
    }

    public final void b(View view, int i) {
        if (this.d) {
            int b = this.a.b(view);
            AbstractC0933He2 abstractC0933He2 = this.a;
            this.c = (Integer.MIN_VALUE == abstractC0933He2.b ? 0 : abstractC0933He2.l() - abstractC0933He2.b) + b;
        } else {
            this.c = this.a.e(view);
        }
        this.b = i;
    }
}
