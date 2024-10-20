package defpackage;

import android.os.Bundle;
import android.util.Base64;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yt */
/* loaded from: classes2.dex */
public final class C11925yt implements IF3 {
    public String a;
    public final Bundle b;
    public final int c;
    public final boolean d;

    public C11925yt(int i, Bundle bundle, boolean z) {
        this.b = bundle;
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.IF3
    public final void a(FF3 ff3) {
        C7432ln3 c = C7432ln3.c();
        try {
            C5615gW2 c5615gW2 = (C5615gW2) C8365oW2.o.j();
            if (c5615gW2.h) {
                c5615gW2.l();
                c5615gW2.h = false;
            }
            C8365oW2 c8365oW2 = (C8365oW2) c5615gW2.g;
            c8365oW2.getClass();
            c8365oW2.j = AbstractC8021nW2.a(1);
            this.a = Base64.encodeToString(((C8365oW2) c5615gW2.j()).toByteArray(), 0);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:            if (r6 != 2) goto L737;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d7  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [int] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection, java.util.ArrayList] */
    @Override // defpackage.IF3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.DF3 r17) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11925yt.b(DF3):void");
    }

    @Override // defpackage.IF3
    public final void c(HF3 hf3) {
        C5615gW2 c5615gW2 = (C5615gW2) C8365oW2.o.j();
        if (c5615gW2.h) {
            c5615gW2.l();
            c5615gW2.h = false;
        }
        C8365oW2 c8365oW2 = (C8365oW2) c5615gW2.g;
        c8365oW2.getClass();
        c8365oW2.j = AbstractC8021nW2.a(2);
        this.a = Base64.encodeToString(((C8365oW2) c5615gW2.j()).toByteArray(), 0);
    }
}
