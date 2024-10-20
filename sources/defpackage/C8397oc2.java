package defpackage;

import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8397oc2 extends FK2 {
    public C8397oc2() {
        d(0, 20);
        d(1, 1);
        d(2, 1);
        d(3, 5);
        d(4, 15);
        d(5, 1);
        d(6, 4);
        d(7, 1);
        d(8, 3);
    }

    @Override // defpackage.FK2
    public final d b(int i) {
        d b = super.b(i);
        EI2.b("Android.Omnibox.SuggestionView.Reused", b != null);
        if (b == null) {
            EI2.h(i, 9, "Android.Omnibox.SuggestionView.CreatedType");
        } else {
            EI2.h(i, 9, "Android.Omnibox.SuggestionView.ReusedType");
        }
        return b;
    }
}
