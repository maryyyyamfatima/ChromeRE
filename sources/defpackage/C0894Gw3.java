package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894Gw3 {
    public final LinkedHashSet a = new LinkedHashSet();
    public int b = -1;
    public final int c;
    public final /* synthetic */ C1024Hw3 d;

    public C0894Gw3(C1024Hw3 c1024Hw3, int i) {
        this.d = c1024Hw3;
        this.c = i;
    }

    public final void a(int i) {
        this.a.add(Integer.valueOf(i));
        if (this.b == -1) {
            this.b = i;
        }
        if (c() > 1) {
            this.d.g0(this.c);
        }
    }

    public final int c() {
        return this.a.size();
    }

    public final List b() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }
}
