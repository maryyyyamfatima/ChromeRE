package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.chrome.R;
import org.chromium.chrome.browser.signin.SyncConsentActivity;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xs3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3083Xs3 {
    public static C3083Xs3 a;

    public static C3083Xs3 a() {
        if (a == null) {
            a = new C3083Xs3();
        }
        return a;
    }

    public static boolean b(Context context, int i) {
        SigninManager a2 = AbstractC9966tA.a(C1202Jg1.a());
        if (a2.n()) {
            c(context, SyncConsentFragmentBase.N0(i, null));
            return true;
        }
        if (!a2.g()) {
            return false;
        }
        AbstractC4871eL1.e(context, R.string.f76690_resource_name_obfuscated_res_0x7f1405ef);
        return false;
    }

    public static void c(Context context, Bundle bundle) {
        int i = SyncConsentActivity.B;
        Intent intent = new Intent(context, (Class<?>) SyncConsentActivity.class);
        intent.putExtra("SigninActivity.FragmentArgs", bundle);
        context.startActivity(intent);
    }
}
