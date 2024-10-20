package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10565uv implements InterfaceC10222tv {
    public final List a;
    public C12282zv1 c = null;
    public float d = -1.0f;
    public C12282zv1 b = f(0.0f);

    @Override // defpackage.InterfaceC10222tv
    public final boolean isEmpty() {
        return false;
    }

    public C10565uv(List list) {
        this.a = list;
    }

    @Override // defpackage.InterfaceC10222tv
    public final boolean c(float f) {
        C12282zv1 c12282zv1 = this.b;
        if (f >= c12282zv1.b() && f < c12282zv1.a()) {
            return !this.b.c();
        }
        this.b = f(f);
        return true;
    }

    public final C12282zv1 f(float f) {
        List list = this.a;
        C12282zv1 c12282zv1 = (C12282zv1) list.get(list.size() - 1);
        if (f >= c12282zv1.b()) {
            return c12282zv1;
        }
        int size = list.size() - 2;
        while (true) {
            boolean z = false;
            if (size >= 1) {
                C12282zv1 c12282zv12 = (C12282zv1) list.get(size);
                if (this.b != c12282zv12) {
                    if (f >= c12282zv12.b() && f < c12282zv12.a()) {
                        z = true;
                    }
                    if (z) {
                        return c12282zv12;
                    }
                }
                size--;
            } else {
                return (C12282zv1) list.get(0);
            }
        }
    }

    @Override // defpackage.InterfaceC10222tv
    public final C12282zv1 b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC10222tv
    public final float e() {
        return ((C12282zv1) this.a.get(0)).b();
    }

    @Override // defpackage.InterfaceC10222tv
    public final float d() {
        return ((C12282zv1) this.a.get(r0.size() - 1)).a();
    }

    @Override // defpackage.InterfaceC10222tv
    public final boolean a(float f) {
        C12282zv1 c12282zv1 = this.c;
        C12282zv1 c12282zv12 = this.b;
        if (c12282zv1 == c12282zv12 && this.d == f) {
            return true;
        }
        this.c = c12282zv12;
        this.d = f;
        return false;
    }
}
