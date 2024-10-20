package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I44 {
    public final Bundle a = new Bundle();

    public final OR a() {
        Bundle bundle = (Bundle) this.a.getParcelable("chrome_user_context");
        if (bundle == null) {
            return null;
        }
        return new OR(bundle);
    }
}
