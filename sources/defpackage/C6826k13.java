package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k13, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6826k13 implements ZC1 {
    public final /* synthetic */ C4738dx a;

    public C6826k13(C4738dx c4738dx) {
        this.a = c4738dx;
    }

    @Override // defpackage.ZC1
    public final TC1 b() {
        return this.a;
    }

    @Override // defpackage.ZC1
    public final LI2 a(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4 = new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(view);
        viewTreeObserverOnGlobalLayoutListenerC8754pe4.d(true);
        viewTreeObserverOnGlobalLayoutListenerC8754pe4.e(new Rect(0, 0, 0, 0));
        return viewTreeObserverOnGlobalLayoutListenerC8754pe4;
    }
}
