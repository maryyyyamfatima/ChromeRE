package defpackage;

import android.content.Context;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iV */
/* loaded from: classes.dex */
public abstract class AbstractC6295iV {
    public static void a(Context context, C8385oa2 c8385oa2, Runnable runnable, boolean z) {
        ZX1 zx1 = (ZX1) c8385oa2.g;
        C5951hV c5951hV = new C5951hV(runnable, zx1, z);
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, c5951hV);
        bd2.e(AbstractC4249cY1.c, context.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f140368 : R.string.0_resource_name_obfuscated_res_0x7f140367));
        bd2.e(AbstractC4249cY1.f, context.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f140366 : R.string.0_resource_name_obfuscated_res_0x7f140365));
        bd2.e(AbstractC4249cY1.j, context.getString(R.string.0_resource_name_obfuscated_res_0x7f14061e));
        bd2.e(AbstractC4249cY1.n, context.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4));
        bd2.b(AbstractC4249cY1.r, true);
        bd2.c(AbstractC4249cY1.v, 1);
        zx1.l(bd2.a(), 1, true);
    }
}
