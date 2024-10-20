package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8566p50 implements InterfaceC8223o50 {
    public final ClipData a;
    public final int b;
    public int c;
    public Uri d;
    public Bundle e;

    public C8566p50(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.InterfaceC8223o50
    public final void b(int i) {
        this.c = i;
    }

    @Override // defpackage.InterfaceC8223o50
    public final void a(Uri uri) {
        this.d = uri;
    }

    @Override // defpackage.InterfaceC8223o50
    public final void setExtras(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.InterfaceC8223o50
    public final C10966w50 build() {
        return new C10966w50(new C10623v50(this));
    }
}
