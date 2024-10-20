package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.android.chrome.R;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QZ2 {
    public static QZ2 c;
    public static Bitmap d;
    public static String e;
    public static int f;
    public static int g;
    public WH0 a;
    public C6964kR2 b;

    public static void d(int i) {
        EI2.h(i, 6, "AndroidSearchEngineLogo.Events");
    }

    public static QZ2 a() {
        Object obj = ThreadUtils.a;
        if (c == null) {
            RC.a();
            c = new QZ2();
        }
        return c;
    }

    public static int b(Resources resources) {
        if (f == 0) {
            f = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080620);
        }
        return f;
    }

    public static C1748Nl3 c(int i) {
        return new C1748Nl3(R.drawable.0_resource_name_obfuscated_res_0x7f090312, AbstractC3494aK3.d(i));
    }
}
