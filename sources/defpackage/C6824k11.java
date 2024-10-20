package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6824k11 {
    public void a(String str, Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://myaccount.google.com/activitycontrols/search"));
        intent.putExtra("com.android.browser.application_id", activity.getPackageName());
        intent.putExtra("create_new_tab", true);
        intent.setPackage(activity.getPackageName());
        activity.startActivity(intent);
    }
}
