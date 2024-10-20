package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Re */
/* loaded from: classes.dex */
public final class C2229Re implements S1 {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public C2229Re(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.S1
    public final boolean a(View view) {
        AppBarLayout appBarLayout = this.a;
        appBarLayout.getClass();
        WeakHashMap weakHashMap = Ec4.a;
        appBarLayout.i(this.b, appBarLayout.isLaidOut(), true);
        return true;
    }
}
