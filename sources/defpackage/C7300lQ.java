package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7300lQ implements InterfaceC2739Vc {
    public final Account b;

    public C7300lQ(C6956kQ c6956kQ) {
        this.b = c6956kQ.a;
    }

    @Override // defpackage.InterfaceC2739Vc
    public final Account a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7300lQ) {
            return V82.a(this.b, ((C7300lQ) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
