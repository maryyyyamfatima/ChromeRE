package defpackage;

import android.os.Bundle;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FU implements WU2 {
    public final String a;

    public FU(I5 i5, PC pc, CustomTabsConnection customTabsConnection, InterfaceC0079Ap3 interfaceC0079Ap3) {
        Bundle bundle = (Bundle) interfaceC0079Ap3.get();
        if (bundle != null) {
            this.a = bundle.getString("twaClientPackageName");
        } else {
            this.a = customTabsConnection.e(pc.u());
        }
        i5.b(this);
    }

    @Override // defpackage.WU2
    public final void G(Bundle bundle) {
        bundle.putString("twaClientPackageName", this.a);
    }
}
