package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sL2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9681sL2 extends AbstractC4896eQ1 implements InterfaceC7966nL2 {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public C7622mL2 f;
    public int g;
    public final /* synthetic */ ServiceConnectionC10024tL2 h;

    @Override // defpackage.AbstractC4896eQ1
    public final void d() {
        ServiceConnectionC10024tL2 serviceConnectionC10024tL2 = this.h;
        serviceConnectionC10024tL2.p.remove(this);
        c();
        serviceConnectionC10024tL2.m();
    }

    public C9681sL2(ServiceConnectionC10024tL2 serviceConnectionC10024tL2, String str, String str2) {
        this.h = serviceConnectionC10024tL2;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.InterfaceC7966nL2
    public final int a() {
        return this.g;
    }

    @Override // defpackage.InterfaceC7966nL2
    public final void b(C7622mL2 c7622mL2) {
        this.f = c7622mL2;
        int i = c7622mL2.e;
        c7622mL2.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = c7622mL2.d;
        c7622mL2.d = i2 + 1;
        c7622mL2.b(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            c7622mL2.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                c7622mL2.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                c7622mL2.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC7966nL2
    public final void c() {
        C7622mL2 c7622mL2 = this.f;
        if (c7622mL2 != null) {
            int i = this.g;
            int i2 = c7622mL2.d;
            c7622mL2.d = i2 + 1;
            c7622mL2.b(4, i2, i, null, null);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void e() {
        this.c = true;
        C7622mL2 c7622mL2 = this.f;
        if (c7622mL2 != null) {
            c7622mL2.a(this.g);
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void g() {
        h(0);
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void h(int i) {
        this.c = false;
        C7622mL2 c7622mL2 = this.f;
        if (c7622mL2 != null) {
            int i2 = this.g;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = c7622mL2.d;
            c7622mL2.d = i3 + 1;
            c7622mL2.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void f(int i) {
        C7622mL2 c7622mL2 = this.f;
        if (c7622mL2 != null) {
            c7622mL2.c(this.g, i);
        } else {
            this.d = i;
            this.e = 0;
        }
    }

    @Override // defpackage.AbstractC4896eQ1
    public final void i(int i) {
        C7622mL2 c7622mL2 = this.f;
        if (c7622mL2 != null) {
            c7622mL2.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
