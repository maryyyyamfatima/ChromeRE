package defpackage;

import android.net.Uri;
import java.io.File;
import org.chromium.base.ContentUriUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4457d73 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ C4800e73 i;

    public C4457d73(C4800e73 c4800e73, String str) {
        this.i = c4800e73;
        this.h = str;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.i.a.onResult((Uri) obj);
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return ContentUriUtils.b(new File(this.h));
    }
}
