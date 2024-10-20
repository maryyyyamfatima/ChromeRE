package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GU2 implements CU2 {
    public final Status a;
    public final String g;

    public GU2(Status status, SafeBrowsingData safeBrowsingData) {
        this.a = status;
        this.g = null;
        if (safeBrowsingData != null) {
            this.g = safeBrowsingData.a;
        } else if (status.r1()) {
            this.a = new Status(8, null, 0);
        }
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.a;
    }

    @Override // defpackage.CU2
    public final String c() {
        return this.g;
    }
}
