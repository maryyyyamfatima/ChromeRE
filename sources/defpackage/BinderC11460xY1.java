package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC11460xY1 extends AbstractBinderC0417Df1 {
    public final C6905kF3 a;

    public BinderC11460xY1(C6905kF3 c6905kF3) {
        this.a = c6905kF3;
    }

    @Override // defpackage.InterfaceC0547Ef1
    public final void b(Status status) {
        boolean r1 = status.r1();
        C6905kF3 c6905kF3 = this.a;
        if (r1) {
            c6905kF3.b(null);
        } else {
            c6905kF3.a(AbstractC10800vd.a(status));
        }
    }
}
