package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tx3 */
/* loaded from: classes.dex */
public class C10237tx3 {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.F && (view instanceof C0639Ex3)) {
            C0639Ex3 c0639Ex3 = (C0639Ex3) view;
            View[] viewArr = {c0639Ex3.g, c0639Ex3.h, c0639Ex3.i};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view2 = viewArr[i3];
                if (view2 != null && view2.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                    i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                    z = true;
                }
            }
            int i4 = i - i2;
            View[] viewArr2 = {c0639Ex3.g, c0639Ex3.h, c0639Ex3.i};
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view3 = viewArr2[i7];
                if (view3 != null && view3.getVisibility() == 0) {
                    i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                    i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                    z2 = true;
                }
            }
            int i8 = i5 - i6;
            int a = (int) Ee4.a(c0639Ex3.getContext(), 24);
            if (i4 < a) {
                i4 = a;
            }
            int right = (c0639Ex3.getRight() + c0639Ex3.getLeft()) / 2;
            int bottom = (c0639Ex3.getBottom() + c0639Ex3.getTop()) / 2;
            int i9 = i4 / 2;
            return new RectF(right - i9, bottom - (i8 / 2), i9 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = a(tabLayout, view);
        RectF a2 = a(tabLayout, view2);
        drawable.setBounds(AbstractC0270Cc.b(f, (int) a.left, (int) a2.left), drawable.getBounds().top, AbstractC0270Cc.b(f, (int) a.right, (int) a2.right), drawable.getBounds().bottom);
    }
}
