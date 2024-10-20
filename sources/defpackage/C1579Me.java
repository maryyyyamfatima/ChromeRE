package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Me */
/* loaded from: classes.dex */
public final class C1579Me implements InterfaceC11483xc2 {
    public final /* synthetic */ AppBarLayout a;

    public C1579Me(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.InterfaceC11483xc2
    public final C5389fq4 a(View view, C5389fq4 c5389fq4) {
        AppBarLayout appBarLayout = this.a;
        appBarLayout.getClass();
        WeakHashMap weakHashMap = Ec4.a;
        C5389fq4 c5389fq42 = appBarLayout.getFitsSystemWindows() ? c5389fq4 : null;
        if (!Objects.equals(appBarLayout.l, c5389fq42)) {
            appBarLayout.l = c5389fq42;
            appBarLayout.setWillNotDraw(!(appBarLayout.v != null && appBarLayout.e() > 0));
            appBarLayout.requestLayout();
        }
        return c5389fq4;
    }
}
