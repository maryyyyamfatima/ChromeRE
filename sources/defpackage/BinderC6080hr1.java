package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC6080hr1 extends AbstractBinderC0417Df1 {
    public final /* synthetic */ C6905kF3 a;

    public BinderC6080hr1(C6905kF3 c6905kF3) {
        this.a = c6905kF3;
    }

    @Override // defpackage.InterfaceC0547Ef1
    public final void b(Status status) {
        int i = status.g;
        C6905kF3 c6905kF3 = this.a;
        if (i != 6) {
            RF3.a(status, null, c6905kF3);
        } else {
            c6905kF3.c(AbstractC10800vd.a(status));
        }
    }
}
