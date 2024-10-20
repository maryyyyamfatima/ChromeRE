package defpackage;

import J.N;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DR extends AbstractC1429Kz3 {
    public final /* synthetic */ ChromeTabbedActivity i;

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a) {
            TraceEvent i = TraceEvent.i("CheckSyncErrorOnDidFinishNavigation", null);
            try {
                int i2 = AbstractC0619Et3.b;
                C7928nE c7928nE = UN.a;
                boolean z = true;
                boolean z2 = false;
                if (!(N.M09VlOh_("MessagesForAndroidInfrastructure") && N.M09VlOh_("MessagesForAndroidSyncError"))) {
                    WebContents webContents = tabImpl.l;
                    if (webContents != null) {
                        if (AbstractC0619Et3.b(AbstractC2308Rt3.a()) != -1) {
                            if (System.currentTimeMillis() - O83.a.g(0L, "sync_error_infobar_shown_shown_at_time") <= AbstractC0619Et3.a) {
                                z = false;
                            }
                            z2 = z;
                        }
                        if (z2) {
                            N.MWmaDLti(webContents);
                        }
                    }
                } else {
                    ChromeTabbedActivity chromeTabbedActivity = this.i;
                    C11243wt3.a(chromeTabbedActivity.H, chromeTabbedActivity);
                }
                if (i != null) {
                    i.close();
                }
                TraceEvent i3 = TraceEvent.i("updateActiveWebContents", null);
                try {
                    N.MGBuAcfs(tabImpl.l);
                    if (i3 != null) {
                        i3.close();
                    }
                } catch (Throwable th) {
                    if (i3 != null) {
                        try {
                            i3.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DR(ChromeTabbedActivity chromeTabbedActivity, AbstractC11276wz3 abstractC11276wz3) {
        super(abstractC11276wz3);
        this.i = chromeTabbedActivity;
    }
}
