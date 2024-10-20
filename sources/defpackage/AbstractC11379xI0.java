package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11379xI0 {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature("kids", 6L);
        Feature feature2 = new Feature("kids_dashboard", 2L);
        Feature feature3 = new Feature("kids_transparency", 1L);
        Feature feature4 = new Feature("kids_get_parent_verification_intent", 3L);
        a = feature4;
        b = new Feature[]{feature, feature2, feature3, feature4, new Feature("kids_screentime_restriction_callback", 2L)};
    }
}
