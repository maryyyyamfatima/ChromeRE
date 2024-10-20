package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11818yb0 implements Serializable {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[Catch: all -> 0x0063, TryCatch #1 {, blocks: (B:4:0x0006, B:8:0x002c, B:11:0x0032, B:16:0x0043, B:18:0x0047, B:21:0x0049, B:22:0x0050, B:23:0x0051, B:24:0x0053, B:31:0x0062, B:33:0x000c, B:37:0x001f, B:38:0x0012, B:26:0x0054, B:27:0x005f), top: B:3:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[Catch: all -> 0x0063, TryCatch #1 {, blocks: (B:4:0x0006, B:8:0x002c, B:11:0x0032, B:16:0x0043, B:18:0x0047, B:21:0x0049, B:22:0x0050, B:23:0x0051, B:24:0x0053, B:31:0x0062, B:33:0x000c, B:37:0x001f, B:38:0x0012, B:26:0x0054, B:27:0x005f), top: B:3:0x0006, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.TL2 a() {
        /*
            r8 = this;
            r0 = r8
            t82 r0 = (defpackage.C9957t82) r0
            byte[] r1 = r0.a
            monitor-enter(r1)
            F0 r2 = r0.h     // Catch: java.lang.Throwable -> L63
            r3 = 0
            if (r2 != 0) goto Lc
            goto L1d
        Lc:
            java.lang.Long r2 = r2.g     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L12
            r4 = r3
            goto L1b
        L12:
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L63
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> L63
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L63
        L1b:
            if (r4 != 0) goto L1f
        L1d:
            r2 = r3
            goto L2c
        L1f:
            long r4 = r4.getTime()     // Catch: java.lang.Throwable -> L63
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L63
            long r4 = r4 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L63
        L2c:
            TL2 r4 = r0.g     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L40
            if (r2 == 0) goto L3e
            long r4 = r2.longValue()     // Catch: java.lang.Throwable -> L63
            r6 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L3e
            goto L40
        L3e:
            r2 = 0
            goto L41
        L40:
            r2 = 1
        L41:
            if (r2 != 0) goto L51
            TL2 r0 = r0.g     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            return r0
        L49:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = "requestMetadata"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        L51:
            byte[] r2 = r0.a     // Catch: java.lang.Throwable -> L63
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L63
            r0.g = r3     // Catch: java.lang.Throwable -> L60
            r0.h = r3     // Catch: java.lang.Throwable -> L60
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11818yb0.a():TL2");
    }
}
