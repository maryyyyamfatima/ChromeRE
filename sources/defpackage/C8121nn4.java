package defpackage;

import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.signin.services.WebSigninBridge;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.signin.base.GoogleServiceAuthError;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nn4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8121nn4 implements WebSigninBridge.Listener {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ Tab b;
    public final /* synthetic */ String c;

    public C8121nn4(String str, Callback callback, Tab tab) {
        this.a = callback;
        this.b = tab;
        this.c = str;
    }

    @Override // org.chromium.chrome.browser.signin.services.WebSigninBridge.Listener
    public final void a(GoogleServiceAuthError googleServiceAuthError) {
        Object obj = ThreadUtils.a;
        this.a.onResult(googleServiceAuthError);
    }

    @Override // org.chromium.chrome.browser.signin.services.WebSigninBridge.Listener
    public final void b() {
        Object obj = ThreadUtils.a;
        Tab tab = this.b;
        if (tab.isDestroyed()) {
            return;
        }
        tab.d(new LoadUrlParams(this.c, 0));
    }
}
