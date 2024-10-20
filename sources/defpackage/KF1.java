package defpackage;

import android.text.TextUtils;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KF1 implements Callback {
    public final int a;
    public final String g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Boolean bool = (Boolean) obj;
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        Q83 q83 = O83.a;
        if (bool.booleanValue()) {
            q83.n("LocaleManager_SHOULD_REPING_RLZ_FOR_SEARCH_PROMO_KEYWORD");
        } else {
            q83.r(this.a, "LocaleManager_SHOULD_REPING_RLZ_FOR_SEARCH_PROMO_KEYWORD");
        }
    }

    public KF1(int i, String str) {
        this.a = i;
        this.g = str;
    }
}
