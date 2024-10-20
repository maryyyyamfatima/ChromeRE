package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import defpackage.V60;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ApkAssets {
    public static long[] open(String str, String str2) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                Context context = V60.a;
                if (!TextUtils.isEmpty(str2) && BundleUtils.d(context, str2)) {
                    context = BundleUtils.a(context, str2);
                }
                assetFileDescriptor = context.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                } catch (IOException e) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e);
                }
                return jArr;
            } catch (Throwable th) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e2) {
                        Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            if (!e3.getMessage().equals("") && !e3.getMessage().equals(str)) {
                Log.e("ApkAssets", "Error while loading asset " + str + ": " + e3);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e4);
                }
            }
            return jArr2;
        }
    }
}
