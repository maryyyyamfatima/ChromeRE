package defpackage;

import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class Oi4 implements InterfaceC2401Sm1 {
    public final /* synthetic */ InterfaceC2401Sm1 a;

    @Override // defpackage.InterfaceC2401Sm1
    public final void a(boolean z) {
        if (z) {
            VrModuleProvider.c = null;
            VrModuleProvider.b().i();
        } else {
            InterfaceC9121qi4 interfaceC9121qi4 = VrModuleProvider.c;
        }
        this.a.a(z);
    }
}
