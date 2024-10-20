package defpackage;

import android.content.Intent;
import android.os.Bundle;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uM */
/* loaded from: classes.dex */
public final class C10369uM implements InterfaceC2352Sc2 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ C10712vM c;

    @Override // defpackage.InterfaceC2352Sc2
    public final void a() {
    }

    public C10369uM(C10712vM c10712vM, Intent intent, Bundle bundle) {
        this.c = c10712vM;
        this.a = intent;
        this.b = bundle;
    }

    @Override // defpackage.InterfaceC2352Sc2
    public final void b() {
        if (!VrModuleProvider.b().d()) {
            throw new IllegalStateException("Still in VR after having exited VR.");
        }
        this.c.d(this.a, this.b);
    }
}
