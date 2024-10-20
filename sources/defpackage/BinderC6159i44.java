package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.usage_stats.idl.ParcelableBrowserResponse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i44 */
/* loaded from: classes2.dex */
public final class BinderC6159i44 extends AbstractBinderC10441ua1 {
    public final Context a;
    public final C10964w44 g;

    public static void e(InterfaceC10098ta1 interfaceC10098ta1, OC oc) {
        try {
            ParcelableBrowserResponse parcelableBrowserResponse = new ParcelableBrowserResponse(new C5001ej2(oc.toByteArray()));
            C9755sa1 c9755sa1 = (C9755sa1) interfaceC10098ta1;
            c9755sa1.getClass();
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("org.chromium.chrome.browser.usage_stats.idl.IBrowserCallback");
                obtain.writeInt(1);
                parcelableBrowserResponse.writeToParcel(obtain, 0);
                c9755sa1.a.transact(1, obtain, null, 1);
                obtain.recycle();
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (RemoteException e) {
            AbstractC4851eH1.a("UsageStatsService", "Error responding to Digital Wellbeing: ", e);
        }
    }

    public BinderC6159i44(AbstractServiceC1728Nh3 abstractServiceC1728Nh3) {
        this.a = abstractServiceC1728Nh3;
        if (C10964w44.c()) {
            this.g = C10964w44.b();
        }
    }

    public static C10721vN3 a(long j) {
        C10035tN3 c10035tN3 = (C10035tN3) C10721vN3.m.j();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j);
        if (c10035tN3.h) {
            c10035tN3.l();
            c10035tN3.h = false;
        }
        C10721vN3 c10721vN3 = (C10721vN3) c10035tN3.g;
        c10721vN3.j |= 1;
        c10721vN3.k = seconds;
        int nanos = (int) timeUnit.toNanos(j % 1000);
        if (c10035tN3.h) {
            c10035tN3.l();
            c10035tN3.h = false;
        }
        C10721vN3 c10721vN32 = (C10721vN3) c10035tN3.g;
        c10721vN32.j |= 2;
        c10721vN32.l = nanos;
        return (C10721vN3) c10035tN3.j();
    }
}
