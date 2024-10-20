package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WF implements UF {
    public static final C0488Dt2 a;
    public static final C0098At2 b;
    public static final C0098At2 c;

    static {
        C0748Ft2 c0748Ft2 = new C0748Ft2(null, AbstractC5405ft2.a("com.google.android.gms.auth_account"), "", "", false, true, true, false, null);
        try {
            a = AbstractC0878Gt2.a(new VF(), c0748Ft2, C9409rZ3.k, "CapabilityFeatures__blocked_packages_for_connectionless", true);
            c0748Ft2.a("CapabilityFeatures__debug_capability", false);
            c0748Ft2.a("CapabilityFeatures__enable_capability", false);
            c0748Ft2.a("CapabilityFeatures__enable_fetch_capabilities_in_get_accounts", false);
            c0748Ft2.a("CapabilityFeatures__enable_force_sync", true);
            c0748Ft2.a("CapabilityFeatures__enable_force_sync_for_unknown_capability", true);
            c0748Ft2.a("CapabilityFeatures__enable_logging_capability_app_visibility", true);
            b = c0748Ft2.a("CapabilityFeatures__enable_logging_capability_latency", false);
            c0748Ft2.a("CapabilityFeatures__enforce_app_visibility_restrictions", true);
            c0748Ft2.a("CapabilityFeatures__update_seed_capability_alias_in_account_sync", false);
            c = c0748Ft2.a("CapabilityFeatures__use_connectionless", false);
            c0748Ft2.a("CapabilityFeatures__use_gaia_service_flags", true);
            c0748Ft2.c("CapabilityFeatures__visibility_not_restricted_logging_sample_fractions", 0.01d);
            c0748Ft2.c("CapabilityFeatures__visibility_restricted_logging_sample_fractions", 1.0d);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}
