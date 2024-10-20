package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bQ3 */
/* loaded from: classes2.dex */
public final class C3868bQ3 extends AbstractC9364rQ3 {
    public final /* synthetic */ C9707sQ3 d;

    @Override // defpackage.AbstractC9364rQ3
    public final boolean k() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3868bQ3(C9707sQ3 c9707sQ3) {
        super(c9707sQ3);
        this.d = c9707sQ3;
    }

    @Override // defpackage.AbstractC9364rQ3, defpackage.InterfaceC11299x32
    public final void g(Callback callback) {
        if (this.b == this.d.f()) {
            return;
        }
        super.g(callback);
    }
}
