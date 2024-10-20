package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import org.chromium.chrome.browser.vr.VrShell;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ti4 extends PopupWindow {
    public FrameLayout a;
    public final InterfaceC10149ti4 b;
    public final Context c;
    public int d;
    public int e;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
    }

    @Override // android.widget.PopupWindow
    public final boolean isShowing() {
        return false;
    }

    @Override // android.widget.PopupWindow
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
    }

    public Ti4(Context context, VrShell vrShell) {
        super(context);
        this.c = context;
        this.b = vrShell;
        N.MC$C6Gne(vrShell.A, vrShell, true);
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        AbstractC8540p04.i(contentView);
        FrameLayout frameLayout = new FrameLayout(this.c);
        this.a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(this.d, this.e));
        this.a.setBackgroundDrawable(getBackground());
        this.a.addView(contentView, layoutParams);
        FrameLayout frameLayout2 = this.a;
        VrShell vrShell = (VrShell) this.b;
        vrShell.getClass();
        if (frameLayout2 == null) {
            vrShell.a(this.d, this.e);
            throw null;
        }
        throw null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        showAtLocation(view, 0, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void update(int i, int i2, int i3, int i4) {
        this.d = i3;
        this.e = i4;
        FrameLayout frameLayout = this.a;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i3, i4));
        }
        VrShell vrShell = (VrShell) this.b;
        vrShell.d(i, i2);
        N.MBxhpfBq(vrShell.A, vrShell, i3, i4);
        N.M8SZtGP4(vrShell.A, vrShell, i3, i4);
    }
}
