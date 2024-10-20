package defpackage;

import android.database.ContentObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V20 extends ContentObserver {
    public final /* synthetic */ W20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V20(W20 w20) {
        super(null);
        this.a = w20;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.d();
    }
}
