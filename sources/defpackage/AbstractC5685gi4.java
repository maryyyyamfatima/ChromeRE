package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.vrcore.base.api.VrCoreUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gi4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5685gi4 {
    public static Context a;
    public static int b;
    public static InterfaceC2626Uf1 c;

    public static InterfaceC2626Uf1 b(Context context) {
        InterfaceC2626Uf1 c2366Sf1;
        if (c == null) {
            try {
                IBinder iBinder = (IBinder) a(context).getClassLoader().loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
                int i = AbstractBinderC2496Tf1.a;
                if (iBinder == null) {
                    c2366Sf1 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                    if (queryLocalInterface instanceof InterfaceC2626Uf1) {
                        c2366Sf1 = (InterfaceC2626Uf1) queryLocalInterface;
                    } else {
                        c2366Sf1 = new C2366Sf1(iBinder);
                    }
                }
                c = c2366Sf1;
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("com.google.vr.vrcore.library.VrCreator".length() != 0 ? "Unable to find dynamic class ".concat("com.google.vr.vrcore.library.VrCreator") : new String("Unable to find dynamic class "));
            } catch (IllegalAccessException unused2) {
                throw new IllegalStateException("com.google.vr.vrcore.library.VrCreator".length() != 0 ? "Unable to call the default constructor of ".concat("com.google.vr.vrcore.library.VrCreator") : new String("Unable to call the default constructor of "));
            } catch (InstantiationException unused3) {
                throw new IllegalStateException("com.google.vr.vrcore.library.VrCreator".length() != 0 ? "Unable to instantiate the remote class ".concat("com.google.vr.vrcore.library.VrCreator") : new String("Unable to instantiate the remote class "));
            }
        }
        return c;
    }

    public static Context a(Context context) {
        if (a == null) {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion < 9) {
                throw new C6029hi4(4);
            }
            try {
                a = context.createPackageContext("com.google.vr.vrcore", 3);
                b = vrCoreClientApiVersion;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C6029hi4(1);
            }
        }
        return a;
    }
}
