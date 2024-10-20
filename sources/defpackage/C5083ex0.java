package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ex0 */
/* loaded from: classes.dex */
public final class C5083ex0 extends C10237tx3 {
    @Override // defpackage.C10237tx3
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float cos;
        float f2;
        RectF a = C10237tx3.a(tabLayout, view);
        RectF a2 = C10237tx3.a(tabLayout, view2);
        if (!(a.left < a2.left)) {
            double d = (f * 3.141592653589793d) / 2.0d;
            float sin = (float) Math.sin(d);
            cos = (float) (1.0d - Math.cos(d));
            f2 = sin;
        } else {
            double d2 = (f * 3.141592653589793d) / 2.0d;
            f2 = (float) (1.0d - Math.cos(d2));
            cos = (float) Math.sin(d2);
        }
        drawable.setBounds(AbstractC0270Cc.b(f2, (int) a.left, (int) a2.left), drawable.getBounds().top, AbstractC0270Cc.b(cos, (int) a.right, (int) a2.right), drawable.getBounds().bottom);
    }
}
