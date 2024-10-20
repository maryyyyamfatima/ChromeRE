package com.google.research.ink.core.jni;

import android.graphics.Bitmap;
import defpackage.AbstractC3176Yl1;
import defpackage.C10601v12;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class NativeStaticHelpers {
    private NativeStaticHelpers() {
    }

    public static native long nativeCalculateFingerprint(byte[] bArr);

    public static native byte[] nativeClearPendingMutations(byte[] bArr);

    public static native byte[] nativeExtractMutationPacket(byte[] bArr);

    public static native boolean nativeSnapshotHasPendingMutations(byte[] bArr);

    public static native byte[] nativeToVectorElements(byte[] bArr);

    static {
        AbstractC3176Yl1.a();
    }

    private static void throwRuntimeException(String str) {
        throw new C10601v12(str);
    }

    private static Bitmap createBitmap(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }
}
