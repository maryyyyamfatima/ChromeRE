package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H73 extends DK2 {
    public boolean a;
    public final String g;

    public H73(String str) {
        this.g = str;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        if (!this.a && i == 1) {
            FI2.a(this.g);
            this.a = true;
        }
    }
}
