package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7255lH implements QP2 {
    public final Status a;
    public final ApplicationMetadata g;
    public final String h;
    public final String i;
    public final boolean j;

    public C7255lH(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.a = status;
        this.g = applicationMetadata;
        this.h = str;
        this.i = str2;
        this.j = z;
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.a;
    }
}
