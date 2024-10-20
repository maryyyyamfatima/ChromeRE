package defpackage;

import J.N;
import android.content.Context;
import java.security.PrivateKey;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iT2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6288iT2 extends AbstractC0185Bl {
    public byte[][] h;
    public PrivateKey i;
    public final long j;
    public final Context k;
    public final String l;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Object obj2 = ThreadUtils.a;
        N.M8LmNuWo(this.j, this.h, this.i);
    }

    public C6288iT2(long j, Context context, String str) {
        this.j = j;
        this.k = context;
        this.l = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            r11 = this;
            java.lang.String r0 = "'certificate"
            java.lang.String r1 = "InterruptedException when looking for '"
            java.lang.String r2 = "' certificate"
            java.lang.String r3 = "KeyChainException when looking for '"
            android.content.Context r4 = r11.k
            java.lang.String r5 = "SSLClientCertRequest"
            r6 = 0
            java.lang.String r7 = r11.l
            if (r7 != 0) goto L13
            goto L81
        L13:
            r8 = 0
            java.security.PrivateKey r9 = android.security.KeyChain.getPrivateKey(r4, r7)     // Catch: java.lang.InterruptedException -> L19 android.security.KeyChainException -> L23
            goto L2d
        L19:
            java.lang.String r9 = defpackage.AbstractC4199cO1.a(r1, r7, r0)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            defpackage.AbstractC4851eH1.f(r5, r9, r10)
            goto L2c
        L23:
            java.lang.String r9 = defpackage.AbstractC4199cO1.a(r3, r7, r2)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            defpackage.AbstractC4851eH1.f(r5, r9, r10)
        L2c:
            r9 = r6
        L2d:
            java.security.cert.X509Certificate[] r0 = android.security.KeyChain.getCertificateChain(r4, r7)     // Catch: java.lang.InterruptedException -> L32 android.security.KeyChainException -> L3c
            goto L46
        L32:
            java.lang.String r0 = defpackage.AbstractC4199cO1.a(r1, r7, r0)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            defpackage.AbstractC4851eH1.f(r5, r0, r1)
            goto L45
        L3c:
            java.lang.String r0 = defpackage.AbstractC4199cO1.a(r3, r7, r2)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            defpackage.AbstractC4851eH1.f(r5, r0, r1)
        L45:
            r0 = r6
        L46:
            if (r9 == 0) goto L7a
            if (r0 == 0) goto L7a
            int r1 = r0.length
            if (r1 != 0) goto L4e
            goto L7a
        L4e:
            int r1 = r0.length
            byte[][] r1 = new byte[r1]
            r2 = r8
        L52:
            int r3 = r0.length     // Catch: java.security.cert.CertificateEncodingException -> L65
            if (r2 >= r3) goto L60
            r3 = r0[r2]     // Catch: java.security.cert.CertificateEncodingException -> L65
            byte[] r3 = r3.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L65
            r1[r2] = r3     // Catch: java.security.cert.CertificateEncodingException -> L65
            int r2 = r2 + 1
            goto L52
        L60:
            r11.h = r1
            r11.i = r9
            goto L81
        L65:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not retrieve encoded certificate chain: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            defpackage.AbstractC4851eH1.f(r5, r0, r1)
            goto L81
        L7a:
            java.lang.String r0 = "Empty client certificate chain?"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            defpackage.AbstractC4851eH1.f(r5, r0, r1)
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6288iT2.b():java.lang.Object");
    }
}
