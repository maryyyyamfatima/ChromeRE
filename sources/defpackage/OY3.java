package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OY3 extends View {
    public final /* synthetic */ QY3 a;

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.b.c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OY3(QY3 qy3, Context context) {
        super(context);
        this.a = qy3;
    }
}
