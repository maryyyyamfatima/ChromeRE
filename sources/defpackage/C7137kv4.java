package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7137kv4 implements Sv4 {
    public final /* synthetic */ C9541rv4 a;

    public C7137kv4(C9541rv4 c9541rv4) {
        this.a = c9541rv4;
    }

    @Override // defpackage.Sv4
    public final void a(C4737dw4 c4737dw4, File file, boolean z) {
        C9541rv4 c9541rv4 = this.a;
        c9541rv4.b.add(file);
        if (z) {
            return;
        }
        c9541rv4.c.set(false);
    }
}
