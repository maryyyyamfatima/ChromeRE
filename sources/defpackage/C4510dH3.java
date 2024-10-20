package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dH3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4510dH3 implements InterfaceC7458ls {
    public final C8385oa2 a = new C8385oa2();
    public final C4166cH3 g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.chromium.base.Callback, cH3] */
    public C4510dH3() {
        ?? r0 = new Callback() { // from class: cH3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4510dH3.this.a.p(Boolean.valueOf(((Integer) obj).intValue() != 0));
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        };
        this.g = r0;
        C3823bH3.r.m(r0);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        C3823bH3.d();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.a;
    }
}
