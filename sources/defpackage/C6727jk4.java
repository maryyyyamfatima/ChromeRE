package defpackage;

import J.N;
import org.chromium.chrome.browser.webapps.WebApkInstaller;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jk4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6727jk4 extends AbstractC0185Bl {
    public final /* synthetic */ WebApkInstaller h;

    public C6727jk4(WebApkInstaller webApkInstaller) {
        this.h = webApkInstaller;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        WebApkInstaller webApkInstaller = this.h;
        N.Mz0ZUPry(webApkInstaller.a, webApkInstaller, ((Integer) obj).intValue());
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        long a = Pk4.a();
        if (a > 0) {
            return 0;
        }
        if (Pk4.b(V60.a.getCacheDir()) + a > 0) {
            return 1;
        }
        return 2;
    }
}
