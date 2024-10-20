package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qe */
/* loaded from: classes.dex */
public final class C2099Qe implements S1 {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.Behavior e;

    public C2099Qe(AppBarLayout.Behavior behavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = behavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = i;
    }

    @Override // defpackage.S1
    public final boolean a(View view) {
        this.e.x(this.a, this.b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}
