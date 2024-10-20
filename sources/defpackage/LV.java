package defpackage;

import com.google.protobuf.MessageLite;
import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LV {
    public final KV a;

    public LV(KV kv) {
        Charset charset = AbstractC1507Lp1.a;
        if (kv != null) {
            this.a = kv;
            kv.a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void g(int i, float f) {
        KV kv = this.a;
        kv.getClass();
        kv.C(i, Float.floatToRawIntBits(f));
    }

    public final void c(double d, int i) {
        KV kv = this.a;
        kv.getClass();
        kv.E(i, Double.doubleToRawLongBits(d));
    }

    public final void q(int i, long j) {
        this.a.R(i, j);
    }

    public final void i(int i, int i2) {
        this.a.G(i, i2);
    }

    public final void f(int i, long j) {
        this.a.E(i, j);
    }

    public final void e(int i, int i2) {
        this.a.C(i, i2);
    }

    public final void a(int i, boolean z) {
        this.a.y(i, z);
    }

    public final void b(int i, AbstractC4147cE abstractC4147cE) {
        this.a.A(i, abstractC4147cE);
    }

    public final void p(int i, int i2) {
        this.a.P(i, i2);
    }

    public final void k(int i, QW2 qw2, Object obj) {
        this.a.I(i, (MessageLite) obj, qw2);
    }

    public final void h(int i, QW2 qw2, Object obj) {
        KV kv = this.a;
        kv.O(i, 3);
        qw2.d((MessageLite) obj, kv.a);
        kv.O(i, 4);
    }

    public final void n(int i, int i2) {
        this.a.P(i, (i2 >> 31) ^ (i2 << 1));
    }

    public final void l(int i, int i2) {
        this.a.C(i, i2);
    }

    public final void j(int i, long j) {
        this.a.R(i, j);
    }

    public final void o(int i, long j) {
        this.a.R(i, (j >> 63) ^ (j << 1));
    }

    public final void m(int i, long j) {
        this.a.E(i, j);
    }

    public final void d(int i, int i2) {
        this.a.G(i, i2);
    }
}
