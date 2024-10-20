package defpackage;

import android.util.Base64;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YY0 implements XY0 {
    public static final C0488Dt2 a;
    public static final C0098At2 b;
    public static final C0098At2 c;

    static {
        C0748Ft2 c0748Ft2 = new C0748Ft2(null, AbstractC5405ft2.a("com.google.android.gms.auth_account"), "", "", true, false, true, false, null);
        c0748Ft2.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        c0748Ft2.a("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        c0748Ft2.b(20L, "getTokenRefactor__account_manager_timeout_seconds");
        c0748Ft2.b(0L, "getTokenRefactor__android_id_shift");
        c0748Ft2.a("getTokenRefactor__authenticator_logic_improved", false);
        try {
            byte[] decode = Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3);
            C9409rZ3 c9409rZ3 = C9409rZ3.k;
            int length = decode.length;
            XF0 c2 = XF0.c();
            C9409rZ3 c9409rZ32 = C9409rZ3.k;
            C9409rZ3 c9409rZ33 = new C9409rZ3();
            try {
                try {
                    QW2 a2 = C7931nE2.c.a(c9409rZ33);
                    a2.f(c9409rZ33, decode, 0, length + 0, new C2254Rj(c2));
                    a2.b(c9409rZ33);
                    if (c9409rZ33.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c9409rZ33);
                    a = AbstractC0878Gt2.a(new VF(), c0748Ft2, c9409rZ33, "getTokenRefactor__blocked_packages", true);
                    c0748Ft2.a("getTokenRefactor__chimera_get_token_evolved", true);
                    c0748Ft2.b(20L, "getTokenRefactor__clear_token_timeout_seconds");
                    c0748Ft2.b(20L, "getTokenRefactor__default_task_timeout_seconds");
                    b = c0748Ft2.a("getTokenRefactor__gaul_accounts_api_evolved", false);
                    c = c0748Ft2.a("getTokenRefactor__gaul_token_api_evolved", false);
                    c0748Ft2.b(120L, "getTokenRefactor__get_token_timeout_seconds");
                    c0748Ft2.a("getTokenRefactor__gms_account_authenticator_evolved", true);
                    c0748Ft2.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (Exception e4) {
            throw new AssertionError(e4);
        }
    }
}
