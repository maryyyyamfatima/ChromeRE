package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import org.chromium.base.SysUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZN3 {
    public static int c;
    public final Toast a;
    public final FrameLayout b;

    public ZN3(Context context, TextView textView) {
        if (SysUtils.isLowEndDevice()) {
            this.b = new FrameLayout(new XN3(context));
        }
        Toast c2 = C9225r04.d().c(context);
        this.a = c2;
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            if (textView != null) {
                frameLayout.addView(textView, -2, -2);
                c2.setView(frameLayout);
            } else {
                c2.setView(null);
            }
        } else {
            c2.setView(textView);
        }
        c2.setGravity(c2.getGravity(), c2.getXOffset(), c2.getYOffset() + c);
    }

    public final void d() {
        this.a.show();
    }

    public final void a() {
        this.a.cancel();
    }

    public static ZN3 c(Context context, CharSequence charSequence, int i) {
        YN3 yn3 = new YN3(context);
        yn3.b = charSequence;
        yn3.f = i;
        return yn3.a();
    }

    public static ZN3 b(int i, int i2, Context context) {
        YN3 yn3 = new YN3(context);
        yn3.b = context.getResources().getText(i);
        yn3.f = i2;
        return yn3.a();
    }

    public static boolean e(Context context, View view, CharSequence charSequence) {
        YN3 yn3 = new YN3(context);
        yn3.c = view;
        yn3.b = charSequence;
        if (charSequence == null) {
            return false;
        }
        yn3.a().d();
        return true;
    }
}
