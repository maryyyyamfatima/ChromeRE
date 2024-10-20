package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10198tr extends ClickableSpan {
    public final /* synthetic */ AbstractC11227wr a;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a.b("https://myaccount.google.com/");
    }

    public C10198tr(AbstractC11227wr abstractC11227wr) {
        this.a = abstractC11227wr;
    }
}
