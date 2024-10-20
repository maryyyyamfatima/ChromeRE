package org.chromium.base.library_loader;

import android.os.SystemClock;
import defpackage.AbstractC4851eH1;
import defpackage.EI2;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e extends d {
    @Override // org.chromium.base.library_loader.d
    public final boolean e() {
        return true;
    }

    public static String h() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/cgroup")));
            String str = null;
            do {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    int indexOf = readLine.indexOf(":blkio:");
                    str = indexOf == -1 ? "" : readLine.substring(indexOf + 7);
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
            } while (str.equals(""));
            if (str != null) {
                if (!str.equals("")) {
                    if (str.equals("/")) {
                        return "Foreground";
                    }
                    if (str.equals("/background")) {
                        return "Background";
                    }
                    AbstractC4851eH1.a("ModernLinker", "blkio cgroup with unexpected name: '%s'", str);
                    return "Unknown";
                }
            }
            bufferedReader.close();
            return "Unknown";
        } catch (IOException unused2) {
            AbstractC4851eH1.a("ModernLinker", "IOException while reading %s", "/proc/self/cgroup");
            return "Unknown";
        }
    }

    @Override // org.chromium.base.library_loader.d
    public final void f(int i, String str) {
        boolean z;
        if (!"monochrome".equals(str)) {
            AbstractC4851eH1.d("ModernLinker", "loadLibraryImplLocked: %s, relroMode=%d", str, Integer.valueOf(i));
        }
        String h = h();
        long uptimeMillis = SystemClock.uptimeMillis();
        String mapLibraryName = System.mapLibraryName(str);
        if (i == 0) {
            this.g = 3;
            z = false;
        } else {
            if (i == 1) {
                Linker$LibInfo linker$LibInfo = this.b;
                linker$LibInfo.a = mapLibraryName;
                if (!ModernLinkerJni.nativeLoadLibrary(mapLibraryName, linker$LibInfo, true)) {
                    AbstractC4851eH1.a("ModernLinker", "Unable to load with ModernLinker, using the system linker instead", new Object[0]);
                    this.b.mRelroFd = -1;
                }
                EI2.b("ChromiumAndroidLinker.RelroProvidedSuccessfully", this.b.mRelroFd != -1);
                this.g = 2;
            } else {
                if (!ModernLinkerJni.nativeLoadLibrary(mapLibraryName, this.b, false)) {
                    String format = String.format("Unable to load library: %s", mapLibraryName);
                    this.g = 1;
                    AbstractC4851eH1.a("ModernLinker", format, new Object[0]);
                    throw new UnsatisfiedLinkError(format);
                }
                this.g = 3;
            }
            z = true;
        }
        String h2 = h();
        if (!h.equals(h2)) {
            h = (h.equals("Unknown") || h2.equals("Unknown")) ? "Unknown" : "Mixed";
        }
        if (z) {
            String str2 = i == 1 ? "Produce" : "Consume";
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            EI2.n(uptimeMillis2, "ChromiumAndroidLinker.ModernLinkerDetailedLoadTime.".concat(str2));
            EI2.n(uptimeMillis2, "ChromiumAndroidLinker.ModernLinkerDetailedLoadTimeByBlkioCgroup." + str2 + "." + h);
        }
        long uptimeMillis3 = SystemClock.uptimeMillis();
        try {
            System.loadLibrary(str);
            String str3 = z ? "Second" : "NoSharing";
            long uptimeMillis4 = SystemClock.uptimeMillis() - uptimeMillis3;
            EI2.n(uptimeMillis4, "ChromiumAndroidLinker.ModernLinkerDetailedLoadTime.".concat(str3));
            EI2.n(uptimeMillis4, "ChromiumAndroidLinker.ModernLinkerDetailedLoadTimeByBlkioCgroup." + str3 + "." + h);
        } catch (UnsatisfiedLinkError unused) {
            this.g = 1;
            AbstractC4851eH1.a("ModernLinker", "Failed at System.loadLibrary()", new Object[0]);
            throw new UnsatisfiedLinkError("Failed at System.loadLibrary()");
        }
    }

    @Override // org.chromium.base.library_loader.d
    public final void a(boolean z) {
        Linker$LibInfo linker$LibInfo;
        Linker$LibInfo linker$LibInfo2 = this.c;
        if (linker$LibInfo2.mRelroFd == -1 || (linker$LibInfo = this.b) == null) {
            return;
        }
        ModernLinkerJni.nativeUseRelros(linker$LibInfo.mLoadAddress, linker$LibInfo2);
        EI2.b("ChromiumAndroidLinker.RelroAvailableImmediately", z);
        EI2.h(ModernLinkerJni.nativeGetRelroSharingResult(), 9, "ChromiumAndroidLinker.RelroSharingStatus2");
    }
}
