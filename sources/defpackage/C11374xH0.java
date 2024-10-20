package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xH0 */
/* loaded from: classes.dex */
public final class C11374xH0 extends C10237tx3 {
    @Override // defpackage.C10237tx3
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float a;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF a2 = C10237tx3.a(tabLayout, view);
        if (f < 0.5f) {
            a = AbstractC0270Cc.a(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            a = AbstractC0270Cc.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a2.left, drawable.getBounds().top, (int) a2.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a * 255.0f));
    }
}
