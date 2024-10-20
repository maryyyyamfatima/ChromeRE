package defpackage;

import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W5 extends U5 {
    @Override // defpackage.U5
    public final Intent a(AbstractActivityC6817k00 abstractActivityC6817k00, Object obj) {
        Intent intent = (Intent) obj;
        AbstractC0087Ar1.e(abstractActivityC6817k00, "context");
        AbstractC0087Ar1.e(intent, "input");
        return intent;
    }

    @Override // defpackage.U5
    public final Object c(Intent intent, int i) {
        return new ActivityResult(intent, i);
    }
}
