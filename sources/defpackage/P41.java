package defpackage;

import android.util.LogPrinter;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class P41 {
    public int a;
    public int b;
    public int c;

    public P41() {
        c();
    }

    public void c() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 2;
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            LogPrinter logPrinter = GridLayout.n;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }

    public int a(GridLayout gridLayout, View view, J41 j41, int i, boolean z) {
        return this.a - j41.a(view, i, gridLayout.getLayoutMode());
    }

    public final String toString() {
        return "Bounds{before=" + this.a + ", after=" + this.b + '}';
    }
}
