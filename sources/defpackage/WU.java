package defpackage;

import android.content.ClipData;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class WU extends AbstractC0185Bl {
    public final /* synthetic */ Uri h;
    public final /* synthetic */ XU i;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return ClipData.newUri(V60.a.getContentResolver(), "image", this.h);
    }

    public WU(XU xu, Uri uri) {
        this.i = xu;
        this.h = uri;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        XU xu = this.i;
        xu.m((ClipData) obj);
        long j = xu.j();
        QU qu = xu.e;
        Uri uri = this.h;
        if (qu != null) {
            T60.a.edit().putString("Chrome.Clipboard.SharedUri", uri.toString()).putLong("Chrome.Clipboard.SharedUriTimestamp", j).apply();
        } else {
            xu.f = new PU(uri, j);
        }
    }
}
