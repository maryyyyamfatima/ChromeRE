package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class CE1 {
    public final InterfaceC11471xa2 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ G02 d;

    public void f() {
    }

    public boolean g(JA1 ja1) {
        return false;
    }

    public abstract boolean h();

    public CE1(G02 g02, InterfaceC11471xa2 interfaceC11471xa2) {
        this.d = g02;
        this.a = interfaceC11471xa2;
    }

    public final void e(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        G02 g02 = this.d;
        int i2 = g02.c;
        g02.c = i + i2;
        if (!g02.d) {
            g02.d = true;
            while (true) {
                try {
                    int i3 = g02.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    g02.d = false;
                }
            }
        }
        if (this.b) {
            g02.c(this);
        }
    }
}
