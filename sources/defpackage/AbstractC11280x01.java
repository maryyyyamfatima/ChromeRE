package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11280x01 extends BaseGmsClient implements InterfaceC3129Yc, InterfaceC11623y01 {
    public final Set D;
    public final Account E;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void h() {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public Feature[] k() {
        return new Feature[0];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC11280x01(android.content.Context r9, android.os.Looper r10, int r11, defpackage.JU r12, defpackage.C30 r13, defpackage.InterfaceC1962Pc2 r14) {
        /*
            r8 = this;
            D01 r3 = defpackage.D01.b(r9)
            java.lang.Object r0 = defpackage.C8543p11.c
            r0 = 0
            if (r13 != 0) goto Lb
            r5 = r0
            goto L11
        Lb:
            v01 r1 = new v01
            r1.<init>(r13)
            r5 = r1
        L11:
            if (r14 != 0) goto L15
            r6 = r0
            goto L1b
        L15:
            w01 r13 = new w01
            r13.<init>(r14)
            r6 = r13
        L1b:
            java.lang.String r7 = r12.g
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.accounts.Account r9 = r12.a
            r8.E = r9
            java.util.Set r9 = r12.c
            java.util.Iterator r10 = r9.iterator()
        L2e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L49
            java.lang.Object r11 = r10.next()
            com.google.android.gms.common.api.Scope r11 = (com.google.android.gms.common.api.Scope) r11
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L41
            goto L2e
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Expanding scopes is not permitted, use implied scopes instead"
            r9.<init>(r10)
            throw r9
        L49:
            r8.D = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11280x01.<init>(android.content.Context, android.os.Looper, int, JU, C30, Pc2):void");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account f() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set l() {
        return this.D;
    }
}
