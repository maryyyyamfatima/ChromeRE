package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mf3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC1588Mf3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C1978Pf3 a;

    public ViewOnLayoutChangeListenerC1588Mf3(C1978Pf3 c1978Pf3) {
        this.a = c1978Pf3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1978Pf3 c1978Pf3 = this.a;
        ViewGroup viewGroup = c1978Pf3.j;
        Rect rect = c1978Pf3.m;
        viewGroup.getWindowVisibleDisplayFrame(rect);
        Rect rect2 = c1978Pf3.n;
        if (rect.equals(rect2)) {
            return;
        }
        rect2.set(rect);
        ViewGroup viewGroup2 = c1978Pf3.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
        int i9 = layoutParams.bottomMargin;
        int i10 = layoutParams.width;
        int i11 = layoutParams.gravity;
        layoutParams.bottomMargin = c1978Pf3.c();
        if (c1978Pf3.h) {
            layoutParams.width = Math.min(c1978Pf3.j.getResources().getDimensionPixelSize(R.dimen.f40400_resource_name_obfuscated_res_0x7f08073e), c1978Pf3.j.getWidth() - (c1978Pf3.j.getResources().getDimensionPixelSize(R.dimen.f40360_resource_name_obfuscated_res_0x7f08073a) * 2));
            layoutParams.gravity = 81;
        }
        if (i9 == layoutParams.bottomMargin && i10 == layoutParams.width && i11 == layoutParams.gravity) {
            return;
        }
        viewGroup2.setLayoutParams(layoutParams);
    }
}
