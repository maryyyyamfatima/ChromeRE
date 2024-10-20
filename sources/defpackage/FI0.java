package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class FI0 {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("client_side_logging", 1L);
        Feature feature2 = new Feature("cxless_client_minimal", 1L);
        a = feature2;
        Feature feature3 = new Feature("cxless_caf_control", 1L);
        Feature feature4 = new Feature("module_flag_control", 1L);
        b = feature4;
        Feature feature5 = new Feature("discovery_hint_supply", 1L);
        Feature feature6 = new Feature("relay_casting_set_active_account", 1L);
        Feature feature7 = new Feature("analytics_proto_enum_translation", 1L);
        Feature feature8 = new Feature("integer_to_integer_map", 1L);
        c = feature8;
        Feature feature9 = new Feature("relay_casting_set_remote_casting_mode", 1L);
        Feature feature10 = new Feature("get_relay_access_token", 1L);
        Feature feature11 = new Feature("get_cast_settings", 1L);
        Feature feature12 = new Feature("set_bundle_setting", 1L);
        Feature feature13 = new Feature("get_client_updated_info", 1L);
        d = feature13;
        e = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, feature11, feature12, feature13};
    }
}
