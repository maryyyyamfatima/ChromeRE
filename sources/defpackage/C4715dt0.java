package defpackage;

import android.content.ComponentCallbacks2;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.download.DownloadManagerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dt0 */
/* loaded from: classes.dex */
public final class C4715dt0 implements InterfaceC0679Ff3 {
    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        DownloadManagerService.openDownloadsPage(null, 6);
    }

    public final ViewOnClickListenerC1069If3 c() {
        ComponentCallbacks2 componentCallbacks2 = ApplicationStatus.hasVisibleActivities() ? ApplicationStatus.c : null;
        if (componentCallbacks2 == null || !(componentCallbacks2 instanceof InterfaceC0809Gf3)) {
            return null;
        }
        return ((InterfaceC0809Gf3) componentCallbacks2).z();
    }
}
