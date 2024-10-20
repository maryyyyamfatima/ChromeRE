package defpackage;

import android.content.Intent;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hM */
/* loaded from: classes.dex */
public final class C5906hM implements InterfaceC1631Mo1 {
    public final /* synthetic */ ChromeActivity a;

    @Override // defpackage.InterfaceC1631Mo1
    public final long a() {
        return 0L;
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final void b(String str, String str2) {
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final void d(LoadUrlParams loadUrlParams, int i, String str, int i2, Intent intent) {
    }

    public C5906hM(ChromeActivity chromeActivity) {
        this.a = chromeActivity;
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final void c(String str) {
        final Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", str);
        LocaleManager.getInstance().c(this.a, new Callback() { // from class: gM
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Boolean bool = (Boolean) obj;
                C5906hM c5906hM = C5906hM.this;
                c5906hM.getClass();
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                c5906hM.a.startActivity(intent);
            }
        });
    }
}
