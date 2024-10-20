package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qA2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8941qA2 {
    public static void a(Activity activity, String str) {
        Objects.requireNonNull(activity);
        if (str == null || str.isEmpty()) {
            b(activity);
            return;
        }
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str).putExtra("extra.screenId", 500);
        if (putExtra.resolveActivity(activity.getPackageManager()) == null) {
            b(activity);
        } else {
            activity.startActivityForResult(putExtra, 0);
        }
    }

    public static void b(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Integer valueOf = Integer.valueOf(Color.parseColor("#eeeeee") | (-16777216));
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            Bundle bundle2 = new Bundle();
            if (valueOf != null) {
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
            }
            intent.putExtras(bundle2);
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent.setData(Uri.parse("https://www.google.com/policies/privacy/"));
            Object obj = Y50.a;
            context.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
            throw new KC();
        }
    }
}
