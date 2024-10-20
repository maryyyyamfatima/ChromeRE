package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8799pm1 {
    public final InterfaceC8456om1 a;

    public C8799pm1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new C7768mm1(uri, clipDescription, uri2);
        } else {
            this.a = new C8112nm1(uri, clipDescription, uri2);
        }
    }

    public C8799pm1(C7768mm1 c7768mm1) {
        this.a = c7768mm1;
    }
}
