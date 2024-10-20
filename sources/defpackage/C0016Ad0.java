package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ad0 */
/* loaded from: classes.dex */
public final class C0016Ad0 extends C9599s6 {
    public final Activity l;
    public final int m;
    public final String n;
    public final int o;
    public final C7851n02 p;
    public final boolean q;

    @Override // defpackage.C9599s6, defpackage.AbstractC10328uD3
    public final boolean shouldResumeRequestsForCreatedWindow() {
        return true;
    }

    public C0016Ad0(Tab tab, Activity activity, int i, String str, int i2, C7851n02 c7851n02, boolean z, InterfaceC7968nM interfaceC7968nM, JC jc, ZU0 zu0, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC0079Ap3 interfaceC0079Ap33) {
        super(tab, activity, interfaceC7968nM, true, jc, zu0, interfaceC10912vv3, interfaceC0079Ap3, interfaceC0079Ap32, interfaceC0079Ap33);
        this.l = activity;
        this.m = i;
        this.n = str;
        this.o = i2;
        this.p = c7851n02;
        this.q = z;
    }

    @Override // defpackage.C9599s6
    public final void b() {
        Activity activity = this.l;
        ((ActivityManager) activity.getSystemService("activity")).moveTaskToFront(activity.getTaskId(), 0);
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean shouldEnableEmbeddedMediaExperience() {
        return this.q;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void openNewTab(GURL gurl, String str, ResourceRequestBody resourceRequestBody, int i, boolean z) {
        if (i != 8) {
            super.openNewTab(gurl, str, resourceRequestBody, i, z);
            return;
        }
        if (!z) {
            LoadUrlParams loadUrlParams = new LoadUrlParams(gurl.i(), 0);
            loadUrlParams.g = str;
            loadUrlParams.b(resourceRequestBody);
            loadUrlParams.n = z;
            new C11598xv3(true).g(new C9134ql(loadUrlParams, null, null, new ComponentName(V60.a, (Class<?>) this.p.j(V60.a, null))), 4, -1);
            return;
        }
        throw new IllegalStateException("Invalid attempt to open an incognito tab from the renderer");
    }

    @Override // defpackage.C9599s6, org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int a() {
        return this.o;
    }

    @Override // defpackage.AbstractC10328uD3
    public final String getManifestScope() {
        return this.n;
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean canShowAppBanners() {
        return this.m == 1;
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean isInstalledWebappDelegateGeolocation() {
        Activity activity = this.l;
        if (activity instanceof CustomTabActivity) {
            CustomTabActivity customTabActivity = (CustomTabActivity) activity;
            if (customTabActivity.U1()) {
                C4595dY3 c4595dY3 = customTabActivity.e1;
                if (C11205wn1.d(c4595dY3 == null ? null : c4595dY3.d.a) != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
