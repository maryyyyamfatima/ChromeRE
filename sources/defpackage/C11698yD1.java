package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11698yD1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ BD1 a;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            BD1 bd1 = this.a;
            if ((bd1.E.getInputMethodMode() == 2) || bd1.E.getContentView() == null) {
                return;
            }
            Handler handler = bd1.A;
            AD1 ad1 = bd1.w;
            handler.removeCallbacks(ad1);
            ad1.run();
        }
    }

    public C11698yD1(BD1 bd1) {
        this.a = bd1;
    }
}
