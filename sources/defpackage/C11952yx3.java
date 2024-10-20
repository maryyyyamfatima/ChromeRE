package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11952yx3 extends DataSetObserver {
    public final /* synthetic */ TabLayout a;

    public C11952yx3(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.n();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.n();
    }
}
