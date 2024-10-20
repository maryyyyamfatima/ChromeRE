package defpackage;

import android.os.Bundle;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wc0 */
/* loaded from: classes.dex */
public final class C2870Wc0 extends AbstractC10430uY0 {
    public final /* synthetic */ C3130Yc0 a;

    @Override // defpackage.AbstractC10430uY0
    public final void c(int i, int i2) {
        this.a.C.a = false;
    }

    @Override // defpackage.AbstractC10430uY0
    public final void d(int i, int i2, boolean z) {
        C3000Xc0 c3000Xc0 = this.a.C;
        c3000Xc0.a = true;
        c3000Xc0.b = z;
        C3130Yc0 c3130Yc0 = c3000Xc0.c;
        CustomTabsConnection customTabsConnection = c3130Yc0.h;
        customTabsConnection.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDirectionUp", z);
        if (customTabsConnection.s(c3130Yc0.z, "onVerticalScrollEvent", bundle)) {
            customTabsConnection.m(bundle, "extraCallback(onVerticalScrollEvent)");
        }
    }

    @Override // defpackage.AbstractC10430uY0
    public final void g(boolean z) {
        C3000Xc0 c3000Xc0 = this.a.C;
        if (!c3000Xc0.a || z == c3000Xc0.b) {
            return;
        }
        c3000Xc0.b = z;
        C3130Yc0 c3130Yc0 = c3000Xc0.c;
        CustomTabsConnection customTabsConnection = c3130Yc0.h;
        customTabsConnection.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDirectionUp", z);
        if (customTabsConnection.s(c3130Yc0.z, "onVerticalScrollEvent", bundle)) {
            customTabsConnection.m(bundle, "extraCallback(onVerticalScrollEvent)");
        }
    }

    public C2870Wc0(C3130Yc0 c3130Yc0) {
        this.a = c3130Yc0;
    }
}
