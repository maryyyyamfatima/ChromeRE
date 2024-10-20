package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3055Xn0 {
    public final String a;
    public ArrayList b;
    public ArrayList c;

    public C3055Xn0(String str) {
        this.a = str;
    }

    public final void a(String str, int i, boolean z) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new C3315Zn0(str, i, z));
    }

    public final void b() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new C3315Zn0("success", 1, true));
    }
}
