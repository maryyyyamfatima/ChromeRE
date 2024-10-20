package defpackage;

import java.io.PrintWriter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L10 extends J10 {
    public final PrintWriter a;

    public L10(PrintWriter printWriter) {
        this.a = printWriter;
    }

    @Override // defpackage.J10
    public final void a(String str) {
        this.a.println((Object) str);
    }
}
