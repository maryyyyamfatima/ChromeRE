package org.chromium.chrome.browser.sharing.click_to_call;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractC2281Ro1;
import defpackage.C1226Jl0;
import defpackage.C4705dr2;
import defpackage.EI2;
import defpackage.R83;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClickToCallMessageHandler {
    public static void b(String str) {
        try {
            V60.a.startActivity(a(str));
            EI2.b("Sharing.ClickToCallDialerPresent", true);
        } catch (ActivityNotFoundException unused) {
            EI2.b("Sharing.ClickToCallDialerPresent", false);
            Context context = V60.a;
            R83.b(17, "ClickToCall", 12, null, null, null, null, context.getResources().getString(R.string.f70620_resource_name_obfuscated_res_0x7f14035c), context.getResources().getString(R.string.f70610_resource_name_obfuscated_res_0x7f14035b), R.drawable.f47500_resource_name_obfuscated_res_0x7f0901fb, R.drawable.f47300_resource_name_obfuscated_res_0x7f0901e6, R.color.f21820_resource_name_obfuscated_res_0x7f070559, false);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class TapReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ClickToCallMessageHandler.b(AbstractC2281Ro1.w(intent, "ClickToCallMessageHandler.EXTRA_PHONE_NUMBER"));
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class PhoneUnlockedReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean c;
            if (intent == null || !"android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                c = false;
            } else {
                c = i < 26 ? true : C1226Jl0.c(V60.a);
            }
            if (c) {
                R83.a(9, "ClickToCall");
            }
        }
    }

    public static Intent a(String str) {
        Intent intent;
        if (TextUtils.isEmpty(str)) {
            intent = new Intent("android.intent.action.DIAL");
        } else {
            intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
        }
        intent.addFlags(268435456);
        return intent;
    }

    public static void handleMessage(String str) {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i >= 29 ? false : i < 26 ? true : C1226Jl0.c(V60.a)) {
            b(str);
        }
        if (i < 29 && C1226Jl0.c(V60.a)) {
            z = false;
        }
        if (z) {
            Context context = V60.a;
            String decode = Uri.decode(str);
            Context context2 = V60.a;
            R83.b(17, "ClickToCall", 9, i >= 31 ? C4705dr2.a(context2, 0, a(str), 134217728) : C4705dr2.b(context2, 0, new Intent(context2, (Class<?>) TapReceiver.class).putExtra("ClickToCallMessageHandler.EXTRA_PHONE_NUMBER", str), 134217728, false), null, null, null, decode, context.getResources().getString(R.string.f70630_resource_name_obfuscated_res_0x7f14035d), R.drawable.f47280_resource_name_obfuscated_res_0x7f0901e4, R.drawable.f47290_resource_name_obfuscated_res_0x7f0901e5, R.color.f17700_resource_name_obfuscated_res_0x7f070112, true);
        }
    }
}
