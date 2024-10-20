package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6534jA1 {
    public final Bundle a;

    public C6534jA1(Bundle bundle) {
        this.a = bundle;
    }

    public final C2596Tz1 a() {
        Bundle bundle = (Bundle) this.a.getParcelable("lens_result");
        if (bundle == null) {
            return null;
        }
        return new C2596Tz1(bundle);
    }
}
