package org.chromium.base.library_loader;

import android.os.ParcelFileDescriptor;
import defpackage.AbstractC2663Um3;
import defpackage.AbstractC4809e90;
import defpackage.AbstractC4851eH1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LegacyLinker extends d {
    public static native boolean nativeAddZipArchivePath(String str);

    public static native boolean nativeCreateSharedRelro(String str, long j, Linker$LibInfo linker$LibInfo);

    public static native boolean nativeLoadLibrary(String str, long j, Linker$LibInfo linker$LibInfo);

    public static native boolean nativeUseSharedRelro(String str, Linker$LibInfo linker$LibInfo);

    @Override // org.chromium.base.library_loader.d
    public final boolean e() {
        return false;
    }

    @Override // org.chromium.base.library_loader.d
    public final void f(int i, String str) {
        Linker$LibInfo linker$LibInfo;
        String mapLibraryName = System.mapLibraryName(str);
        Linker$LibInfo linker$LibInfo2 = this.b;
        if (!nativeLoadLibrary(mapLibraryName, linker$LibInfo2.mLoadAddress, linker$LibInfo2)) {
            String a = AbstractC4809e90.a("Unable to load library: ", mapLibraryName);
            AbstractC4851eH1.a("LegacyLinker", a, new Object[0]);
            throw new UnsatisfiedLinkError(a);
        }
        Linker$LibInfo linker$LibInfo3 = this.b;
        linker$LibInfo3.a = mapLibraryName;
        if (i == 1 || i == 0) {
            if (!nativeCreateSharedRelro(mapLibraryName, linker$LibInfo3.mLoadAddress, linker$LibInfo3)) {
                AbstractC4851eH1.f("LegacyLinker", "Could not create shared RELRO for %s at %x", mapLibraryName, Long.valueOf(this.b.mLoadAddress));
                this.b.mRelroFd = -1;
            }
            Linker$LibInfo linker$LibInfo4 = this.b;
            String str2 = linker$LibInfo4.a;
            if (!nativeUseSharedRelro(str2, linker$LibInfo4)) {
                AbstractC4851eH1.f("LegacyLinker", "Could not use shared RELRO section for %s", str2);
            }
            this.g = 2;
            return;
        }
        this.e = true;
        while (true) {
            linker$LibInfo = this.c;
            if (linker$LibInfo != null) {
                break;
            } else {
                try {
                    this.a.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        String str3 = linker$LibInfo.a;
        if (!nativeUseSharedRelro(str3, linker$LibInfo)) {
            AbstractC4851eH1.f("LegacyLinker", "Could not use shared RELRO section for %s", str3);
        }
        Linker$LibInfo linker$LibInfo5 = this.c;
        int i2 = linker$LibInfo5.mRelroFd;
        if (i2 >= 0) {
            AbstractC2663Um3.a(ParcelFileDescriptor.adoptFd(i2));
            linker$LibInfo5.mRelroFd = -1;
        }
        this.c = null;
        this.g = 3;
    }

    @Override // org.chromium.base.library_loader.d
    public final void g(String str) {
        d(0L, 2, true);
        synchronized (this.a) {
            nativeAddZipArchivePath(str);
        }
    }
}
