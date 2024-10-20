package defpackage;

import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zz3 */
/* loaded from: classes.dex */
public final class RunnableC12305zz3 implements Runnable {
    public final /* synthetic */ TabModel a;
    public final /* synthetic */ C0129Az3 g;

    public RunnableC12305zz3(C0129Az3 c0129Az3, TabModel tabModel) {
        this.g = c0129Az3;
        this.a = tabModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0129Az3 c0129Az3 = this.g;
        c0129Az3.q();
        if (c0129Az3.h == null || this.a.isIncognito()) {
            return;
        }
        c0129Az3.h.a(12);
    }
}
