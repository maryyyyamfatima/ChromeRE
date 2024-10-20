package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EI0 {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("key_retrieval", 2L);
        a = feature;
        Feature feature2 = new Feature("list_recovered_security_domains", 1L);
        Feature feature3 = new Feature("start_recovery", 3L);
        b = feature3;
        Feature feature4 = new Feature("recoverability_fix", 2L);
        c = feature4;
        d = new Feature[]{feature, feature2, feature3, feature4, new Feature("lskf_consent", 1L), new Feature("reset_security_domain", 2L), new Feature("generate_open_vault_request", 1L)};
    }
}
