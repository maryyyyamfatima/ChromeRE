package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XG implements InterfaceC2999Xc {
    public final CastDevice b;
    public final YG c;
    public final Bundle d;
    public final String e = UUID.randomUUID().toString();

    public XG(WG wg) {
        this.b = wg.a;
        this.c = wg.b;
        this.d = wg.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:            if (r1 == r3) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.XG
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            XG r8 = (defpackage.XG) r8
            com.google.android.gms.cast.CastDevice r1 = r8.b
            com.google.android.gms.cast.CastDevice r3 = r7.b
            boolean r1 = defpackage.W82.a(r3, r1)
            if (r1 == 0) goto L6a
            android.os.Bundle r1 = r7.d
            android.os.Bundle r3 = r8.d
            if (r1 == 0) goto L58
            if (r3 != 0) goto L1f
            goto L58
        L1f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L2a
            goto L5c
        L2a:
            java.util.Set r4 = r1.keySet()
            java.util.Set r5 = r3.keySet()
            boolean r5 = r4.containsAll(r5)
            if (r5 != 0) goto L39
            goto L5c
        L39:
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.get(r5)
            java.lang.Object r5 = r3.get(r5)
            boolean r5 = defpackage.W82.a(r6, r5)
            if (r5 != 0) goto L3d
            goto L5c
        L58:
            if (r1 != r3) goto L5c
        L5a:
            r1 = r0
            goto L5d
        L5c:
            r1 = r2
        L5d:
            if (r1 == 0) goto L6a
            java.lang.String r1 = r7.e
            java.lang.String r8 = r8.e
            boolean r8 = defpackage.W82.a(r1, r8)
            if (r8 == 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XG.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, 0, this.e});
    }
}
