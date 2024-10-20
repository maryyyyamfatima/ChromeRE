package defpackage;

import J.N;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cp1 */
/* loaded from: classes2.dex */
public final class C4349cp1 extends InterceptNavigationDelegate {
    public final InterfaceC3061Xo1 a;
    public WebContents b;
    public C12055zG0 c;
    public boolean d;
    public boolean e;

    public C4349cp1(C3321Zo1 c3321Zo1) {
        this.a = c3321Zo1;
        AppHooks.get().getClass();
        a(c3321Zo1.a.l);
    }

    public final void a(WebContents webContents) {
        if (this.b == webContents) {
            return;
        }
        this.b = webContents;
        if (webContents == null) {
            return;
        }
        if (this.c == null) {
            TabImpl tabImpl = ((C3321Zo1) this.a).a;
            this.c = tabImpl.C.d(tabImpl);
        }
        N.Mjjyc5BV(this, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:            if (r0.isEmpty() == false) goto L274;     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldIgnoreNavigation(org.chromium.content_public.browser.NavigationHandle r30, org.chromium.url.GURL r31) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4349cp1.shouldIgnoreNavigation(org.chromium.content_public.browser.NavigationHandle, org.chromium.url.GURL):boolean");
    }

    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    public final void onResourceRequestWithGesture() {
        C3321Zo1 c3321Zo1 = (C3321Zo1) this.a;
        VK2 a = c3321Zo1.a();
        ChromeActivity O = c3321Zo1.a.O();
        a.c(0, false, true, O == null ? -1L : O.K, b(), false, true);
    }

    public final int b() {
        InterfaceC3061Xo1 interfaceC3061Xo1 = this.a;
        if (((C3321Zo1) interfaceC3061Xo1).a.l == null) {
            return -1;
        }
        return ((C3321Zo1) interfaceC3061Xo1).a.l.i().k();
    }

    public final boolean c() {
        C3321Zo1 c3321Zo1 = (C3321Zo1) this.a;
        WebContents webContents = c3321Zo1.a.l;
        boolean z = false;
        if (webContents == null) {
            return false;
        }
        if (webContents.f().k()) {
            return true;
        }
        if (!(c3321Zo1.a().c != null)) {
            return false;
        }
        UK2 uk2 = c3321Zo1.a().c;
        if (uk2 != null && uk2.b) {
            z = true;
        }
        return !z;
    }

    public final void d(boolean z, boolean z2) {
        int i;
        C3321Zo1 c3321Zo1 = (C3321Zo1) this.a;
        if (c3321Zo1.a.l == null) {
            return;
        }
        if (z && c()) {
            PostTask.c(AbstractC5103f04.a, new RunnableC4006bp1(this));
            return;
        }
        if ((c3321Zo1.a().c != null) && b() > (i = c3321Zo1.a().d)) {
            if (z2) {
                this.e = true;
            } else {
                this.d = true;
                c3321Zo1.a.l.i().z(i);
            }
        }
    }
}
