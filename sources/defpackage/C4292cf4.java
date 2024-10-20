package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cf4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4292cf4 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public final InterfaceC4058by1 h;
    public final C3949bf4 i = new C3949bf4(this);
    public final ArrayList g = new ArrayList(2);

    public C4292cf4(int i, int i2, InterfaceC4058by1 interfaceC4058by1) {
        this.a = i;
        this.b = i2;
        this.c = interfaceC4058by1.l();
        this.d = interfaceC4058by1.m();
        this.e = interfaceC4058by1.a();
        this.h = interfaceC4058by1;
    }

    public final void b(int i) {
        int g = this.h.g();
        int s = this.h.s();
        int l = this.h.l();
        int m = this.h.m();
        int a = this.h.a();
        if (g < 0 || s < 0) {
            return;
        }
        if (g == this.a && s == this.b && l == this.c && m == this.d && a == this.e && i != 1) {
            return;
        }
        this.a = g;
        this.b = s;
        this.c = l;
        this.d = m;
        this.e = a;
        this.f = false;
        synchronized (this) {
            if (this.g.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.g);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Ze4) arrayList.get(i2)).a(g, s, l, m, i);
            }
        }
    }

    public final void c(boolean z) {
        this.f = this.f || z;
    }

    public final boolean a(int i, int i2) {
        return d() || i2 == -1 || i <= Math.max((this.a + i2) - 1, this.b);
    }

    public final boolean d() {
        return this.a < 0 || this.b < 0 || this.f;
    }
}
