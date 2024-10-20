package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class P91 {
    public static Spanned a(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT < 24) {
            return Html.fromHtml(str);
        }
        fromHtml = Html.fromHtml(str, 0);
        return fromHtml;
    }
}
