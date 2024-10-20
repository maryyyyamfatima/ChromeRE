package defpackage;

import android.database.DataSetObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11355xD1 extends DataSetObserver {
    public final /* synthetic */ BD1 a;

    public C11355xD1(BD1 bd1) {
        this.a = bd1;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        BD1 bd1 = this.a;
        if (bd1.a()) {
            bd1.b();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
