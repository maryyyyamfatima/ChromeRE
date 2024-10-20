package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gM3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5566gM3 extends RecyclerView {
    public final /* synthetic */ C6940kM3 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5566gM3(C6940kM3 c6940kM3, Context context) {
        super(context, null);
        this.P0 = c6940kM3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n0(null);
        C6940kM3 c6940kM3 = this.P0;
        n0(c6940kM3.c);
        c6940kM3.e.a();
    }
}
