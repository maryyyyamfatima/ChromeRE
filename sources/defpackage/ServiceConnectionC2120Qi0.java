package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qi0 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2120Qi0 implements ServiceConnection {
    public final /* synthetic */ BinderC2640Ui0 a;

    public ServiceConnectionC2120Qi0(BinderC2640Ui0 binderC2640Ui0) {
        this.a = binderC2640Ui0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC12162zb1 c11819yb1;
        int i = BinderC1981Pg1.g;
        if (iBinder == null) {
            c11819yb1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.components.browser_ui.photo_picker.IDecoderService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC12162zb1)) {
                c11819yb1 = (InterfaceC12162zb1) queryLocalInterface;
            } else {
                c11819yb1 = new C11819yb1(iBinder);
            }
        }
        BinderC2640Ui0 binderC2640Ui0 = this.a;
        binderC2640Ui0.t = c11819yb1;
        Iterator it = binderC2640Ui0.r.iterator();
        while (it.hasNext()) {
            ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = (ViewOnClickListenerC9876su2) ((InterfaceC2380Si0) it.next());
            viewOnClickListenerC9876su2.F = true;
            if (viewOnClickListenerC9876su2.i != null) {
                viewOnClickListenerC9876su2.n.t();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4851eH1.a("ImageDecoderHost", "Service has unexpectedly disconnected", new Object[0]);
        this.a.t = null;
    }
}
