package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DI0 {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        Feature feature2 = new Feature("sms_code_browser", 2L);
        a = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        Feature feature4 = new Feature("user_consent", 3L);
        b = feature4;
        c = new Feature[]{feature, feature2, feature3, feature4};
    }
}
