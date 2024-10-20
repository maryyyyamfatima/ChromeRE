package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class KD1 {
    public static C5874hF2 a(Bundle bundle) {
        if (!AbstractC2270Rm0.a(bundle, "purchaseDetails.itemId", String.class) || !AbstractC2270Rm0.a(bundle, "purchaseDetails.purchaseToken", String.class)) {
            return null;
        }
        C5874hF2 c5874hF2 = new C5874hF2(0);
        c5874hF2.b = bundle.getString("purchaseDetails.itemId");
        c5874hF2.c = bundle.getString("purchaseDetails.purchaseToken");
        return c5874hF2;
    }
}
