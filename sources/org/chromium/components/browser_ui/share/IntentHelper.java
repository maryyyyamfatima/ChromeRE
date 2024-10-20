package org.chromium.components.browser_ui.share;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import defpackage.V60;
import java.io.File;
import org.chromium.base.ContentUriUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class IntentHelper {
    public static void sendEmail(String str, String str2, String str3, String str4, String str5) {
        Uri fromFile;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        }
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(str3));
        if (!TextUtils.isEmpty(str5)) {
            File file = new File(str5);
            try {
                fromFile = ContentUriUtils.b(file);
            } catch (IllegalArgumentException unused) {
                fromFile = Uri.fromFile(file);
            }
            intent.putExtra("android.intent.extra.STREAM", fromFile);
        }
        try {
            Intent createChooser = Intent.createChooser(intent, str4);
            createChooser.addFlags(268435456);
            V60.a.startActivity(createChooser);
        } catch (ActivityNotFoundException unused2) {
        }
    }
}
