package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ContentInfo$Builder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7879n50 implements InterfaceC8223o50 {
    public final ContentInfo$Builder a;

    public C7879n50(ClipData clipData, int i) {
        this.a = new ContentInfo$Builder(clipData, i);
    }

    @Override // defpackage.InterfaceC8223o50
    public final void b(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.InterfaceC8223o50
    public final void a(Uri uri) {
        this.a.setLinkUri(uri);
    }

    @Override // defpackage.InterfaceC8223o50
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.InterfaceC8223o50
    public final C10966w50 build() {
        ContentInfo build;
        build = this.a.build();
        return new C10966w50(new C9937t50(build));
    }
}
