package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ce0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4282ce0 extends AbstractC1649Ms {
    public final /* synthetic */ C5313fe0 h;

    public C4282ce0(C5313fe0 c5313fe0) {
        this.h = c5313fe0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C5313fe0 c5313fe0 = this.h;
        File file = new File(c5313fe0.n(), c5313fe0.d());
        if (!file.exists()) {
            return null;
        }
        if (c5313fe0.b) {
            if (file.setLastModified(System.currentTimeMillis())) {
                return null;
            }
            AbstractC4851eH1.a("tabmodel", TM0.a("Unable to update last modified time: ", file), new Object[0]);
            return null;
        }
        if (file.delete()) {
            return null;
        }
        AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete file: ", file), new Object[0]);
        return null;
    }
}
