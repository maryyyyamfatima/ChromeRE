package com.google.vr.ndk.base;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.AbstractBinderC0792Gc1;
import defpackage.AbstractC5685gi4;
import defpackage.C2366Sf1;
import defpackage.C6029hi4;
import defpackage.InterfaceC0922Hc1;
import defpackage.InterfaceC2626Uf1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class GvrLayoutFactory {
    public static InterfaceC0922Hc1 create(Context context) {
        InterfaceC0922Hc1 tryCreateFromVrCorePackage = tryCreateFromVrCorePackage(context);
        if (tryCreateFromVrCorePackage != null) {
            return tryCreateFromVrCorePackage;
        }
        if (GvrApi.usingShimLibrary()) {
            throw new IllegalStateException("Client shim failed to load GvrLayout from VrCore.");
        }
        return createFromCurrentPackage(context);
    }

    private static InterfaceC0922Hc1 createFromCurrentPackage(Context context) {
        return new GvrLayoutImplWrapper(new GvrLayoutImpl(context));
    }

    private static InterfaceC0922Hc1 tryCreateFromVrCorePackage(Context context) {
        if ("com.google.vr.vrcore".equalsIgnoreCase(context.getPackageName())) {
            return createFromCurrentPackage(context);
        }
        if (!GvrApi.usingDynamicLibrary(context)) {
            return null;
        }
        Boolean bool = SdkConfigurationReader.getParams(context).allowDynamicJavaLibraryLoading;
        if ((bool == null || !bool.booleanValue()) && !GvrApi.usingShimLibrary()) {
            return null;
        }
        try {
            if (VrCoreUtils.getVrCoreClientApiVersion(context) < 17) {
                return null;
            }
            try {
                Context a = AbstractC5685gi4.a(context);
                InterfaceC2626Uf1 b = AbstractC5685gi4.b(context);
                ObjectWrapper objectWrapper = new ObjectWrapper(a);
                ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                C2366Sf1 c2366Sf1 = (C2366Sf1) b;
                Parcel obtainAndWriteInterfaceToken = c2366Sf1.obtainAndWriteInterfaceToken();
                c.a(obtainAndWriteInterfaceToken, objectWrapper);
                c.a(obtainAndWriteInterfaceToken, objectWrapper2);
                Parcel transactAndReadException = c2366Sf1.transactAndReadException(5, obtainAndWriteInterfaceToken);
                InterfaceC0922Hc1 asInterface = AbstractBinderC0792Gc1.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                if (asInterface != null) {
                    Log.i("GvrLayoutFactory", "Successfully loaded GvrLayout from VrCore.");
                } else {
                    Log.w("GvrLayoutFactory", "GvrLayout creation from VrCore failed.");
                }
                return asInterface;
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                sb.append("Failed to load GvrLayout from VrCore:\n  ");
                sb.append(valueOf);
                Log.e("GvrLayoutFactory", sb.toString());
                return null;
            }
        } catch (C6029hi4 unused) {
        }
    }
}
