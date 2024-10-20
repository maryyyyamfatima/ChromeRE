package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9772sd0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public C9772sd0(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public static C9772sd0 a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new C9772sd0((Integer) bundle.get("android.support.customtabs.extra.TOOLBAR_COLOR"), (Integer) bundle.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"));
    }
}
