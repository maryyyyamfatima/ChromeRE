package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B11 extends P11 {
    public final /* synthetic */ InterfaceC6102hv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B11(I11 i11, InterfaceC6102hv interfaceC6102hv) {
        super(i11);
        this.b = interfaceC6102hv;
    }

    @Override // defpackage.P11
    public final void a() {
        this.b.a(new ConnectionResult(16, null));
    }
}
