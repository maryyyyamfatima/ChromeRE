package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Pi4 implements BY1 {
    public final /* synthetic */ VrModuleProvider a;

    @Override // defpackage.BY1
    public final Context getContext() {
        VrModuleProvider vrModuleProvider = this.a;
        if (vrModuleProvider.b.m() != null) {
            return (Context) vrModuleProvider.b.m().k().get();
        }
        return null;
    }

    @Override // defpackage.BY1
    public final WindowAndroid m() {
        return this.a.b.m();
    }

    public Pi4(VrModuleProvider vrModuleProvider) {
        this.a = vrModuleProvider;
    }
}
