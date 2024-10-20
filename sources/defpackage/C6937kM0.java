package defpackage;

import android.util.Pair;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6937kM0 implements Callback {
    public final /* synthetic */ Callback a;

    public /* synthetic */ C6937kM0(Callback callback) {
        this.a = callback;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Pair pair = (Pair) obj;
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        String str = (String) pair.second;
        Callback callback = this.a;
        if (booleanValue || str == null) {
            callback.onResult(Boolean.valueOf(booleanValue));
        } else {
            callback.onResult(Boolean.FALSE);
        }
    }
}
