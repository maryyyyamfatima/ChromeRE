package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.download.DownloadNotificationServiceObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wr0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC11228wr0 implements ServiceConnection {
    public final /* synthetic */ C11914yr0 a;

    public ServiceConnectionC11228wr0(C11914yr0 c11914yr0) {
        this.a = c11914yr0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC4851eH1.f("DownloadFg", "onServiceConnected", new Object[0]);
        if (iBinder instanceof BinderC10199tr0) {
            C10542ur0 c10542ur0 = ((BinderC10199tr0) iBinder).a;
            C11914yr0 c11914yr0 = this.a;
            c11914yr0.g = c10542ur0;
            Object obj = ThreadUtils.a;
            Q83 q83 = O83.a;
            Set j = q83.j("ForegroundServiceObservers");
            String name = DownloadNotificationServiceObserver.class.getName();
            if (!j.contains(name)) {
                HashSet hashSet = new HashSet(j);
                hashSet.add(name);
                q83.u("ForegroundServiceObservers", hashSet);
            }
            c11914yr0.b(true);
            return;
        }
        AbstractC4851eH1.f("DownloadFg", "Not from DownloadNotificationService, do not connect. Component name: " + componentName, new Object[0]);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4851eH1.f("DownloadFg", "onServiceDisconnected", new Object[0]);
        this.a.g = null;
    }
}
