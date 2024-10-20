package org.chromium.base.library_loader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LinkerJni {
    public static native void nativeFindMemoryRegionAtRandomAddress(Linker$LibInfo linker$LibInfo, boolean z);

    public static native boolean nativeFindRegionReservedByWebViewZygote(Linker$LibInfo linker$LibInfo);

    public static native void nativeReserveMemoryForLibrary(Linker$LibInfo linker$LibInfo);
}
