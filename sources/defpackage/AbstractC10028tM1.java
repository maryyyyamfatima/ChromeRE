package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10028tM1 {
    public static C5490g8 a(ContextThemeWrapper contextThemeWrapper) {
        if (Build.VERSION.SDK_INT >= 31) {
            return new C6252iM1(new ContextThemeWrapper(contextThemeWrapper, R.style.f99120_resource_name_obfuscated_res_0x7f1502e5));
        }
        return new C5490g8(contextThemeWrapper, R.style.f99030_resource_name_obfuscated_res_0x7f1502dc);
    }
}
