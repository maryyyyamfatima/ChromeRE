package org.chromium.base.library_loader;

import defpackage.EI2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ModernLinkerJni {
    public static native int nativeGetRelroSharingResult();

    public static native boolean nativeLoadLibrary(String str, Linker$LibInfo linker$LibInfo, boolean z);

    public static native boolean nativeUseRelros(long j, Linker$LibInfo linker$LibInfo);

    public static void reportDlopenExtTime(long j) {
        EI2.n(j, "ChromiumAndroidLinker.ModernLinkerDlopenExtTime");
    }

    public static void reportIteratePhdrTime(long j) {
        EI2.n(j, "ChromiumAndroidLinker.ModernLinkerIteratePhdrTime");
    }
}
