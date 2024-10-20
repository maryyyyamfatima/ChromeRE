package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sC2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9636sC2 {
    public final int a;
    public final Drawable b;
    public final int c;
    public final Point d;
    public final int e;

    public C9636sC2(Context context, int i) {
        Resources resources = context.getResources();
        this.a = i;
        this.b = AbstractC2884Wf.a(context, i);
        this.c = resources.getDimensionPixelSize(R.dimen.f28470_resource_name_obfuscated_res_0x7f08008b);
        this.d = new Point(resources.getDimensionPixelOffset(R.dimen.f28450_resource_name_obfuscated_res_0x7f080089), resources.getDimensionPixelOffset(R.dimen.f28460_resource_name_obfuscated_res_0x7f08008a));
        this.e = resources.getDimensionPixelSize(R.dimen.f28440_resource_name_obfuscated_res_0x7f080088);
    }
}
