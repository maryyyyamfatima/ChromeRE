package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10908vv implements InterfaceC10222tv {
    public final C12282zv1 a;
    public float b = -1.0f;

    @Override // defpackage.InterfaceC10222tv
    public final boolean isEmpty() {
        return false;
    }

    public C10908vv(List list) {
        this.a = (C12282zv1) list.get(0);
    }

    @Override // defpackage.InterfaceC10222tv
    public final boolean c(float f) {
        return !this.a.c();
    }

    @Override // defpackage.InterfaceC10222tv
    public final C12282zv1 b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC10222tv
    public final float e() {
        return this.a.b();
    }

    @Override // defpackage.InterfaceC10222tv
    public final float d() {
        return this.a.a();
    }

    @Override // defpackage.InterfaceC10222tv
    public final boolean a(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }
}
