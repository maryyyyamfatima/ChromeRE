package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import org.chromium.webapk.lib.runtime_library.IWebApkApi;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wk4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC11190wk4 {
    public static void a(InterfaceC11533xk4 interfaceC11533xk4, IBinder iBinder) {
        InterfaceC3952bg1 c3276Zf1;
        if (iBinder != null) {
            try {
                int i = AbstractBinderC3608ag1.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface(IWebApkApi.DESCRIPTOR);
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC3952bg1)) {
                    c3276Zf1 = (InterfaceC3952bg1) queryLocalInterface;
                } else {
                    c3276Zf1 = new C3276Zf1(iBinder);
                }
                interfaceC11533xk4.b(c3276Zf1);
                EI2.b("WebApk.WebApkService.BindSuccess", true);
                return;
            } catch (RemoteException e) {
                AbstractC4851eH1.f("WebApkServiceClient", "WebApkAPI use failed.", e);
                return;
            }
        }
        EI2.b("WebApk.WebApkService.BindSuccess", false);
    }
}
