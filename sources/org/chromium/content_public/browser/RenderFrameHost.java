package org.chromium.content_public.browser;

import defpackage.AbstractC6754jp1;
import defpackage.InterfaceC7098kp1;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface RenderFrameHost {
    boolean a();

    Origin b();

    List c();

    void d();

    InterfaceC7098kp1 e(AbstractC6754jp1 abstractC6754jp1);

    int f(String str, Origin origin, boolean z);

    GURL g();

    void h(Callback callback);

    boolean i();

    boolean isIncognito();

    WebAuthSecurityChecksResults j(String str, Origin origin, boolean z);

    void k();

    boolean l();

    boolean m();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class WebAuthSecurityChecksResults {
        public final boolean a;
        public final int b;

        public WebAuthSecurityChecksResults(int i, boolean z) {
            this.b = i;
            this.a = z;
        }
    }
}
