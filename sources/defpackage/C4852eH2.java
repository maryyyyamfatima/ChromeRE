package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4852eH2 extends DynamicDrawableSpan {
    public final Context a;
    public final int g;

    public C4852eH2(Context context, int i) {
        this.a = context;
        this.g = i;
    }

    @Override // android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        int i;
        Context context = this.a;
        Resources resources = context.getResources();
        int i2 = this.g;
        if (i2 == 0) {
            i = R.drawable.f50100_resource_name_obfuscated_res_0x7f09030b;
        } else if (i2 == 1) {
            i = R.drawable.f50090_resource_name_obfuscated_res_0x7f09030a;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("RatingStarType value is invalid.");
            }
            i = R.drawable.f50080_resource_name_obfuscated_res_0x7f090309;
        }
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = GP2.a;
        Drawable drawable = resources.getDrawable(i, theme);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        return drawable;
    }
}
