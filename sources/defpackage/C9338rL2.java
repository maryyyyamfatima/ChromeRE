package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9338rL2 extends AbstractC3866bQ1 implements InterfaceC7966nL2 {
    public final String f;
    public boolean g;
    public int i;
    public C7622mL2 j;
    public final /* synthetic */ ServiceConnectionC10024tL2 l;
    public int h = -1;
    public int k = -1;

    @Override // defpackage.AbstractC4896eQ1
    public final void d() {
        ServiceConnectionC10024tL2 serviceConnectionC10024tL2 = this.l;
        serviceConnectionC10024tL2.p.remove(this);
        c();
        serviceConnectionC10024tL2.m();
    }

    public C9338rL2(ServiceConnectionC10024tL2 serviceConnectionC10024tL2, String str) {
        this.l = serviceConnectionC10024tL2;
        this.f = str;
    }

    @Override // defpackage.InterfaceC7966nL2
    public final int a() {
        return this.k;
    }

    @Override // defpackage.InterfaceC7966nL2
    public final void b(C7622mL2 c7622mL2) {
        C8996qL2 c8996qL2 = new C8996qL2(this);
        this.j = c7622mL2;
        int i = c7622mL2.e;
        c7622mL2.e = i + 1;
        int i2 = c7622mL2.d;
        c7622mL2.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        c7622mL2.b(11, i2, i, null, bundle);
        c7622mL2.h.put(i2, c8996qL2);
        this.k = i;
        if (this.g) {
            c7622mL2.a(i);
            int i3 = this.h;
            if (i3 >= 0) {
                c7622mL2.c(this.k, i3);
                this.h = -1;
            }
            int i4 = this.i;
            if (i4 != 0) {
                c7622mL2.d(this.k, i4);
                this.i = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC7966nL2
    public final void c() {
        C7622mL2 c7622mL2 = this.j;
        if (c7622mL2 != null) {
            int i = this.k;
            int i2 = c7622mL2.d;
            c7622mL2.d = i2 + 1;
            c7622mL2.b(4, i2, i, null, null);
            this.j = null;
            this.k = 0;
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void e() {
        this.g = true;
        C7622mL2 c7622mL2 = this.j;
        if (c7622mL2 != null) {
            c7622mL2.a(this.k);
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void g() {
        h(0);
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void h(int i) {
        this.g = false;
        C7622mL2 c7622mL2 = this.j;
        if (c7622mL2 != null) {
            int i2 = this.k;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = c7622mL2.d;
            c7622mL2.d = i3 + 1;
            c7622mL2.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void f(int i) {
        C7622mL2 c7622mL2 = this.j;
        if (c7622mL2 != null) {
            c7622mL2.c(this.k, i);
        } else {
            this.h = i;
            this.i = 0;
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void i(int i) {
        C7622mL2 c7622mL2 = this.j;
        if (c7622mL2 != null) {
            c7622mL2.d(this.k, i);
        } else {
            this.i += i;
        }
    }
}
