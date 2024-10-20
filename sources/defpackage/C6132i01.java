package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6132i01 {
    public static final C6132i01 d = new C6132i01();
    public Locale a = Locale.getDefault();
    public String b;
    public boolean c;

    public final Configuration a(Context context) {
        LocaleList locales;
        String languageTags;
        LocaleList forLanguageTags;
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        String str = this.b;
        if (Build.VERSION.SDK_INT < 24) {
            configuration.setLocale(Locale.forLanguageTag(str));
        } else {
            locales = context.getResources().getConfiguration().getLocales();
            languageTags = locales.toLanguageTags();
            forLanguageTags = LocaleList.forLanguageTags(String.format("%1$s,%2$s", str, languageTags.replaceFirst(String.format("(^|,)%1$s$|%1$s,", str), "")));
            configuration.setLocales(forLanguageTags);
        }
        return configuration;
    }
}
