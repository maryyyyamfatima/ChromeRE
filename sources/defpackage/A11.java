package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A11 extends P11 {
    public final /* synthetic */ ConnectionResult b;
    public final /* synthetic */ C11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A11(C11 c11, I11 i11, ConnectionResult connectionResult) {
        super(i11);
        this.c = c11;
        this.b = connectionResult;
    }

    @Override // defpackage.P11
    public final void a() {
        this.c.h.k(this.b);
    }
}
