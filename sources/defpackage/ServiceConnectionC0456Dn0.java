package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dn0 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC0456Dn0 implements ServiceConnection {
    public final /* synthetic */ C0846Gn0 a;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object c4982eg1;
        C0846Gn0 c0846Gn0 = this.a;
        MC2 mc2 = c0846Gn0.b;
        if (mc2 != null) {
            int i = AbstractBinderC5326fg1.a;
            if (iBinder == null) {
                c4982eg1 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.chrome.browser.usage_stats.idl.IWellbeingService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC5670gg1)) {
                    c4982eg1 = (InterfaceC5670gg1) queryLocalInterface;
                } else {
                    c4982eg1 = new C4982eg1(iBinder);
                }
            }
            mc2.b(c4982eg1);
            V60.a.unbindService(this);
            c0846Gn0.b = null;
        }
    }

    public ServiceConnectionC0456Dn0(C0846Gn0 c0846Gn0) {
        this.a = c0846Gn0;
    }
}
