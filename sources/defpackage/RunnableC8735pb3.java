package defpackage;

import J.N;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.browsing_data.BrowsingDataBridge;
import org.chromium.chrome.browser.signin.SigninManagerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pb3 */
/* loaded from: classes.dex */
public final class RunnableC8735pb3 implements Runnable {
    public final /* synthetic */ C8938qA a;
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ SigninManagerImpl h;

    public RunnableC8735pb3(SigninManagerImpl signinManagerImpl, C8938qA c8938qA, Runnable runnable) {
        this.h = signinManagerImpl;
        this.a = c8938qA;
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8938qA c8938qA = this.a;
        c8938qA.getClass();
        Object obj = ThreadUtils.a;
        N.M70Imm05(c8938qA.c, c8938qA);
        c8938qA.c();
        BrowsingDataBridge.b().a(new C8392ob3(this), SigninManagerImpl.p, 4);
    }
}
