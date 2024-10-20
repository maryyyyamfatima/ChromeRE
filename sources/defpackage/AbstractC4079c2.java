package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4079c2 {
    public final C1661Mu1 a;
    public final DK2 b;

    public abstract C4766e2 a();

    public AbstractC4079c2(String str, Drawable drawable, String str2, String str3, int i, int i2, Y1 y1) {
        this.a = new C1661Mu1(str, drawable, str2, str3, i, i2, this);
        this.b = y1;
    }

    public void b(ViewGroup viewGroup) {
        RecyclerView recyclerView = (RecyclerView) viewGroup;
        recyclerView.getContext();
        recyclerView.q0(new LinearLayoutManager(1, false));
        recyclerView.p0(null);
        DK2 dk2 = this.b;
        if (dk2 != null) {
            recyclerView.i(dk2);
        }
    }
}
