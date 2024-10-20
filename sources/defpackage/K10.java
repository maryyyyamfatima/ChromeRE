package defpackage;

import java.io.PrintStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K10 extends J10 {
    public final PrintStream a;

    public K10(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.J10
    public final void a(String str) {
        this.a.println((Object) str);
    }
}
