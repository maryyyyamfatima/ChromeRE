package org.chromium.base.library_loader;

import android.os.SystemClock;
import defpackage.C10321uC1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class d {
    public Linker$LibInfo b;
    public Linker$LibInfo c;
    public boolean e;
    public C10321uC1 f;
    public final Object a = new Object();
    public boolean d = true;
    public int g = 0;

    public void a(boolean z) {
    }

    public abstract boolean e();

    public abstract void f(int i, String str);

    public void g(String str) {
    }

    public final void d(long j, int i, boolean z) {
        synchronized (this.a) {
            if (this.g != 0) {
                return;
            }
            c(j, i, z);
            this.g = 1;
        }
    }

    public final void c(long j, int i, boolean z) {
        this.b = new Linker$LibInfo();
        this.d = z;
        b bVar = b.n;
        System.loadLibrary("chromium_android_linker");
        boolean e = e();
        if (i == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean nativeFindRegionReservedByWebViewZygote = LinkerJni.nativeFindRegionReservedByWebViewZygote(this.b);
            this.f = new C10321uC1(SystemClock.uptimeMillis() - uptimeMillis, nativeFindRegionReservedByWebViewZygote);
            if (nativeFindRegionReservedByWebViewZygote && (j == 0 || j == this.b.mLoadAddress)) {
                return;
            }
        } else if (i != 1) {
            if (i != 2) {
                return;
            }
            LinkerJni.nativeFindMemoryRegionAtRandomAddress(this.b, e);
        }
        Linker$LibInfo linker$LibInfo = this.b;
        linker$LibInfo.mLoadAddress = j;
        if (j != 0) {
            if (!e) {
                return;
            }
            LinkerJni.nativeReserveMemoryForLibrary(linker$LibInfo);
            if (this.b.mLoadAddress != 0) {
                return;
            }
        }
        LinkerJni.nativeFindMemoryRegionAtRandomAddress(this.b, e);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0001, B:8:0x0022, B:13:0x000a, B:15:0x000e, B:17:0x0013), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            r5.f(r6, r7)     // Catch: java.lang.Throwable -> L28
            boolean r6 = r5.e     // Catch: java.lang.Throwable -> L28
            r7 = 1
            if (r6 == 0) goto La
            goto L1f
        La:
            org.chromium.base.library_loader.Linker$LibInfo r6 = r5.c     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L1f
            int r6 = r5.g     // Catch: java.lang.Throwable -> L28
            r1 = 3
            if (r6 != r1) goto L1f
            org.chromium.base.library_loader.Linker$LibInfo r6 = r5.b     // Catch: java.lang.Throwable -> L28
            long r1 = r6.mLoadAddress     // Catch: java.lang.Throwable -> L28
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1f
            r6 = r7
            goto L20
        L1f:
            r6 = r0
        L20:
            if (r6 == 0) goto L25
            r5.a(r7)     // Catch: java.lang.Throwable -> L28
        L25:
            r5.e = r0
            return
        L28:
            r6 = move-exception
            r5.e = r0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.library_loader.d.b(int, java.lang.String):void");
    }
}
