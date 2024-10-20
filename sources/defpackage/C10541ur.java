package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ur, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10541ur extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ AbstractC11227wr g;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.g.a.b(this.a);
    }

    public C10541ur(AbstractC11227wr abstractC11227wr, String str) {
        this.g = abstractC11227wr;
        this.a = str;
    }
}
