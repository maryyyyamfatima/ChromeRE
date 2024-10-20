package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HM1 implements HZ3 {
    public final AbstractC9896sy0 a;

    public HM1(AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
    }

    @Override // defpackage.HZ3
    public final Typeface a(Context context, String str) {
        Typeface c;
        int i;
        if (!str.startsWith("google-sans") || (c = c(context, str)) == null) {
            return null;
        }
        if (str.endsWith("-bold")) {
            i = 1;
        } else if (str.endsWith("-italic")) {
            i = 2;
        } else {
            i = str.endsWith("-bold-italic") ? 3 : 0;
        }
        return Typeface.create(c, i);
    }

    @Override // defpackage.HZ3
    public final Typeface b(int i, Context context, String str, boolean z) {
        String str2;
        Typeface create;
        if (!str.startsWith("google-sans")) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Typeface c = c(context, str);
            if (c == null) {
                return null;
            }
            create = Typeface.create(c, i, z);
            return create;
        }
        if (i > 500) {
            str2 = str.concat(z ? "-bold-italic" : "-bold");
        } else {
            if (z) {
                str = str.concat("-italic");
            }
            str2 = str;
        }
        return a(context, str2);
    }

    public final Typeface c(Context context, String str) {
        int i;
        EnumC11438xU enumC11438xU = EnumC11438xU.r;
        AbstractC9896sy0 abstractC9896sy0 = this.a;
        try {
            if (str.startsWith("google-sans-text-medium")) {
                i = R.font.f54350_resource_name_obfuscated_res_0x7f0a0010;
            } else if (str.startsWith("google-sans-text")) {
                i = R.font.f54340_resource_name_obfuscated_res_0x7f0a000c;
            } else {
                i = str.startsWith("google-sans-medium") ? R.font.f54330_resource_name_obfuscated_res_0x7f0a000a : R.font.f54310_resource_name_obfuscated_res_0x7f0a0005;
            }
            return GP2.b(context, i);
        } catch (Resources.NotFoundException e) {
            abstractC9896sy0.b(enumC11438xU, String.format("Font not found: %s. For steps to resolve this error, please refer to go/elements-android-fonts#heading=h.n4awqg1rbygf.", str), e);
            return null;
        } catch (RuntimeException e2) {
            abstractC9896sy0.b(enumC11438xU, "Failed to load font: " + str, e2);
            return null;
        }
    }
}
