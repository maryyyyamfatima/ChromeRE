package defpackage;

import J.N;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.browserservices.verification.OriginVerifier;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class AU {
    public final /* synthetic */ EU a;
    public final /* synthetic */ CustomTabsSessionToken b;

    public /* synthetic */ AU(EU eu, CustomTabsSessionToken customTabsSessionToken) {
        this.a = eu;
        this.b = customTabsSessionToken;
    }

    public final void a(DU du) {
        EU eu = this.a;
        HashMap hashMap = eu.c;
        CustomTabsSessionToken customTabsSessionToken = this.b;
        hashMap.remove(customTabsSessionToken);
        AbstractServiceConnectionC0378Cx2 abstractServiceConnectionC0378Cx2 = du.e;
        if (abstractServiceConnectionC0378Cx2 != null) {
            Context context = V60.a;
            InterfaceC2491Te1 interfaceC2491Te1 = abstractServiceConnectionC0378Cx2.h;
            if (interfaceC2491Te1 != null) {
                if (interfaceC2491Te1 != null) {
                    context.unbindService(abstractServiceConnectionC0378Cx2);
                    abstractServiceConnectionC0378Cx2.h = null;
                }
            }
        }
        OriginVerifier originVerifier = du.g;
        if (originVerifier != null && originVerifier.e.isEmpty()) {
            long j = originVerifier.d;
            if (j != 0) {
                N.MSfT_7mi(j, originVerifier);
                originVerifier.d = 0L;
            }
        }
        C2750Ve0 c2750Ve0 = du.c;
        if (c2750Ve0 != null) {
            CustomTabsConnection customTabsConnection = c2750Ve0.a;
            customTabsConnection.getClass();
            Object obj = ThreadUtils.a;
            H71 h71 = customTabsConnection.a;
            G71 g71 = h71.a;
            if (g71 != null && (customTabsSessionToken == null || customTabsSessionToken.equals(g71.a))) {
                h71.a.c.destroy();
                h71.a = null;
            }
            Callback callback = customTabsConnection.g;
            if (callback != null) {
                callback.onResult(customTabsSessionToken);
            }
            C1061Ie0 c1061Ie0 = (C1061Ie0) C10712vM.e().p.get();
            if (c1061Ie0.c) {
            }
        }
        eu.d.delete(du.a);
    }
}
