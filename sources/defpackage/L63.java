package defpackage;

import J.N;
import android.content.ComponentName;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L63 implements InterfaceC6518j73 {
    public final InterfaceC6518j73 a;
    public final Profile b;

    @Override // defpackage.InterfaceC6518j73
    public final void a(ComponentName componentName) {
        O83.a.t("Chrome.Sharing.LastSharedComponentName", componentName.flattenToString());
        Profile profile = this.b;
        if (profile != null) {
            N.MtTgEuiL(profile, componentName.flattenToString());
        }
        InterfaceC6518j73 interfaceC6518j73 = this.a;
        if (interfaceC6518j73 != null) {
            interfaceC6518j73.a(componentName);
        }
    }

    public L63(Profile profile, InterfaceC6518j73 interfaceC6518j73) {
        this.a = interfaceC6518j73;
        this.b = profile;
    }

    @Override // defpackage.InterfaceC6518j73
    public final void onCancel() {
        InterfaceC6518j73 interfaceC6518j73 = this.a;
        if (interfaceC6518j73 != null) {
            interfaceC6518j73.onCancel();
        }
    }
}
