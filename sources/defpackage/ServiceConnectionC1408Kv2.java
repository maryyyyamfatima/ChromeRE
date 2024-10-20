package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kv2 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1408Kv2 implements ServiceConnection {
    public final /* synthetic */ C1537Lv2 a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC2101Qe1 c1841Oe1;
        C1537Lv2 c1537Lv2 = this.a;
        c1537Lv2.d = false;
        int i = AbstractBinderC1971Pe1.a;
        if (iBinder == null) {
            c1841Oe1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2101Qe1)) {
                c1841Oe1 = (InterfaceC2101Qe1) queryLocalInterface;
            } else {
                c1841Oe1 = new C1841Oe1(iBinder);
            }
        }
        c1537Lv2.b = c1841Oe1;
        Iterator it = c1537Lv2.e.values().iterator();
        while (it.hasNext()) {
            ((C2791Vm1) it.next()).a.c(AbstractC0185Bl.e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1537Lv2 c1537Lv2 = this.a;
        c1537Lv2.b = null;
        C1537Lv2.a(c1537Lv2);
    }

    public ServiceConnectionC1408Kv2(C1537Lv2 c1537Lv2) {
        this.a = c1537Lv2;
    }
}
