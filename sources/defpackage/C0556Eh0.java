package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eh0 */
/* loaded from: classes.dex */
public final class C0556Eh0 extends RecyclerView {
    public int P0;
    public final /* synthetic */ C1336Kh0 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0556Eh0(C1336Kh0 c1336Kh0, Context context) {
        super(context, null);
        this.Q0 = c1336Kh0;
        this.P0 = 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1336Kh0 c1336Kh0 = this.Q0;
        c1336Kh0.k.c();
        int i = configuration.orientation;
        if (i == this.P0) {
            return;
        }
        this.P0 = i;
        c1336Kh0.i.R();
    }
}
