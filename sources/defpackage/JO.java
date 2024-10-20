package defpackage;

import android.net.NetworkInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JO implements InterfaceC1301Ka0 {
    public final /* synthetic */ KO a;

    @Override // defpackage.InterfaceC1301Ka0
    public final /* synthetic */ boolean a() {
        return AbstractC1171Ja0.a(this);
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean d() {
        NetworkInfo activeNetworkInfo = this.a.c.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return !r0.isActiveNetworkMetered();
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean e() {
        return this.a.b.getBoolean("isUploadEnabledForTests", false);
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean f() {
        return this.a.b.getBoolean("isClientInMetricsSample", true);
    }

    public JO(KO ko) {
        this.a = ko;
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean b() {
        return C9626sA2.g().b();
    }

    @Override // defpackage.InterfaceC1301Ka0
    public final boolean c() {
        return C9626sA2.g().c();
    }
}
