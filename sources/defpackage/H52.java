package defpackage;

import android.content.Context;
import android.view.Display;
import com.google.vr.cardboard.DisplaySynchronizer;
import org.chromium.device.vr.NonPresentingGvrContext;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class H52 extends DisplaySynchronizer {
    public final /* synthetic */ NonPresentingGvrContext m;

    @Override // com.google.vr.cardboard.DisplaySynchronizer
    public final void c() {
        b();
        this.m.a.refreshDisplayMetrics();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H52(NonPresentingGvrContext nonPresentingGvrContext, Context context, Display display) {
        super(context, display);
        this.m = nonPresentingGvrContext;
    }
}
