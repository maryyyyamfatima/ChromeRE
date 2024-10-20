package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.webapps.WebApkInstaller;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ik4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6384ik4 implements Callback {
    public final /* synthetic */ WebApkInstaller a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C6384ik4(WebApkInstaller webApkInstaller) {
        this.a = webApkInstaller;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.a(((Integer) obj).intValue());
    }
}
