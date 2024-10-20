package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FH3 extends DH3 {
    public static final FH3 b = new FH3();

    public FH3() {
        super(null);
    }

    @Override // defpackage.DH3
    public final boolean a() {
        Locale locale = Locale.getDefault();
        int i = CJ3.a;
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }
}
