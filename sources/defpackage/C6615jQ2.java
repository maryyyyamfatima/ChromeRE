package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jQ2 */
/* loaded from: classes.dex */
public final class C6615jQ2 extends ContentObserver {
    public final /* synthetic */ C7991nQ2 a;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C7991nQ2 c7991nQ2 = this.a;
        c7991nQ2.getClass();
        T60.a.getString("com.google.android.apps.chrome.rlz.RLZ_STRING", null);
        new C7303lQ2(c7991nQ2).c(AbstractC0185Bl.e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6615jQ2(C7991nQ2 c7991nQ2, Handler handler) {
        super(handler);
        this.a = c7991nQ2;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }
}
