package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4416d04 extends FrameLayout {
    public Configuration a;
    public final /* synthetic */ C4759e04 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4416d04(C4759e04 c4759e04, Context context) {
        super(context);
        this.g = c4759e04;
        this.a = new Configuration(context.getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.g.a.getResources().getConfiguration());
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration);
    }

    public final void a(Configuration configuration) {
        int diff = configuration.diff(this.a);
        if ((diff & 4096) == 0 && (diff & 128) == 0) {
            return;
        }
        this.a = new Configuration(configuration);
        C4759e04 c4759e04 = this.g;
        c4759e04.c(c4759e04.s);
    }
}
