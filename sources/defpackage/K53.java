package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K53 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View g;

    public K53(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.g = view;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        boolean canScrollVertically = this.a.canScrollVertically(-1);
        View view = this.g;
        if (!canScrollVertically) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }
}
