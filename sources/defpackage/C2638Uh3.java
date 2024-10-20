package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2638Uh3 {
    public final ArrayList a;
    public final ArrayList b;

    public /* synthetic */ C2638Uh3(C2508Th3 c2508Th3) {
        this.a = new ArrayList(c2508Th3.a);
        this.b = new ArrayList(c2508Th3.b);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
