package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MU2 implements QP2 {
    public final String a;
    public final Status g;

    public MU2(Status status, String str) {
        this.a = str;
        this.g = status;
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.g;
    }
}
