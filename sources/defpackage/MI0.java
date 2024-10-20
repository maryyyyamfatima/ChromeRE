package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MI0 {
    public static final Feature a = new Feature("account_capability_api", 1);
    public static final Feature b;
    public static final Feature c;

    static {
        new Feature("account_data_service", 6L);
        new Feature("account_data_service_legacy", 1L);
        new Feature("account_data_service_token", 7L);
        new Feature("account_data_service_visibility", 1L);
        new Feature("config_sync", 1L);
        new Feature("device_account_api", 1L);
        new Feature("gaiaid_primary_email_api", 1L);
        b = new Feature("google_auth_service_accounts", 2L);
        c = new Feature("google_auth_service_token", 3L);
        new Feature("hub_mode_api", 1L);
        new Feature("work_account_client_is_whitelisted", 1L);
    }
}
