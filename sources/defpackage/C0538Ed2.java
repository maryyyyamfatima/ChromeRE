package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ed2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0538Ed2 implements InterfaceC0408Dd2 {
    public final MC2 a = new MC2();
    public final IK3 g = new IK3();

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    @Override // defpackage.InterfaceC0408Dd2
    public final Object j(Callback callback) {
        this.g.getClass();
        this.a.g(callback);
        return get();
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        this.g.getClass();
        MC2 mc2 = this.a;
        if (mc2.d()) {
            return mc2.b;
        }
        return null;
    }

    public final void a(Object obj) {
        this.g.getClass();
        this.a.b(obj);
    }
}
