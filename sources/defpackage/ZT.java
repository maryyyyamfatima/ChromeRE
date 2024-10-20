package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZT implements InterfaceC9914t11, InterfaceC10257u11 {
    public final C3588ad a;
    public final boolean g;
    public InterfaceC3540aU h;

    public ZT(C3588ad c3588ad, boolean z) {
        this.a = c3588ad;
        this.g = z;
    }

    @Override // defpackage.InterfaceC1962Pc2
    public final void M0(ConnectionResult connectionResult) {
        this.h.a(connectionResult, this.a, this.g);
    }

    @Override // defpackage.C30
    public final void e(int i) {
        this.h.e(i);
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        this.h.h(bundle);
    }
}
