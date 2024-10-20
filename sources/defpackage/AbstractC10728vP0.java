package defpackage;

import android.os.UserManager;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10728vP0 {
    public static Boolean a;

    public static boolean a() {
        if (a == null) {
            a = Boolean.valueOf(AccountManagerFacadeProvider.getInstance().k());
        }
        return (a.booleanValue() && (((UserManager) V60.a.getSystemService("user")).getUserRestrictions().getBoolean("no_modify_accounts", false) ^ true)) || (B4.e(AccountManagerFacadeProvider.getInstance().a()).isEmpty() ^ true);
    }
}
