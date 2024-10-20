package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC11824yc0 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = view.getResources().getDisplayMetrics().widthPixels;
        int i2 = view.getResources().getDisplayMetrics().heightPixels;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = view.getWidth();
        ZN3 c = ZN3.c(view.getContext(), view.getContentDescription(), 0);
        c.a.setGravity(8388693, (i - iArr[0]) - (width / 2), i2 - iArr[1]);
        c.d();
        return true;
    }
}
