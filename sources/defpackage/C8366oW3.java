package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oW3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8366oW3 extends AbstractC3898bW3 {
    public final C8709pW3 a;

    public C8366oW3(C8709pW3 c8709pW3) {
        this.a = c8709pW3;
    }

    @Override // defpackage.AbstractC3898bW3, defpackage.KV3
    public final void a(QV3 qv3) {
        C8709pW3 c8709pW3 = this.a;
        if (c8709pW3.F) {
            return;
        }
        c8709pW3.G();
        c8709pW3.F = true;
    }

    @Override // defpackage.KV3
    public final void c(QV3 qv3) {
        C8709pW3 c8709pW3 = this.a;
        int i = c8709pW3.E - 1;
        c8709pW3.E = i;
        if (i == 0) {
            c8709pW3.F = false;
            c8709pW3.n();
        }
        qv3.w(this);
    }
}
