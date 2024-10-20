package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.Preferences$UserPrefs;
import defpackage.AbstractC5729gq0;
import defpackage.AbstractC8015nV1;
import defpackage.C1257Jr1;
import defpackage.Qi4;
import defpackage.Si4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrParamsProviderJni {
    private static native void nativeUpdateNativePhoneParamsPointer(long j, int i, int i2, float f, float f2, float f3);

    private static byte[] readDeviceParams(Context context) {
        Qi4 a = Si4.a(context);
        CardboardDevice$DeviceParams a2 = a.a();
        a.close();
        if (a2 == null) {
            return null;
        }
        return AbstractC8015nV1.toByteArray(a2);
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        return AbstractC8015nV1.toByteArray(SdkConfigurationReader.getParams(context));
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        CardboardDevice$DeviceParams cardboardDevice$DeviceParams;
        Qi4 a = Si4.a(context);
        try {
            if (bArr != null) {
                try {
                    cardboardDevice$DeviceParams = (CardboardDevice$DeviceParams) AbstractC8015nV1.mergeFrom(new CardboardDevice$DeviceParams(), bArr);
                } catch (C1257Jr1 e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 31);
                    sb.append("Error parsing protocol buffer: ");
                    sb.append(valueOf);
                    Log.w("VrParamsProviderJni", sb.toString());
                    a.close();
                    return false;
                }
            } else {
                cardboardDevice$DeviceParams = null;
            }
            boolean e2 = a.e(cardboardDevice$DeviceParams);
            a.close();
            return e2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    private static void readPhoneParams(Context context, long j) {
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            nativeUpdateNativePhoneParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, AbstractC5729gq0.a(null));
            return;
        }
        Qi4 a = Si4.a(context);
        Display$DisplayParams c = a.c();
        DisplayMetrics d = AbstractC5729gq0.d(((WindowManager) context.getSystemService("window")).getDefaultDisplay(), c);
        a.close();
        nativeUpdateNativePhoneParamsPointer(j, d.widthPixels, d.heightPixels, d.xdpi, d.ydpi, AbstractC5729gq0.a(c));
    }

    private static byte[] readUserPrefs(Context context) {
        Qi4 a = Si4.a(context);
        Preferences$UserPrefs d = a.d();
        a.close();
        if (d == null) {
            return null;
        }
        return AbstractC8015nV1.toByteArray(d);
    }
}
