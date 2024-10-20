package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Po1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2021Po1 {
    public int b;
    public final InterfaceC1891Oo1 c;
    public final SparseArray a = new SparseArray();
    public HashMap d = new HashMap();

    public C2021Po1(G5 g5) {
        this.c = g5;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(android.app.PendingIntent r11, defpackage.InterfaceC4352cp4 r12, java.lang.Integer r13) {
        /*
            r10 = this;
            int r0 = r10.b
            int r8 = r0 + 1000
            r9 = 1
            int r0 = r0 + r9
            int r0 = r0 % 100
            r10.b = r0
            android.content.IntentSender r2 = r11.getIntentSender()
            Oo1 r11 = r10.c
            G5 r11 = (defpackage.G5) r11
            Oi1 r11 = r11.a
            java.lang.Object r11 = r11.get()
            r1 = r11
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 != 0) goto L1e
            goto L2b
        L1e:
            android.content.Intent r4 = new android.content.Intent     // Catch: android.content.IntentSender.SendIntentException -> L2b
            r4.<init>()     // Catch: android.content.IntentSender.SendIntentException -> L2b
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r8
            r1.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)     // Catch: android.content.IntentSender.SendIntentException -> L2b
            goto L2c
        L2b:
            r9 = 0
        L2c:
            if (r9 != 0) goto L30
            r11 = -1
            return r11
        L30:
            r10.c(r8, r12, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2021Po1.a(android.app.PendingIntent, cp4, java.lang.Integer):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(android.content.Intent r4, defpackage.InterfaceC4352cp4 r5, java.lang.Integer r6) {
        /*
            r3 = this;
            int r0 = r3.b
            int r1 = r0 + 1000
            r2 = 1
            int r0 = r0 + r2
            int r0 = r0 % 100
            r3.b = r0
            Oo1 r0 = r3.c
            G5 r0 = (defpackage.G5) r0
            Oi1 r0 = r0.a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L19
            goto L1d
        L19:
            r0.startActivityForResult(r4, r1)     // Catch: android.content.ActivityNotFoundException -> L1d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            if (r2 != 0) goto L22
            r4 = -1
            return r4
        L22:
            r3.c(r1, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2021Po1.b(android.content.Intent, cp4, java.lang.Integer):int");
    }

    public final void c(int i, InterfaceC4352cp4 interfaceC4352cp4, Integer num) {
        this.a.put(i, interfaceC4352cp4);
        this.d.put(Integer.valueOf(i), num == null ? null : V60.a.getString(num.intValue()));
    }
}
