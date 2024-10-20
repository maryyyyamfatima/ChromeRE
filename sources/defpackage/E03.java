package defpackage;

import android.app.Activity;
import android.view.MenuItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class E03 implements S03 {
    public final /* synthetic */ MenuItem a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ F03 c;

    @Override // defpackage.S03
    public final void a() {
    }

    @Override // defpackage.S03
    public final void onQueryTextChange(String str) {
        G03.d(this.a, str, this.b);
        this.c.onQueryTextChange(str);
    }

    public E03(MenuItem menuItem, Activity activity, F03 f03) {
        this.a = menuItem;
        this.b = activity;
        this.c = f03;
    }
}
