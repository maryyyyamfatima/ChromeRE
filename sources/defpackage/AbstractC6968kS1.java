package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6968kS1 {
    public static Intent b(Uri uri, Uri uri2, String str, boolean z, Context context) {
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.f46950_resource_name_obfuscated_res_0x7f0901bf);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.f50220_resource_name_obfuscated_res_0x7f090317);
        C3140Ye0 c3140Ye0 = new C3140Ye0();
        c3140Ye0.b.a = -16777216;
        Intent intent = c3140Ye0.a;
        intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", decodeResource);
        c3140Ye0.d();
        c3140Ye0.b(AbstractC3899bX.e(context) ? 2 : 1);
        boolean z2 = false;
        if (z) {
            if (!(uri2.getScheme().equals("file") && Build.VERSION.SDK_INT >= 24)) {
                Intent createChooser = Intent.createChooser(a(uri2, str, null, null), null);
                createChooser.addFlags(268435456);
                String string = context.getString(R.string.f72630_resource_name_obfuscated_res_0x7f14042e);
                PendingIntent activity = PendingIntent.getActivity(context, 0, createChooser, AbstractC2281Ro1.d(true) | 268435456);
                if (c3140Ye0.c == null) {
                    c3140Ye0.c = new ArrayList();
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
                bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", activity);
                c3140Ye0.c.add(bundle);
            }
        }
        if (!(uri2.getScheme().equals("file") && Build.VERSION.SDK_INT >= 24)) {
            String str2 = TextUtils.isEmpty(str) ? "*/*" : str;
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.addFlags(268435456);
            intent2.addFlags(1);
            intent2.putExtra("android.intent.extra.STREAM", uri2);
            intent2.setType(str2);
            PendingIntent activity2 = PendingIntent.getActivity(context, 0, intent2, AbstractC2281Ro1.d(true) | 268435456);
            String string2 = context.getString(R.string.f86390_resource_name_obfuscated_res_0x7f140a19);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("android.support.customtabs.customaction.ID", 0);
            bundle2.putParcelable("android.support.customtabs.customaction.ICON", decodeResource2);
            bundle2.putString("android.support.customtabs.customaction.DESCRIPTION", string2);
            bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", activity2);
            intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle2);
            intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.toLowerCase(Locale.getDefault()).split("/");
            if (split.length == 2) {
                z2 = "image".equals(split[0]);
            }
        }
        int color = context.getColor(z2 ? R.color.f22270_resource_name_obfuscated_res_0x7f070595 : R.color.f24560_resource_name_obfuscated_res_0x7f07077f);
        C3270Ze0 a = c3140Ye0.a();
        String packageName = context.getPackageName();
        Intent intent3 = a.a;
        intent3.setPackage(packageName);
        intent3.setData(uri2);
        intent3.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_UI_TYPE", 1);
        intent3.putExtra("org.chromium.chrome.browser.customtabs.MEDIA_VIEWER_URL", uri.toString());
        intent3.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_ENABLE_EMBEDDED_MEDIA_EXPERIENCE", true);
        intent3.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_INITIAL_BACKGROUND_COLOR", color);
        intent3.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", color);
        intent3.putExtra("com.android.browser.application_id", context.getPackageName());
        AbstractC2281Ro1.a(intent3);
        intent3.addFlags(268435456);
        intent3.setClass(context, ChromeLauncherActivity.class);
        return intent3;
    }

    public static Intent a(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String normalizeMimeType = Intent.normalizeMimeType(str);
        if (TextUtils.isEmpty(normalizeMimeType)) {
            intent.setData(uri);
        } else {
            intent.setDataAndType(uri, normalizeMimeType);
        }
        intent.addFlags(1);
        intent.addFlags(2);
        intent.addFlags(268435456);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.ORIGINATING_URI", Uri.parse(str2));
        }
        if (str3 != null) {
            intent.putExtra("android.intent.extra.REFERRER", Uri.parse(str3));
        }
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:            if ((r0.hasRestrictionsProvider() || !r0.getApplicationRestrictions().isEmpty()) != false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c() {
        /*
            boolean r0 = org.chromium.base.SysUtils.isLowEndDevice()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 < r3) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != 0) goto L33
            android.content.Context r0 = defpackage.V60.a
            java.lang.String r3 = "restrictions"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.content.RestrictionsManager r0 = (android.content.RestrictionsManager) r0
            boolean r3 = r0.hasRestrictionsProvider()
            if (r3 != 0) goto L30
            android.os.Bundle r0 = r0.getApplicationRestrictions()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r0 = r2
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 == 0) goto L3e
        L33:
            nE r0 = defpackage.UN.a
            java.lang.String r0 = "HandleMediaIntents"
            boolean r0 = J.N.M09VlOh_(r0)
            if (r0 == 0) goto L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6968kS1.c():boolean");
    }
}
