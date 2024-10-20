package defpackage;

import android.app.Activity;
import android.content.Context;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3515aP implements InterfaceC4202cP {
    public final RenderFrameHost a;

    public C3515aP(RenderFrameHost renderFrameHost) {
        this.a = renderFrameHost;
    }

    public final String b() {
        C4595dY3 c4595dY3;
        WebContents a = AbstractC2417Sp2.a(this.a);
        if (a == null) {
            return null;
        }
        Activity a2 = AbstractC9942t6.a(a);
        if (!(a2 instanceof CustomTabActivity)) {
            return null;
        }
        CustomTabActivity customTabActivity = (CustomTabActivity) a2;
        if (customTabActivity.U1() && (c4595dY3 = customTabActivity.e1) != null) {
            return c4595dY3.d.a;
        }
        return null;
    }

    public final Context a(RenderFrameHost renderFrameHost) {
        WebContents a = AbstractC2417Sp2.a(renderFrameHost);
        WindowAndroid Q0 = a == null ? null : a.Q0();
        if (Q0 == null) {
            return null;
        }
        return (Context) Q0.j.get();
    }
}
