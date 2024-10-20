package com.google.vr.cardboard;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.Version;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.AbstractC5685gi4;
import defpackage.C2366Sf1;
import defpackage.C2756Vf1;
import defpackage.C6029hi4;
import defpackage.InterfaceC3016Xf1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrCoreLibraryLoader {
    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, Version.MIN, Version.CURRENT);
    }

    public static long loadNativeGvrLibrary(Context context, Version version, Version version2) {
        try {
            a(context, version);
            Context a = AbstractC5685gi4.a(context);
            AbstractC5685gi4.a(context);
            int i = AbstractC5685gi4.b;
            InterfaceC3016Xf1 a2 = ((C2366Sf1) AbstractC5685gi4.b(context)).a(new ObjectWrapper(a), new ObjectWrapper(context));
            if (a2 == null) {
                Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                return 0L;
            }
            if (i < 19) {
                return ((C2756Vf1) a2).e(version2.majorVersion, version2.minorVersion, version2.patchVersion);
            }
            return ((C2756Vf1) a2).h(version.toString(), version2.toString());
        } catch (RemoteException | C6029hi4 | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
            sb.append("Failed to load native GVR library from VrCore:\n  ");
            sb.append(valueOf);
            Log.e("VrCoreLibraryLoader", sb.toString());
            return 0L;
        }
    }

    public static long loadNativeDlsymMethod(Context context) {
        if (Build.VERSION.SDK_INT > 23) {
            return 0L;
        }
        try {
            if (VrCoreUtils.getVrCoreClientApiVersion(context) < 14) {
                return 0L;
            }
            Context a = AbstractC5685gi4.a(context);
            InterfaceC3016Xf1 a2 = ((C2366Sf1) AbstractC5685gi4.b(context)).a(new ObjectWrapper(a), new ObjectWrapper(context));
            if (a2 == null) {
                Log.e("VrCoreLibraryLoader", "Failed to load native dlsym handle from VrCore: no library loader available.");
                return 0L;
            }
            return ((C2756Vf1) a2).a();
        } catch (RemoteException | C6029hi4 | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 50);
            sb.append("Failed to load native dlsym handle from VrCore:\n  ");
            sb.append(valueOf);
            Log.e("VrCoreLibraryLoader", sb.toString());
            return 0L;
        }
    }

    public static void a(Context context, Version version) {
        String b = VrCoreUtils.b(context);
        Version parse = Version.parse(b);
        if (parse == null) {
            Log.i("VrCoreLibraryLoader", "VrCore version does not support library loading.");
            throw new C6029hi4(4);
        }
        if (parse.isAtLeast(version)) {
            return;
        }
        Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", b, version.toString()));
        throw new C6029hi4(4);
    }
}
