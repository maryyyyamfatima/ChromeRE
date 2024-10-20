package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B13 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C8545p13 a;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ Context h;

    public B13(Context context, TextView textView, C8545p13 c8545p13) {
        this.a = c8545p13;
        this.g = textView;
        this.h = context;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C8545p13 c8545p13 = this.a;
        C4733dw0 c = c8545p13.c();
        TextView textView = this.g;
        if (c != null) {
            textView.removeOnLayoutChangeListener(this);
            return;
        }
        Layout layout = textView.getLayout();
        if (layout.getEllipsisCount(0) > 0) {
            textView.setText(C13.a(this.h, c8545p13, layout, textView.getPaint()));
        }
    }
}
