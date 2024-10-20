package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5382fp3 {
    public final Drawable a;
    public boolean b;
    public boolean c;
    public boolean d;

    public C5382fp3(Drawable drawable) {
        this.a = drawable;
    }

    public static C5382fp3 b(Context context, Bitmap bitmap) {
        return new C5382fp3(new BitmapDrawable(context.getResources(), bitmap));
    }

    public static C5382fp3 c(Context context, int i) {
        return new C5382fp3(AbstractC2884Wf.a(context, i));
    }

    public final C5726gp3 a() {
        return new C5726gp3(this.a, this.c, this.d, this.b);
    }
}
