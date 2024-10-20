package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC8915q60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ DialogC9943t60 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        final DialogC9943t60 dialogC9943t60 = this.a;
        boolean z = dialogC9943t60.h;
        Rect rect = dialogC9943t60.q;
        if (!z) {
            if (view.getMeasuredHeight() == 0) {
                return;
            }
            Rect rect2 = new Rect();
            dialogC9943t60.a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            float f = rect2.left;
            float f2 = rect2.top;
            int[] iArr = new int[2];
            View view2 = dialogC9943t60.g;
            view2.getLocationOnScreen(iArr);
            dialogC9943t60.l = iArr[1];
            dialogC9943t60.j = (rect.centerX() - iArr[0]) + f;
            float centerY = (rect.centerY() - iArr[1]) + f2;
            dialogC9943t60.k = centerY;
            view2.startAnimation(DialogC9943t60.b(dialogC9943t60.j, centerY, true));
            view.removeOnLayoutChangeListener(this);
            dialogC9943t60.o = null;
            return;
        }
        if (view.getMeasuredHeight() == 0) {
            return;
        }
        T8 t8 = dialogC9943t60.m;
        if (t8 != null && t8.c()) {
            dialogC9943t60.dismiss();
            return;
        }
        T8 t82 = new T8(dialogC9943t60.a, dialogC9943t60.n, new ColorDrawable(0), dialogC9943t60.g, new LI2(rect));
        dialogC9943t60.m = t82;
        Integer num = dialogC9943t60.t;
        if (num != null) {
            t82.r = num.intValue();
        }
        Integer num2 = dialogC9943t60.u;
        if (num2 != null) {
            dialogC9943t60.m.t = num2.intValue();
        }
        T8 t83 = dialogC9943t60.m;
        t83.A = true;
        t83.x = true;
        t83.k.setOutsideTouchable(false);
        H1 h1 = dialogC9943t60.w;
        if (h1 != null && h1.d()) {
            dialogC9943t60.m.k.setFocusable(true);
        }
        dialogC9943t60.m.a(new PopupWindow.OnDismissListener() { // from class: p60
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                DialogC9943t60.this.dismiss();
            }
        });
        dialogC9943t60.m.e();
    }

    public ViewOnLayoutChangeListenerC8915q60(DialogC9943t60 dialogC9943t60) {
        this.a = dialogC9943t60;
    }
}
