package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1644Mr extends ClickableSpan {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ C9902sz1 g;

    public C1644Mr(Callback callback, C9902sz1 c9902sz1) {
        this.a = callback;
        this.g = c9902sz1;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onResult(this.g.c);
    }
}
