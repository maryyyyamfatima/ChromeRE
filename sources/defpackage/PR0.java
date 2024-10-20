package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PR0 extends ContentObserver {
    public final /* synthetic */ RR0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PR0(RR0 rr0, Handler handler) {
        super(handler);
        this.a = rr0;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b();
    }
}
