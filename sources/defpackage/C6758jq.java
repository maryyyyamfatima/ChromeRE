package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jq */
/* loaded from: classes.dex */
public final /* synthetic */ class C6758jq implements BV0 {
    @Override // defpackage.BV0
    public final Object apply(Object obj) {
        Intent intent;
        Activity activity = (Activity) obj;
        boolean z = false;
        if (activity != null && (intent = activity.getIntent()) != null && C1761No1.c(intent) == 11) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
