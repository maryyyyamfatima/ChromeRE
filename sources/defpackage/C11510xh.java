package defpackage;

import org.chromium.base.SysUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xh */
/* loaded from: classes.dex */
public final class C11510xh extends AbstractC1429Kz3 {
    public final /* synthetic */ C12196zh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11510xh(C12196zh c12196zh, AbstractC11276wz3 abstractC11276wz3) {
        super(abstractC11276wz3);
        this.i = c12196zh;
    }

    @Override // defpackage.BA0
    public final void f0(TabImpl tabImpl) {
        this.i.getClass();
        if ((SysUtils.isLowEndDevice() ^ true) && !tabImpl.isIncognito() && T34.h(tabImpl.getUrl())) {
            C9795sh.b().d(tabImpl.getUrl().i(), tabImpl.getTitle());
        }
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        TraceEvent i = TraceEvent.i("AppIndexingUtil::onPageLoadFinished", null);
        try {
            this.i.a(tab);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
